package data;

public class AcademicEvaluatorDTO extends AcademicDTO {
    private int idAcademicEvaluator;
    public AcademicEvaluatorDTO(int numberOfPersonnel, String name, String email, String user, int idAcademicEvaluator) {
        super(numberOfPersonnel, name, email, user);
        this.idAcademicEvaluator = idAcademicEvaluator;
    }

    public int getIdAcademicEvaluator() {
        return idAcademicEvaluator;
    }

    public void setIdAcademicEvaluator(int idAcademicEvaluator) {
        this.idAcademicEvaluator = idAcademicEvaluator;
    }
}
