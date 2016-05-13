package com.brainacad.lpyavka.lesson6.employee;

public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;

    static int numberOfEmployees;

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployees++;
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }
}
