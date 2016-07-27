package com.brainacad.skozigon.temp;

import java.util.Random;

/**
 * Created by skozigon on 25.07.2016.
 */
public class Students {
    String string = "INSERT INTO students" + "(id, name, lastname, email, age)" + "VALUES(?,?,?,?,?);";
    String name_mass[] = {"Ivan", "Petro", "Sashko", "Kolya"};
    String lastname_mass[] = {"Ivanov", "Petrov", "Sidorov", "Nikolayev"};
    int id;

    public void setId(int id) {
        this.id = id;
    }

    int age;
    String email;

    Random random = new Random();

    String name, lastname;




    public String getName() {
        return name = name_mass[random.nextInt(name_mass.length - 1)];
    }

    public String getLastname() {
        return lastname = lastname_mass[random.nextInt(lastname_mass.length - 1)];
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age = random.nextInt(99);
    }

    public String getEmail() {
        return email = this.getName()+this.getLastname() + "@" + "brainacad.com";
    }

    public String getString(){
        return "INSERT INTO students (id, NAME, LASTNAME, email, age) VALUES(?,?,?,?,?)";
    }


}
