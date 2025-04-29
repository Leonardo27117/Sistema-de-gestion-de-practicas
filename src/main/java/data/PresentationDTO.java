package data;

import java.util.Date;

public class PresentationDTO {
    private int idPresentation;
    private String nombrePresentation;
    private Date fechaPresentation;

    public PresentationDTO(int idPresentation, String nombrePresentation, Date fechaPresentation) {
        this.idPresentation = idPresentation;
        this.nombrePresentation = nombrePresentation;
        this.fechaPresentation = fechaPresentation;
    }

    public int getIdPresentation() {
        return idPresentation;
    }

    public void setIdPresentation(int idPresentation) {
        this.idPresentation = idPresentation;
    }

    public String getNombrePresentation() {
        return nombrePresentation;
    }

    public void setNombrePresentation(String nombrePresentation) {
        this.nombrePresentation = nombrePresentation;
    }

    public Date getFechaPresentation() {
        return fechaPresentation;
    }

    public void setFechaPresentation(Date fechaPresentation) {
        this.fechaPresentation = fechaPresentation;
    }
}
