public class Bread implements Products{
    double price = 1.0;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "price=" + price +
                '}';
    }
}
