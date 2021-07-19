package com.dws.customerservice.service;

import java.util.List;

import com.dws.customerservice.dto.Customer;
import com.dws.customerservice.dto.RespuestaApi;
import com.dws.customerservice.repository.CustomerRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImp implements CustomerService{
    @Autowired
    CustomerRespository customerRespository;

    @Override
    public RespuestaApi createCustomer(Customer customer) {
        return customerRespository.createCustomer(customer);
    }

    @Override
    public RespuestaApi deleteCustomer(int id) {
        return customerRespository.deleteCustomer(id);
    }

    @Override
    public Customer getCustomer(int id) {
        return customerRespository.getCustomer(id);
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRespository.getCustomers();
    }

    @Override
    public RespuestaApi updateCustomer(Customer customer, int id) {
        return customerRespository.updateCustomer(customer, id);
    }
    
}
