public class CodingProfile {
    private String platform;
    private String username;
    private int problemsSolved;
    private int rating;
    private String profileUrl;

    public CodingProfile(String platform, String username, int problemsSolved,
                         int rating, String profileUrl) {
        this.platform = platform;
        this.username = username;
        this.problemsSolved = problemsSolved;
        this.rating = rating;
        this.profileUrl = profileUrl;
    }

    public void syncProfile() {
        System.out.println("Coding profile synchronized.");
    }

    public void updateCodingProfile() {
        System.out.println("Coding profile updated.");
    }

    public void deleteCodingProfile() {
        System.out.println("Coding profile deleted.");
    }
}
