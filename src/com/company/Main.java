package com.company;

class MyProgram
{
    public static void main(String[] args)
    {
        int[] intArray = new int[]{ 12,1,4,8,3,21,9};
        for (int i : sort(intArray))
        {
            System.out.println(i);
        }
    }

    public static int[] sort(int[] nums) {
    if(nums == null){
        return null;
    }
    if ( nums.length > 1){
        int middle = nums.length / 2;
        int[] leftSide = new int[middle];
        for(int i = 0; i < middle; i++){
            leftSide[i] = nums[i];
        }

        int[] rightSide = new int[nums.length - middle];
        for(int i = middle; i < nums.length; i++){
            rightSide[i - middle] = nums[i];
        }
        sort(leftSide);
        sort(rightSide);

        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;

        while(temp < nums.length && temp2 < rightSide.length){
            
        }

    }

        return nums;
    }
}