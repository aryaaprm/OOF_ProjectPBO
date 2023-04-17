package OOF_ProjectPBO;

import java.util.Scanner;

public class Admin extends User {
    private Scanner scanner;

    public Admin(String username, String password) {
        super(username, password);
        scanner = new Scanner(System.in);
    }

    @Override
    public void showMenu() {
        System.out.println("\nMenu Admin OOF:");
        System.out.println("1. Lihat Restaurant");
        System.out.println("2. Tambah Data Restaurant");
        System.out.println("3. Hapus Data Restaurant");
        System.out.println("4. Kembali ke Menu Login");
        System.out.print("Masukan Pilihan Anda: ");
        String choice = scanner.nextLine();

        boolean validChoice = false;
        while (!validChoice) {
            switch (choice) {
                case "1":
                    Restaurant.showRestaurants();
                    showMenu();
                    validChoice = true;
                    break;
                case "2":
                    Restaurant.createRestaurant();
                    System.out.println("Data Restaurant berhasil ditambahkan!");
                    showMenu();
                    validChoice = true;
                    break;
                case "3":
                    System.out.print("Masukkan ID Restaurant yang akan dihapus: ");
                    String idToDelete = scanner.nextLine();
                    Restaurant.deleteRestaurant(idToDelete);
                    showMenu();
                    validChoice = true;
                    break;
                case "4":
                    LoginMenu loginMenu = new LoginMenu();
                    loginMenu.show();
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