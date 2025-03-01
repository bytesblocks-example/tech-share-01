package xyz.bytesblocks.tech.server.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import xyz.bytesblocks.tech.server.model.BizException;
import xyz.bytesblocks.tech.server.model.R;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({BizException.class})
    public R<?> handleBizException(BizException e) {
        return R.fail(e.getMessage(), 0L);
    }

}
