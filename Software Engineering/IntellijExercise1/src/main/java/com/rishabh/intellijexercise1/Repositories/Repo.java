package com.rishabh.intellijexercise1.Repositories;

import com.rishabh.intellijexercise1.Entities.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Repo {

    List<Customer> list1 = new ArrayList<>();

    public ArrayList<Customer> initialData() {
        Customer cc, dd;

        cc = new Customer();
        cc.setCname("Joe");
        cc.setCemail("joe@yahoo.com");

        list1.add(cc);

        return (ArrayList<Customer>) list1;
    }

}
