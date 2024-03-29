package io.github.rainestormee.jnewsapi.responses;

public class ErrorResponse implements NewsResponse {

    private String status;
    private String code;
    private String message;

    public ErrorResponse() {

    }

    public String getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
