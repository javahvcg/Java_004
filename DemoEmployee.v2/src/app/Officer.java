/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author anhquan12
 */
public class Officer extends Employee{

    private float heSo;


    public void setHeSo(float heSo) {
        this.heSo = heSo;
    }

    public float getHeSo() {
        return heSo;
    }

    public Officer() {
    }

    public Officer(float heSo) {
        this.heSo = heSo;
    }

    public float getBySalary() {
        return getSalary() + getSalary() * heSo;
    }
}


