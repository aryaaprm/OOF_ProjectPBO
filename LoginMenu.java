package OOF_ProjectPBO;

import java.util.Scanner;
public class LoginMenu {
    private Scanner scanner;
    private Admin admin;
    private Customer customer;

    public LoginMenu() {
        scanner = new Scanner(System.in);
        admin = new Admin("admin", "123");
        customer = new Customer("customer", "123");
    }

    public void show() {
        System.out.println("=========================================");
        System.out.println("|                  OOF                  |");
        System.out.println("|         (Online Ordering Food)        |");
        System.out.println("=========================================");
        System.out.println("|               Menu Login              |");
        System.out.println("=========================================");
        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            System.out.print("- Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("- Masukkan password: ");
            String password = scanner.nextLine();

            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                admin.showMenu();
                isLoggedIn = true;
            } else if (customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
                customer.showMenu();
                isLoggedIn = true;
            } else {
                System.out.println("Username atau password salah! Silakan coba lagi.");
            }
        }
        scanner.close();
    }
}