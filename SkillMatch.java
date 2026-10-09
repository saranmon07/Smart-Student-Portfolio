
import java.util.*;

public class SkillMatch {

    double calculate(Set<String> studentSkills,
                     Set<String> requiredSkills) {

        int matched = 0;

        if (requiredSkills.isEmpty())
            return 100;

        for (String skill : requiredSkills) {
            for (String studentSkill : studentSkills) {
                if (skill.equalsIgnoreCase(studentSkill)) {
                    matched++;
                    break;
                }
            }
        }

        return matched * 100.0 / requiredSkills.size();
    }

    public static void main(String[] args) {
        Set<String> student = new HashSet<>();
        student.add("Java");
        student.add("SQL");
        student.add("HTML");

        Set<String> required = new HashSet<>();
        required.add("Java");
        required.add("SQL");
        required.add("Python");

        SkillMatch match = new SkillMatch();
        double result = match.calculate(student, required);

        System.out.println("Skill Match: " + result + "%");
    }
}
