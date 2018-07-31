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
public class Manager extends Employee {

    private int soNhanVien;

    public Manager() {
    }

    public Manager(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public Manager(int soNhanVien, int id, String name) {
        super(id, name);
        this.soNhanVien = soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public float getBySalary() {
        float salary;
        if (this.soNhanVien < 10) {
            salary = this.salary + 500;
        } else {
            if (this.soNhanVien < 20) {
                salary = this.salary + 1000;
            } else {
                salary = this.salary + 2000;
            }
        }
        return salary;
    }
}
