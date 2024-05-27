package isp.StoreApp;

public class Address {
    private String street;
    private String city;
    public Address(String street, String city)
    {
        this.city=city;
        this.street=street;
    }

    public String getCity() {
        return this.city;
    }
    public String getStreet()
    {
        return this.street;
    }
    public void setStreet(String street)
    {
        this.street=street;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
