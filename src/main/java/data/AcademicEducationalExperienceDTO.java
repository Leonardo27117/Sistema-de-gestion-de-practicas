package data;

public class AcademicEducationalExperienceDTO extends AcademicDTO {
    private int idAcademicEducationalExperience;

    public AcademicEducationalExperienceDTO(int numberOfPersonnel, String name, String email, String user, int idAcademicEducationalExperience) {
        super(numberOfPersonnel, name, email, user);
        this.idAcademicEducationalExperience = idAcademicEducationalExperience;
    }

    public int getIdAcademicEducationalExperience() {
        return idAcademicEducationalExperience;
    }

    public void setIdAcademicEducationalExperience(int idAcademicEducationalExperience) {
        this.idAcademicEducationalExperience = idAcademicEducationalExperience;
    }
}
