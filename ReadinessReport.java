import java.util.*;

public class ReadinessReport {

    double academicScore, skillScore, projectScore;
    double internshipScore, overallScore;

    List<String> strengths = new ArrayList<>();
    List<String> recommendations = new ArrayList<>();

    void calculate(double cgpa, double skillScore,
                   int projects, double internshipScore) {

        academicScore = (cgpa / 10) * 100;
        this.skillScore = skillScore;
        this.internshipScore = internshipScore;

        if (projects <= 0)
            projectScore = 0;
        else if (projects == 1)
            projectScore = 40;
        else if (projects == 2)
            projectScore = 60;
        else if (projects == 3)
            projectScore = 75;
        else if (projects == 4)
            projectScore = 85;
        else
            projectScore = 100;

        overallScore = 0.35 * academicScore
                     + 0.35 * skillScore
                     + 0.30 * projectScore;

        if (academicScore >= 85)
            strengths.add("Excellent Academics");

        if (skillScore >= 80)
            strengths.add("Strong Technical Skills");

        if (projectScore >= 80)
            strengths.add("Strong Project Portfolio");

        if (academicScore < 70)
            recommendations.add("Improve Academics");

        if (skillScore < 60)
            recommendations.add("Improve Skills");

        if (projectScore < 60)
            recommendations.add("Do More Projects");
    }

    void display() {
        System.out.println("\n--- READINESS REPORT ---");
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Skill Score: " + skillScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Internship Score: " + internshipScore);
        System.out.println("Overall Readiness: " + overallScore);
        System.out.println("Strengths: " + strengths);
        System.out.println("Recommendations: " + recommendations);
    }

    public static void main(String[] args) {
        ReadinessReport r = new ReadinessReport();
        r.calculate(8.5, 75, 3, 80);
        r.display();
    }
}

