package data;

public class AcademicDTO {
    private int numberPersonal;
    private String nameAcademic;
    private String email;
    private String user;

    public AcademicDTO(int numberPersonal, String nameAcademic, String email, String user) {
        this.numberPersonal = numberPersonal;
        this.nameAcademic = nameAcademic;
        this.email = email;
        this.user = user;
    }

    public int getNumberPersonal() {
        return numberPersonal;
    }

    public void setNumberPersonal(int numberPersonal) {
        this.numberPersonal = numberPersonal;
    }

    public String getNameAcademic() {
        return nameAcademic;
    }

    public void setNameAcademic(String nameAcademic) {
        this.nameAcademic = nameAcademic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
