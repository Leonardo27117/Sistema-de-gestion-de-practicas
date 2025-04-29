package data;

public class RelatedOrganizationDTO {
    private int idOrganization;
    private String nameOrganization;
    private String emailOrganization;
    private String phoneOrganization;

    public RelatedOrganizationDTO(int idOrganization, String nameOrganization, String emailOrganization, String phoneOrganization) {
        this.idOrganization = idOrganization;
        this.nameOrganization = nameOrganization;
        this.emailOrganization = emailOrganization;
        this.phoneOrganization = phoneOrganization;
    }

    public int getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(int idOrganization) {
        this.idOrganization = idOrganization;
    }

    public String getNameOrganization() {
        return nameOrganization;
    }

    public void setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }

    public String getEmailOrganization() {
        return emailOrganization;
    }

    public void setEmailOrganization(String emailOrganization) {
        this.emailOrganization = emailOrganization;
    }

    public String getPhoneOrganization() {
        return phoneOrganization;
    }

    public void setPhoneOrganization(String phoneOrganization) {
        this.phoneOrganization = phoneOrganization;
    }
}
