package com.st.reggie.common;

/**
 * @ClassName: CustomException
 * @Version: 1.0
 * @Description: 自定义业务异常类
 * @Author song
 * @Date 2022/8/7 9:47
 */
public class CustomException extends RuntimeException{

    public CustomException(String message){
        super(message);
    }
}
