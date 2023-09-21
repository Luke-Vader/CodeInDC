package com.rishabh.firsttry.Entities;

import com.rishabh.firsttry.Repositories.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Repo {
    List<Customer> list = new ArrayList<>();

    public ArrayList<Customer> initialData(){

        Customer c = new Customer();

        c.setEmail("johndoe@gmail.com");
        c.setName("John Doe");

        list.add(c);
        return (ArrayList<Customer>) list;
    }
}
