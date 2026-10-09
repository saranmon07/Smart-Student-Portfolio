import java.util.Date;

public class Student extends User {
    private String rollNo;
    private String name;
    private String department;
    private int semester;
    private double cgpa;
    private Date dateOfBirth;

    public Student(int userId, String username, String password, String email, String role,
                   String rollNo, String name, String department, int semester,
                   double cgpa, Date dateOfBirth) {
        super(userId, username, password, email, role);
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.semester = semester;
        this.cgpa = cgpa;
        this.dateOfBirth = dateOfBirth;
    }

    public void updateProfile() {
        System.out.println("Student profile updated.");
    }

    public double calculateReadiness() {
        return cgpa * 10;
    }

    public void generateResume() {
        System.out.println("Resume generated for " + name);
    }

    public void getPortfolio() {
        System.out.println("Portfolio opened for " + name);
    }

    public void receiveNotification() {
        System.out.println("Notification received.");
    }
}
