package code.vom.juventus.github.src.exceptions;


public class Main {

    public static void main(String [ ] args) {

        CustomerService customerService = new CustomerService();

        try {
            customerService.findCustomerById(10);
        } catch (CustomerNotFoundException e) {
            e.printStackTrace();
            // Handle case when customer was not found
        }

        // Continue program execution...

    }
}
