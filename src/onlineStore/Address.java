package onlineStore;

public class Address  {
    // Address* street,country,county
private String street;
private String country;
private String county;

public Address(String street, String country, String county){
    this.street=street;
    this.country=country;
    this.county = county;
}

    public String getStreet() {
        return street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}

