package data;

public class StudentDTO {
    private String registration;
    private String name;
    private int qualification;
    private int NRC;
    private String user;

    public StudentDTO(String registration, String name, int qualification, int NRC, String user) {
        this.registration = registration;
        this.name = name;
        this.qualification = qualification;
        this.NRC = NRC;
        this.user = user;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public int getNRC() {
        return NRC;
    }

    public void setNRC(int NRC) {
        this.NRC = NRC;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
