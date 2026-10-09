import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class PlacementDrive {
    private int driveId;
    private int companyId;
    private String title;
    private Date driveDate;
    private String eligibility;
    private String description;

    public PlacementDrive(int driveId, int companyId, String title, Date driveDate,
                          String eligibility, String description) {
        this.driveId = driveId;
        this.companyId = companyId;
        this.title = title;
        this.driveDate = driveDate;
        this.eligibility = eligibility;
        this.description = description;
    }

    public void addDrive() {
        System.out.println("Placement drive added: " + title);
    }

    public void updateDrive() {
        System.out.println("Placement drive updated: " + title);
    }

    public void deleteDrive() {
        System.out.println("Placement drive deleted: " + title);
    }

    public List<PlacementDrive> getDrives() {
        List<PlacementDrive> drives = new ArrayList<>();
        drives.add(this);
        return drives;
    }
}
