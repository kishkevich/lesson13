import java.util.LinkedList;
import java.util.List;

public class CustomerQueue {

    private List<Customer> list = new LinkedList<Customer>();

    public CustomerQueue addCustomer(Customer customer) {
        list.add(customer);
        return this;
    }

    public Customer getCustomer() {
        return (Customer) list;
    }

    @Override
    public String toString() {
        return "CustomerQueue{" +
                "list=" + list +
                '}';
    }
}
