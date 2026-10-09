public class Administrator extends User {
    private int adminId;
    private String adminName;

    public Administrator(int userId, String username, String password, String email, String role,
                         int adminId, String adminName) {
        super(userId, username, password, email, role);
        this.adminId = adminId;
        this.adminName = adminName;
    }

    public void manageUsers() {
        System.out.println("Managing users.");
    }

    public void manageCompanies() {
        System.out.println("Managing companies.");
    }

    public void manageSettings() {
        System.out.println("Managing system settings.");
    }
}
