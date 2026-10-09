import java.util.ArrayList;
import java.util.List;

public class SkillGapAnalyzer {
    private List<String> matchedSkills;
    private List<String> missingSkills;
    private List<String> recommendedSkills;

    public SkillGapAnalyzer() {
        matchedSkills = new ArrayList<>();
        missingSkills = new ArrayList<>();
        recommendedSkills = new ArrayList<>();
    }

    public void analyzeSkillGap(Student student, Company company) {
        System.out.println("Analyzing skill gap for the student and company.");
    }

    public List<String> getGapReport(Student student, Company company) {
        List<String> report = new ArrayList<>();
        report.addAll(missingSkills);
        return report;
    }
}
