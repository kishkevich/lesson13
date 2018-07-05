
public class Customer {
    List<Products> productsList = new ArrayList<>();

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
