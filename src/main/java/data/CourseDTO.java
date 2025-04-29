package data;

public class CourseDTO {
    private int nrc;
    private String nameCourse;
    private int idAcademicEducationalExperience;
    private int idPeriod;

    public CourseDTO(int nrc, String nameCourse, int idAcademicEducationalExperience, int idPeriod) {
        this.nrc = nrc;
        this.nameCourse = nameCourse;
        this.idAcademicEducationalExperience = idAcademicEducationalExperience;
        this.idPeriod = idPeriod;
    }

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getIdAcademicEducationalExperience() {
        return idAcademicEducationalExperience;
    }

    public void setIdAcademicEducationalExperience(int idAcademicEducationalExperience) {
        this.idAcademicEducationalExperience = idAcademicEducationalExperience;
    }

    public int getIdPeriod() {
        return idPeriod;
    }

    public void setIdPeriod(int idPeriod) {
        this.idPeriod = idPeriod;
    }
}
