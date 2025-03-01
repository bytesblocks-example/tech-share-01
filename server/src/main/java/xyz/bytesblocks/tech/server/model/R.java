package xyz.bytesblocks.tech.server.model;

public class R<T> {

    private String msg;

    private Long code;

    private T data;

    public static <T> R<T> success(T data) {
        return new R<>("success", 200L, data);
    }

    public static <T> R<T> fail(String msg) {
        return new R<>(msg, 500L, null);
    }

    public static <T> R<T> fail(String msg, Long code) {
        return new R<>(msg, code, null);
    }

    public R(final String msg, final Long code, final T data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(final Long code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(final T data) {
        this.data = data;
    }
}
