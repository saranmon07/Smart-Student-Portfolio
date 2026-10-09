public class Profile {
    private String phone;
    private String address;
    private String bio;
    private String linkedinUrl;
    private String githubUrl;

    public Profile(String phone, String address, String bio, String linkedinUrl, String githubUrl) {
        this.phone = phone;
        this.address = address;
        this.bio = bio;
        this.linkedinUrl = linkedinUrl;
        this.githubUrl = githubUrl;
    }

    public void updateProfile() {
        System.out.println("Profile updated.");
    }

    public void viewProfile() {
        System.out.println("Profile viewed.");
    }
}
