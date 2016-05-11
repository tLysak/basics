package com.brainacad.skozigon.Lesson6.Home;

/**
 * Created by skozigon on 11.05.2016.
 */
public class Emploee {


    private String firstName, lastName, occupation, telephone;
    static int numberOfEmployees;

    public Emploee(String firstName, String lastName, String occupation, String telephone) {
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
        Emploee.numberOfEmployees = numberOfEmployees;
    }

    public static void main(String[] args) {
        Emploee emploee1 = new Emploee("Ivan", "Shvabrenko", "cleaner", "123654789");
        Emploee emploee2 = new Emploee("Opanas", "Korotylo", "electric", "258741369");

        System.out.println("Staff of you company are: " + getNumberOfEmployees() + "\n"+ emploee1.getFirstName() + "\t" + emploee1.getLastName() +
         "\t" + emploee1.getOccupation() + "\t" + emploee1.getTelephone() );
        System.out.println( emploee2.getFirstName() + "\t" + emploee2.getLastName() +
                "\t" + emploee2.getOccupation() + "\t" + emploee2.getTelephone());
    }
}
