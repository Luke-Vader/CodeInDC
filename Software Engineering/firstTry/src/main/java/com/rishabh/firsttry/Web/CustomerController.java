package com.rishabh.firsttry.Web;

import com.rishabh.firsttry.Entities.Repo;
import com.rishabh.firsttry.Repositories.Customer;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class CustomerController {

    @Autowired
    private Repo rr;
    List<Customer> xx;

    @GetMapping(path = "/")
    public String InitialPage(Model model){
        xx = rr.initialData();
        model.addAttribute("customers", xx);
        model.addAttribute("customer", new Customer());

        return "Main";
    }

}
