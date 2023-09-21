package com.rishabh.intellijexercise1.Web;

import com.rishabh.intellijexercise1.Entities.Customer;
import com.rishabh.intellijexercise1.Repositories.Repo;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@SessionAttributes({"id"})
@Controller
@AllArgsConstructor

public class CustomerController {

    @Autowired
    private Repo rr;
    List<Customer> xx;

    @GetMapping(path="/")
    public  String InitialPage(Model model){

        xx = rr.initialData();
        model.addAttribute("customers", xx);
        model.addAttribute("customer", new Customer());

        return "Main";
    }

    @PostMapping(path = "/empInsert")
    public String AddCustomers(Model model, Customer customer, HttpSession session, ModelMap mm){
        String em;
        String email = (String) session.getAttribute("id");

        if (email == null){
            xx.add(customer);
            model.addAttribute("customers", xx);
            return "redirect:Main";
        }

        boolean flag = false;
        for (int x = 0; x < xx.size(); x++) {
            em = xx.get(x).getCemail();
            if (email.equals(em)){
                xx.remove(x);
                xx.add(customer);
                flag = true;
                break;
            }
        }

        mm.put("id", null);
        session.removeAttribute("id");
        return "redirect:Main";
    }

}