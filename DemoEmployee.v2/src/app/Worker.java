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
public class Worker extends Employee {

    private int soNgayLamViec;

    public Worker() {
    }

    public Worker(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }   

    
    public float getBySalary() {
        return getSalary() * (soNgayLamViec / 30);
    }

}