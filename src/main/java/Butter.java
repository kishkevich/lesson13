public class Butter implements Products{
    double price = 1.5;
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Butter{" +
                "price=" + price +
                '}';
    }
}
