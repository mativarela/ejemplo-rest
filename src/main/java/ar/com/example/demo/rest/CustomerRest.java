package ar.com.example.demo.rest;

import ar.com.example.demo.model.Customer;
import ar.com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRest{

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Iterable<Customer> getAll(){
        return customerRepository.findAll();

    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Customer insert(@RequestBody Customer customer){
        return customerRepository.save(customer);

    }
}
