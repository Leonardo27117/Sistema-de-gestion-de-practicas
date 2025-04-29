package data;

public class ProjectManagerDTO {
    private int idProjectManager;
    private String fullName;
    private String phoneNumber;
    private String email;

    public ProjectManagerDTO(int idProjectManager, String fullName, String phoneNumber, String email) {
        this.idProjectManager = idProjectManager;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getIdProjectManager() {
        return idProjectManager;
    }

    public void setIdProjectManager(int idProjectManager) {
        this.idProjectManager = idProjectManager;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
