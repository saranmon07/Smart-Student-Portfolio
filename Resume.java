import java.util.Date;

public class Resume {
    private int resumeId;
    private String template;
    private Date generatedOn;
    private String filePath;

    public Resume(int resumeId, String template, Date generatedOn, String filePath) {
        this.resumeId = resumeId;
        this.template = template;
        this.generatedOn = generatedOn;
        this.filePath = filePath;
    }

    public void generateResume() {
        System.out.println("Resume generated using template: " + template);
    }

    public void updateResume() {
        System.out.println("Resume updated.");
    }

    public void downloadResume() {
        System.out.println("Resume downloaded from: " + filePath);
    }

    public void viewResume() {
        System.out.println("Viewing resume.");
    }
}
