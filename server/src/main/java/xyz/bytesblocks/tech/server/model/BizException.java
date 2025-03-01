package xyz.bytesblocks.tech.server.model;

public class BizException extends RuntimeException {

    public BizException() {
        super();
    }

    public BizException(final String message) {
        super(message);
    }

    public BizException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
