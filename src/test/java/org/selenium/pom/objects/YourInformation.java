package org.selenium.pom.objects;

public class YourInformation {
    private String firstName;
    private String lastName;
    private String zipCode;

    public String getFirstName() {
        return firstName;
    }

    public YourInformation setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public YourInformation setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public YourInformation setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }


    public YourInformation(){}
}
