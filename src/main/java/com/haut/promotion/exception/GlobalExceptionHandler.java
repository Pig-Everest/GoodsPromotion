package com.haut.promotion.exception;
/**
 * 自定义异常处理类
 */

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     *捕获Exception异常
     * @param request
     * @param e
     * @return map
     */
    @ExceptionHandler(Exception.class)
    public Map<String, Object> runtimeExceptionHandler(
            HttpServletRequest request,
            final Exception e
    ){
        Map<String,Object> map = new HashMap<>();
        //返回错误页面
        StringBuilder stringBuilder = new StringBuilder();
        if(e instanceof CustomException){
            CustomException customException = (CustomException) e;
            //设置错误代码
            stringBuilder.append("/errorManager?code="+customException.getCode());
        }else {
            stringBuilder.append("/errorManager?code=400");

        }
        //设置错误消息
        stringBuilder.append("&message="+e.getMessage());
        String url = stringBuilder.toString();
        map.put("flag",true);
        map.put("url",url);
        return map;
    }

}
