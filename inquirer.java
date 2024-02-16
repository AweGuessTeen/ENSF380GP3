package edu.ucalgary.oop;

public class inquirer {
    private String firstName;
    private String lastName;
    private String servicesPhone;
    private String info;

    public inquirer(String firstName, String lastName, String servicesPhone, String info) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.servicesPhone = servicesPhone;
        this.info = info;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getServicesPhone() {
        return servicesPhone;
    }

    public String getInfo() {
        return info;
    }
}
