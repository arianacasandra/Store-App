package isp.StoreApp;

public class Customer {
    private String customerId;
    private String name;
    private String phone;
    private Address customer_adress;
    public Customer(String customerId, String name, String phone)
    {
        this.name=name;
        this.phone=phone;
        this.customerId=customerId;

    }
    public void setName(String name)
    {
      this.name=name;
    }
    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
    public void getCustomerAdress(Address customer_adress, Customer customer)
    {
        System.out.println("The customer " + customer.getName() + " has the address " + customer_adress.getCity() + " " + customer_adress.getStreet());
    }


}
