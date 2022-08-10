package com.st.java;

/**
 * @ClassName: Test
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/7 20:14
 */
public class Test {

    @org.junit.jupiter.api.Test
    public void test(){
        int[] arr = {1,2,3,4,5};

        for (int i : arr) {
            arr[i] += 1;
        }

        for (int a:arr){
            System.out.println(a);
        }
    }
}
