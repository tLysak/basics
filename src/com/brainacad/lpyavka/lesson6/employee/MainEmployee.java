package com.brainacad.lpyavka.lesson6.employee;

import com.brainacad.lpyavka.lesson6.employee.Employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employee = {new Employee("Michelle", "Obama", "accountant", "3-21-0-90"),
                new Employee("Ronald", "Reagan", "actor", "3-00-56-08"),
                new Employee("Margaret ", "Thatcher ", "chemist", "1-16-73-14"),
                new Employee("Homer ", "Simpson ", "teacher", "5-89-14-83"),
                new Employee("Steven ", "Spielberg ", "scientist", "7-48-29-45")};

        System.out.println("Your company consists of " + Employee.numberOfEmployees + " employees.");
    }
}
