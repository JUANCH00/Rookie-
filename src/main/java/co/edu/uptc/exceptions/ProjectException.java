package co.edu.uptc.exceptions;

public class ProjectException {
    private int code;

    public ProjectException(TypeMessage typeMessage) {
        super(typeMessage.message);
        this.code = code;
    }

    public Mensaje getMessage(){
        return new Mensaje(this.typeMessage.code, this.typeMessage.)
    }
}
