package onlineStore;

public class Customer {
    //Customer:
    // firstName,lastName, cnp ,address
private String firstName;
private String lastName;
private int cnp;
private String address;

public Customer(String firstName, String lastName, int cnp, String address){
    this.firstName = firstName;
    this.lastName = lastName;
    this.cnp = cnp;
    this.address = address;
}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCnp() {
        return cnp;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
