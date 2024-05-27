package isp.StoreApp;

import java.time.LocalDateTime;


public class Order {
    private String orderId;
    private LocalDateTime date;
    private double totalPrice;
    private Product[] products=new Product[10];

    public void setOrderId(String orderId){
        this.orderId = orderId;
    }
    public void setDate(LocalDateTime date)
    {
        this.date = date;
    }
    public void setTotalPrice(double totalPrice)
    {
        this.totalPrice=totalPrice;
    }
    public String getOrderId(){
        return this.getOrderId();
    }
    public LocalDateTime getData()
    {
        return this.date;
    }
    public double getTotalPrice()
    {
        return this.totalPrice;
    }
    public void fullPrice(Product[] products)
    {
        for(int i=0; i< products.length; i++)
         this.totalPrice+=products[i].getPrice();
        System.out.println("The price of all products " + this.totalPrice);


    }


}
