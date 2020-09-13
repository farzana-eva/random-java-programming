package com.company;

public class Main {

    public static void main(String[] args) {
        int nums[] = {5, 9, 2};
        int sum = 0;
            if(nums.length >= 2)
                sum = (nums[0] + nums[1]);
            if(nums.length == 1)
                sum = nums[0];
            if(nums.length == 0)
                sum = 0;
        System.out.println(sum);
        }

    }

