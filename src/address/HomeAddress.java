package address;

public class HomeAddress implements Address {
    private String street;
    private String city;
    private String zipCode;

    public HomeAddress(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String getAddressDetails() {
        return "Home Address: " + street + ", " + city + " - " + zipCode;
    }
}
