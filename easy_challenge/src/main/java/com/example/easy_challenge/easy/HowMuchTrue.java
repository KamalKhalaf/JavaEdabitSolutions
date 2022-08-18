package com.example.easy_challenge.easy;

public class HowMuchTrue {

    public static void main(String[] args){
        boolean[] answer = new boolean[]{true, false, false, true, false, false, false, false};
        System.out.println("the true count is: " + countTrue(answer));
        System.out.println("the fale count is: " + countFalse(answer));
    }

    public static int countTrue(boolean[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) count++;
        }
        return count;
    }

    public static int countFalse(boolean[] arr) {
        int count = 0;
        for (boolean i : arr) {
            if (i == false) count++;
        }
        return count;
    }
}