package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int [] arr = {1,2,3,5,8,9};
	int min = minArr(arr);
        System.out.println("Min in Arr: "+arr[min]);


    }
    public static int minArr(int[] arr){
        int min = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[min]>arr[i]){
                min = i;
            }

        }
        return min;
    }
}
