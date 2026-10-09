public class PlacementOfficer extends User {
    private int officerId;
    private String department;
    private String contactNo;
    private String officeEmail;

    public PlacementOfficer(int userId, String username, String password, String email, String role,
                            int officerId, String department, String contactNo, String officeEmail) {
        super(userId, username, password, email, role);
        this.officerId = officerId;
        this.department = department;
        this.contactNo = contactNo;
        this.officeEmail = officeEmail;
    }

    public void manageStudents() {
        System.out.println("Managing students.");
    }

    public void manageDrives() {
        System.out.println("Managing placement drives.");
    }

    public void generateReports() {
        System.out.println("Generating placement reports.");
    }
}
