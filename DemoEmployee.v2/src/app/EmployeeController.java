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
public class EmployeeController extends Employee implements IEmployee, IEmployeeController {

    public static final int CONGNHAN = 1;
    public static final int QUANLY = 2;
    public static final int NVVP = 3;

    @Override
    public float getBySalary() {
        return salary;
    }

    @Override
    public IEmployee[] taoDanhSach() {

        IEmployee[] ds = null;
        System.out.print("Nhap so luong nhan vien: ");
        int soLuong = new Scanner(System.in).nextInt();//kiem tra tong nhap vao >0
        for (int i = 0; i < soLuong; i++) {
            System.out.println("chon : 1 Cong nhan, 2 quan lý, 3# nhan vien vp");
            int chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case CONGNHAN:
                    ds[i] = (IEmployee) new Worker();
                case QUANLY:
                    ds[i] = (IEmployee) new Manager();
                    break;
                default:
                    ds[i] = (IEmployee) new Officer();
            }
            ds[i].input();
        }

        @Override
        public void hienDanhSach(IEmployee[] ds{

        for (int i = 0; i < ds.length; i++) {
            if (ds != null) {
                for (IEmployee iemployee : ds) {
                    if (ds != null) {
                        ds.output();
                        System.out.println("------------------------------------");
                    }

                }
            } else {
                System.out.println("Danh sach rong");
            }
        }
    }

    @Override
    public IEmployee[] timMaxTheoChucVu(IEmployee[] ds, int chucvu
    ) {
        //kiem tra mng null....
        if (ds.equals(ds)) {
            System.out.println("error !");
        }
//        Employee max = nhanViens[0];//kiem tra xcem nhanven 0 co chuc vu tuong ung hay ko
        Employee max = null;
        int count = 0;
        int chucVu = 0;
        for (int i = 0; i < ds.length; i++) {
            Employee employee = (Employee) ds[i];
            int chucVuNV = getChucVu(employee);
            if (max == null && chucVuNV == chucVu) {
                max = employee;
                count++;
                continue;
            }
            if (employee.getBySalary() > max.getBySalary() && chucVuNV == chucVu) {
                max = employee;
                count++;
            }
        }

        Employee[] nvMax = new Employee[count];
        int j = 0;
        for (int i = 0; i < ds.length; i++) {
            Employee nhanVien = (Employee) ds[i];
            int chucVuNV = getChucVu(nhanVien);
            if (nhanVien.getBySalary() == max.getBySalary() && chucVuNV == chucVu) {
                nvMax[j] = nhanVien;
                j++;
            }
        }
        return (IEmployee[]) nvMax;
    }

    private int getChucVu(Employee nv) {

        if (nv instanceof Manager) {
            return QUANLY;
        }
        if (nv instanceof Officer) {
            return NVVP;
        }

        return CONGNHAN;
    }

}
