package OOF_ProjectPBO;

public class Customer extends User {
    public Customer(String username, String password) {
        super(username, password);
    }

    @Override
    public void showMenu() {
        System.out.println("Halo Customer, Selamat Datang di OOF!");
    }
}