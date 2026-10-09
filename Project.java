public class Project {
    private int projectId;
    private String title;
    private String description;
    private String techStack;
    private String duration;
    private String githubUrl;
    private String demoUrl;

    public Project(int projectId, String title, String description, String techStack,
                   String duration, String githubUrl, String demoUrl) {
        this.projectId = projectId;
        this.title = title;
        this.description = description;
        this.techStack = techStack;
        this.duration = duration;
        this.githubUrl = githubUrl;
        this.demoUrl = demoUrl;
    }

    public void addProject() {
        System.out.println("Project added: " + title);
    }

    public void updateProject() {
        System.out.println("Project updated: " + title);
    }

    public void deleteProject() {
        System.out.println("Project deleted: " + title);
    }
}
