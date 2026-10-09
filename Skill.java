public class Skill {
    private int skillId;
    private String skillName;
    private String category;
    private String level;
    private int experience;

    public Skill(int skillId, String skillName, String category, String level, int experience) {
        this.skillId = skillId;
        this.skillName = skillName;
        this.category = category;
        this.level = level;
        this.experience = experience;
    }

    public void addSkill() {
        System.out.println("Skill added: " + skillName);
    }

    public void updateSkill() {
        System.out.println("Skill updated: " + skillName);
    }

    public void deleteSkill() {
        System.out.println("Skill deleted: " + skillName);
    }
}
