import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cashbox {
    private CustomerQueue customerQueue;

    public Cashbox(CustomerQueue customerQueue) {
        this.customerQueue = customerQueue;
    }

    public void serve() {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 1; i < 3; i++) {
            executorService.submit(new CashboxRun());
        }
    }

    private class CashboxRun implements Runnable {

        @Override
        public void run() {
            while (true) {
                Customer customer;
                synchronized (customerQueue) {
                    customer = customerQueue.getCustomer();
                }
                if (customer != null) {
                    System.out.printf(customer.toString() + " " + Thread.currentThread().getName() + "\n");
                } else {
                    synchronized (customerQueue) {
                        try {
                            customerQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }


}
