package OOF_ProjectPBO;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void showMenu() {
        System.out.println("Halo Admin, Selamat Datang di OOF!");
    }
}
