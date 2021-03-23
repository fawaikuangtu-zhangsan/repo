package com.sunyuan.test;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DemoTest {

    @Test
    public void test(){
        int[] arr = {1,2,5,4,3};
        int[] arr1 = new int[arr.length];
        for (int i = arr.length-1, j = 0; i >=0; i--,j++) {
            arr1[j] = arr[i];
            System.out.println(arr1[j]);
        }
        System.out.println("==========================");
        Arrays.sort(arr);
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
