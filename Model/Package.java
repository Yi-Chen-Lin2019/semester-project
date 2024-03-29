package Model;
import java.util.*;

public class Package extends ItemDescriptor
{
    private double price;
    private ArrayList<ItemDescriptor> products;

    public Package(String barcode, String name, double price)
    {
        super(barcode, name);
        this.price = price;
        products = new ArrayList<>();
    }
    public double getSellingPrice()
    {
        return price;
    }
    public ArrayList<ItemDescriptor> getProducts()
    {
        return products;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void addProduct(ItemDescriptor product)
    {
        products.add(product);
    }
    
}
