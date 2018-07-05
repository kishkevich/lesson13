public class CustomerAdd {
    public CustomerQueue add(){
        CustomerQueue customerQueue = new CustomerQueue()
                .addCustomer(new Customer()
                        .customerProductsAdd(new Bread()))
                .addCustomer(new Customer()
                        .customerProductsAdd(new Butter()));
        return customerQueue;
    }
}
