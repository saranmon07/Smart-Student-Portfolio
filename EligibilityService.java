import java.util.*;

public class EligibilityService {

    String check(double cgpa, int projects,
                 double skillMatch,
                 Set<String> certifications,
                 double minCgpa, int minProjects,
                 double minSkillMatch,
                 String requiredCertification) {

        List<String> reasons = new ArrayList<>();

        if (cgpa < minCgpa)
            reasons.add("CGPA requirement not met");

        if (projects < minProjects)
            reasons.add("Project requirement not met");

        if (!requiredCertification.isEmpty()
                && !certifications.contains(requiredCertification))
            reasons.add("Certification missing");

        if (!reasons.isEmpty()) {
            System.out.println("Reasons: " + reasons);
            return "INELIGIBLE";
        }

        if (skillMatch < minSkillMatch)
            return "CONDITIONAL";

        return "ELIGIBLE";
    }

    public static void main(String[] args) {

        Set<String> certificates = new HashSet<>();
        certificates.add("Java Certification");

        EligibilityService service = new EligibilityService();

        String result = service.check(
                8.5, 3, 66.67, certificates,
                7.0, 2, 60.0, "Java Certification"
        );

        System.out.println("Eligibility: " + result);
    }
}
