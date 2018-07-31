package app;



import app.Employee;
import app.EmployeeController;
import java.util.Scanner;

public class MainMenu {

   private static EmployeeController controller = new EmployeeController();

    public static void main(String[] args) {
        generateMenu();
    }

    public static void generateMenu() {
        int choice = 0;
        while (true) {
            System.out.println("=================== Menu ==================");
            System.out.println("1. Enter information officer, worker , manager");
            System.out.println("2. Display employee in list");
            System.out.println("3. Search employee by salary max: ");
            System.out.println("4. Thoat");
            System.out.println("Try again !: ");
            System.out.println("===========================================");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    controller.taoDanhSach();
                    break;
                case 2:
                    System.out.println(" Display :");
                    break;
                case 3:
                    menu2();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Error , Try again ! ");
                    break;
            }
        }
    }

    public static void menu2() {
        int choiceMenu2 = 0;
        while (true) {
            System.out.println("===========================================");
            System.out.println("1. Search by location");
            System.out.println("2. Back to main meny");
            System.out.println("Try again ! ");
            System.out.println("===========================================");
            choiceMenu2 = new Scanner(System.in).nextInt();
            switch (choiceMenu2) {
                case 1:
            {
                IEmployee[] ds = null;
                controller.timMaxTheoChucVu(ds, choiceMenu2);
            }
                    break;
                case 2:
                    generateMenu();
                    break;
                default:
                    System.err.println("Error ! Try again.");
                    break;
            }
        }
    }
}
