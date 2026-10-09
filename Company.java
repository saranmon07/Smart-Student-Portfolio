public class Company {
    private int companyId;
    private String name;
    private String industry;
    private String location;
    private String website;
    private String eligibilityCriteria;

    public Company(int companyId, String name, String industry, String location,
                   String website, String eligibilityCriteria) {
        this.companyId = companyId;
        this.name = name;
        this.industry = industry;
        this.location = location;
        this.website = website;
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public void addCompany() {
        System.out.println("Company added: " + name);
    }

    public void updateCompany() {
        System.out.println("Company updated: " + name);
    }

    public void deleteCompany() {
        System.out.println("Company deleted: " + name);
    }

    public void getEligibilityCriteria() {
        System.out.println("Eligibility criteria: " + eligibilityCriteria);
    }
}
