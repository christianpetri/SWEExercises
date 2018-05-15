package code.vom.juventus.github.src.exceptions;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    private List<Customer> customers;

    public CustomerService() {
        this.customers = new ArrayList<>();
        this.customers.add(new Customer(0, "Linda"));
        this.customers.add(new Customer(1, "Alexandra"));
        this.customers.add(new Customer(2, "Albrik"));
    }

    public Customer findCustomerById(int id) throws CustomerNotFoundException {
        for(Customer customer : this.customers) {
            if(customer.getId() == id) {
                return customer;
            }
        }
        throw new CustomerNotFoundException("Could not find customer with id " + id, id);
    }
}
