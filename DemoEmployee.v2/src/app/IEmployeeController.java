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
public interface IEmployeeController {
        IEmployee[] taoDanhSach();

    void hienDanhSach(IEmployee[] ds);

    IEmployee[] timMaxTheoChucVu(IEmployee[] ds, int chucvu);
}
