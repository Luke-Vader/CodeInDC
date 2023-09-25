package com.rishabh.firsttry.Web;

import com.rishabh.firsttry.Entities.Repo;
import com.rishabh.firsttry.Repositories.Customer;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SessionAttributes({"id"})
@Controller
@AllArgsConstructor
public class CustomerController {

    @Autowired
    private Repo rr;
    List<Customer> customerList;

    @GetMapping(path = "/")
    public String InitialPage(Model model){
        customerList = rr.initialData();
        model.addAttribute("customers", customerList);
        model.addAttribute("customer", new Customer());
        return "Main";
    }

    @GetMapping(path = "/Main")
    public String indexPage(Model model){
        System.out.println("Triggered Main, listSize = " + customerList.size());
        model.addAttribute("customers", customerList);
        model.addAttribute("customer", new Customer());
        return "Main";
    }

    @PostMapping(path = "/empInsert")
    public String AddCustomer(Model model, Customer customer, HttpSession session, ModelMap mm){
        String em;
        String sessionEmail = (String) session.getAttribute("id");
        System.out.println("Session Email: " + sessionEmail);
        if (sessionEmail == null){
            customerList.add(customer);
            model.addAttribute("customers", customerList);
            System.out.println("Added Customer: " + customer.getName()
                            + "|" + customer.getEmail());
            return "redirect:Main";
        }

        //this section is only activated when the session email is not null.
        boolean flag = false;
        for (int i = 0; i < customerList.size(); i++) {
            em = customerList.get(i).getEmail();
            if (sessionEmail.equals(em)){
                customerList.remove(i);
                customerList.add(customer);
                flag = true;
                break;
            }
        }
        mm.put("id", null);
        session.removeAttribute("id");
        return "redirect:Main";
    }

    @GetMapping(path = "/editCustomer")
    public String editCustomer(Model model,
                               Customer customer,
                               String id,
                               HttpSession session,
                               ModelMap mm){
        System.out.println("Edit Customer Triggered " + id);
        mm.put("id", id);
            if (findByEmail(customerList, id) != null){
                model.addAttribute("customer", findByEmail(customerList, id));
                model.addAttribute("customers", customerList);
            }
        return "Main";
    }

    @GetMapping(path = "/deleteCustomer")
    public String deleteCustomer(Model model,
                                 Customer customer,
                                 String id,
                                 HttpSession session,
                                 ModelMap mm) {
        System.out.println("Deleting Customer " + id);
        mm.put("id", id);
        customerList.remove(findByEmail(customerList, id));
        mm.put("id", null);
        session.removeAttribute("id");
        return "redirect:Main";
    }

    //method to find customer by their email id and return the Customer object
    public static Customer findByEmail(Collection<Customer> list, String email) {
        return list.stream().filter(customer -> email.equals(customer.getEmail())).findFirst().orElse(null);
    }

}
