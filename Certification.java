import java.util.Date;

public class Certification {
    private int certId;
    private String title;
    private String issuer;
    private Date issueDate;
    private Date expiryDate;
    private String credentialUrl;

    public Certification(int certId, String title, String issuer, Date issueDate,
                         Date expiryDate, String credentialUrl) {
        this.certId = certId;
        this.title = title;
        this.issuer = issuer;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.credentialUrl = credentialUrl;
    }

    public void addCertification() {
        System.out.println("Certification added: " + title);
    }

    public void updateCertification() {
        System.out.println("Certification updated: " + title);
    }

    public void deleteCertification() {
        System.out.println("Certification deleted: " + title);
    }
}
