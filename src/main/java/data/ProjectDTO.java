package data;

import java.lang.classfile.instruction.StackInstruction;

public class ProjectDTO {
    private int idProject;
    private String idStudent;
    private int idRelatedOrganization;
    private int idManager;
    private int idSchedule;
    private String nameProject;
    private String descriptionProject;

    public ProjectDTO(int idProject, String idStudent, int idRelatedOrganization, int idManager,int idSchedule, String nameProject, String descriptionProject) {
        this.idProject = idProject;
        this.idStudent = idStudent;
        this.idRelatedOrganization = idRelatedOrganization;
        this.idManager = idManager;
        this.idSchedule = idSchedule;
        this.nameProject = nameProject;
        this.descriptionProject = descriptionProject;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdRelatedOrganization() {
        return idRelatedOrganization;
    }

    public void setIdRelatedOrganization(int idRelatedOrganization) {
        this.idRelatedOrganization = idRelatedOrganization;
    }

    public int getIdManager() {
        return idManager;
    }

    public void setIdManager(int idManager) {
        this.idManager = idManager;
    }

    public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public String getDescriptionProject() {
        return descriptionProject;
    }

    public void setDescriptionProject(String descriptionProject) {
        this.descriptionProject = descriptionProject;
    }

}
