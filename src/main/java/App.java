public class App {
    public static void main(String[] args) {
        CustomerAdd addCustomer = new CustomerAdd();
        Cashbox cashBox = new Cashbox(addCustomer.add());
        cashBox.serve();
    }
}
