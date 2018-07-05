import java.util.ArrayList;
import java.util.List;

public class Customer {
    List<Products> productsList = new ArrayList<Products>();

    public Customer customerProductsAdd(Products products){
        productsList.add(products);
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "productsList=" + productsList +
                '}';
    }
}
