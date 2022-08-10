package com.st.reggie.common;

/**
 * @ClassName: BaseContext
 * @Version: 1.0
 * @Description: 基于ThreadLocal封装工具类，用户保存和获取当前登录用户id,作用于某一个线程之内
 * @Author song
 * @Date 2022/8/6 18:02
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     * @param id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 获取值
     * @return
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
