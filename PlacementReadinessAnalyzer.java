public class PlacementReadinessAnalyzer {
    private double academicWeightage;
    private double skillWeightage;
    private double projectWeightage;
    private double internshipWeightage;
    private double overallWeightage;

    public PlacementReadinessAnalyzer(double academicWeightage, double skillWeightage,
                                      double projectWeightage, double internshipWeightage,
                                      double overallWeightage) {
        this.academicWeightage = academicWeightage;
        this.skillWeightage = skillWeightage;
        this.projectWeightage = projectWeightage;
        this.internshipWeightage = internshipWeightage;
        this.overallWeightage = overallWeightage;
    }

    public double calculateReadiness(Student student) {
        return student.calculateReadiness();
    }

    public double generateScore(Student student) {
        return calculateReadiness(student);
    }

    public ReadinessReport getDetails(Student student) {
        return new ReadinessReport(student, calculateReadiness(student));
    }

    public static class ReadinessReport {
        private Student student;
        private double score;

        public ReadinessReport(Student student, double score) {
            this.student = student;
            this.score = score;
        }

        public double getScore() {
            return score;
        }
    }
}
