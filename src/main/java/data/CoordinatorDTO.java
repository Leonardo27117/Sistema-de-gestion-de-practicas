package data;

public class CoordinatorDTO extends AcademicDTO{
    private int idCoordinator;

    public CoordinatorDTO(int numberOfPersonnel, String name, String email, String user, int idCoordinator) {
        super(numberOfPersonnel, name, email, user);
        this.idCoordinator = idCoordinator;
    }

    public int getIdCoordinator() {
        return idCoordinator;
    }

    public void setIdCoordinator(int idCoordinator) {
        this.idCoordinator = idCoordinator;
    }
}
