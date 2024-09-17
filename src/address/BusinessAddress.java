package address;

public class BusinessAddress implements Address {
    private String companyName;
    private String street;
    private String city;
    private String zipCode;

    public BusinessAddress(String companyName, String street, String city, String zipCode) {
        this.companyName = companyName;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String getAddressDetails() {
        return "Business Address: " + companyName + ", " + street + ", " + city + " - " + zipCode;
    }
}