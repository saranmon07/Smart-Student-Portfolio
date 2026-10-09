public class Internship {
    private int internshipId;
    private String company;
    private String role;
    private String duration;
    private String description;
    private String certificateUrl;

    public Internship(int internshipId, String company, String role, String duration,
                      String description, String certificateUrl) {
        this.internshipId = internshipId;
        this.company = company;
        this.role = role;
        this.duration = duration;
        this.description = description;
        this.certificateUrl = certificateUrl;
    }

    public void addInternship() {
        System.out.println("Internship added.");
    }

    public void updateInternship() {
        System.out.println("Internship updated.");
    }

    public void deleteInternship() {
        System.out.println("Internship deleted.");
    }
}
