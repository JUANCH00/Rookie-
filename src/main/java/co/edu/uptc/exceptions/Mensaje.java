package co.edu.uptc.exceptions;

public class Mensaje {
    private int code;
    private String message;
    private int codeHttp;

    public Mensaje() {

    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCodeHttp() {
        return this.codeHttp;
    }

    public void setCodeHttp(int codeHttp) {
        this.codeHttp = codeHttp;
    }

}
