package isp.StoreApp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoreAppTest {
    @Test
    public void TestCustomer()
    {
        Customer customer1 = new Customer("121", "Ariana", "0732103936");

        assertEquals("121",customer1.getCustomerId());
        assertEquals("Ariana",customer1.getName());
        assertEquals("0732103936",customer1.getPhone());

    }

    @Test
    public void TestProduct()
    {
        Product product1 = new Product("222", "BEC", 2.33,ProductCategory.ELECTRONICS);
        assertEquals("222",product1.getProductId());
        assertEquals("BEC",product1.getName());
        assertEquals(2.33,product1.getPrice(),0.0f);

    }
    @Test
    public void TestAdress()
    {

        Address customer_adress= new Address("Bd. Mihai Viteazu", "Vulcan");
        assertEquals("Bd. Mihai Viteazu",customer_adress.getStreet());
        assertEquals("Vulcan",customer_adress.getCity());

    }
    @Test
    public void TestTotalOrder()
    {
        Product[] products1 = new Product[4];
        Order order = new Order();

        products1[0] = new Product("123", "Masinuta",  2, ProductCategory.TOYS);
        products1[1] = new Product("124", "Masinuta",  5,ProductCategory.TOYS);
        products1[2] = new Product("125", "Masinuta",  3,ProductCategory.TOYS);
        products1[3] = new Product("126", "Masinuta",  10,ProductCategory.TOYS);

        order.fullPrice(products1);
        assertEquals(20,order.getTotalPrice(),0.0f);


    }}
