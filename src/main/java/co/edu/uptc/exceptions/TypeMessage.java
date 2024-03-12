package co.edu.uptc.exceptions;

public enum TypeMessage {
    Not_Found(HttpStatus.BadREQUEST.value(), "Not found", 404),
    Not_Saved(HttpStatus.BadREQUEST.value(), "Not found", 410);

    public final String message;
    public final int code;
    public final int codeHttp;

    private TypeMessage(int codeHttp, String message, int code) {
        this.message = message;
        this.code = code;
        this.codeHttp = codeHttp;
    }
}
