package OOF_ProjectPBO;

import java.util.Scanner;

public class Customer extends User {
    private Scanner scanner;

    public Customer(String username, String password) {
        super(username, password);
        scanner = new Scanner(System.in);
    }

    @Override
    public void showMenu() {
        System.out.println("Menu Customer OOF:");
        System.out.println("1. Lihat Restaurant");
        System.out.println("2. Buat Pesanan");
        System.out.println("3. Lihat Pesanan");
        System.out.println("4. Kembali ke Menu Login");
        System.out.print("Masukan Pilihan Anda: ");
        String choice = scanner.nextLine();

        boolean validChoice = false;
        while (!validChoice) {
            switch (choice) {
                case "1":
                    System.out.println("Under Process - Nantinya akan berisi data restaurant");
                    validChoice = true;
                    break;
                case "2":
                    System.out.println("Under Process - Nantinya akan berisi menu untuk membuat pesanan");
                    validChoice = true;
                    break;
                case "3":
                    System.out.println("Under Process - Nantinya akan berisi menu untuk melihat pesanan");
                    validChoice = true;
                    break;
                case "4":
                    LoginMenu LoginMenu = new LoginMenu();
                    LoginMenu.show();
                    validChoice = true;
                    break;
                default:
                    System.out.println("Pilihan tidak sesuai, Coba masukan pilihan kembali!");
                    System.out.print("Masukan Pilihan Anda: ");
                    choice = scanner.nextLine();
                    break;
            }
        }
    }
}