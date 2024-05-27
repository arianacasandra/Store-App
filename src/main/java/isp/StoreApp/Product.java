package isp.StoreApp;

import java.sql.SQLOutput;

public class Product {
    private String productId;
    private String name;
    private double price;

    private Customer customer ;
    private ProductCategory productCategory;
    public Product(String productId, String name, double price,ProductCategory productCategory)
    {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
    }
    public void setProductId(String productId)
    {
        this.productId=productId;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public String getProductId()
    {
        return this.productId;
    }
    public String getName()
    {
        return this.name;
    }
    public double getPrice()
    {
        return this.price;
    }
    public void buyProductCustomer(Customer customer)
    {
        System.out.println("The customer with the personal data " + customer.getName() + " ,id " + customer.getCustomerId() + " , "+ customer.getPhone() + " bought " + this.productId + " " + this.name + " with the price of " + this.price);

    }

    public static void main(String[] args) {
        Customer customer1 = new Customer("121", "Ariana", "0732103936");
        Product product1 = new Product("222", "BEC", 2.33, ProductCategory.ELECTRONICS);
        product1.buyProductCustomer(customer1);
        Address customer_adress= new Address("Bd. Mihai Viteazu", "Vulcan");
        customer1.getCustomerAdress(customer_adress, customer1);
        Product[] products1 = new Product[4];
        Order order = new Order();

        products1[0] = new Product("123", "Masinuta",  2,ProductCategory.TOYS);
        products1[1] = new Product("124", "Masinuta",  5,ProductCategory.TOYS);
        products1[2] = new Product("125", "Masinuta",  3,ProductCategory.TOYS);
        products1[3] = new Product("126", "Masinuta",  10,ProductCategory.TOYS);

        order.fullPrice(products1);

    }
}
