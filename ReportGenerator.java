public class ReportGenerator {
    private String filePath;

    public ReportGenerator(String filePath) {
        this.filePath = filePath;
    }

    public void generateStudentReport(Student student) {
        System.out.println("Student report generated for: " + student);
    }

    public void exportPDF() {
        System.out.println("Report exported as PDF: " + filePath);
    }

    public void exportExcel() {
        System.out.println("Report exported as Excel: " + filePath);
    }
}
