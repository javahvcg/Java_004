/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

/**
 *
 * @author anhquan12
 */
public abstract class Employee {

    private static int currentId = 1;
    private int id;
    private String name;
    private Gender gender;
    protected float salary;

    public abstract float getBySalary();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = currentId++;
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static int getIdCurrent() {
        return currentId;
    }

    public static void setIdCurrent(int currentId) {
        Employee.currentId = currentId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    
    public float getSalary() {
        return salary;
    }

    public void input() {
        System.out.println("input name ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("input gender");
        int gender = new Scanner(System.in).nextInt();
        switch (gender){
            case 1:
                this.gender = Gender.MALE;
                break;
            case 0:
                this.gender = Gender.FEMALE;
                break;
            case -1:
                this.gender = Gender.OTHER;
        }
        System.out.println("input salary");
        this.salary = new Scanner(System.in).nextFloat();    }

    public void ouput() {
        System.out.println("Employee{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + '}');
    }
       
}

