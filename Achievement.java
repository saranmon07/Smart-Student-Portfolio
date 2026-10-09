import java.util.Date;

public class Achievement {
    private int achievementId;
    private String title;
    private String description;
    private Date date;
    private String type;

    public Achievement(int achievementId, String title, String description, Date date, String type) {
        this.achievementId = achievementId;
        this.title = title;
        this.description = description;
        this.date = date;
        this.type = type;
    }

    public void addAchievement() {
        System.out.println("Achievement added: " + title);
    }

    public void updateAchievement() {
        System.out.println("Achievement updated: " + title);
    }

    public void deleteAchievement() {
        System.out.println("Achievement deleted: " + title);
    }
}
