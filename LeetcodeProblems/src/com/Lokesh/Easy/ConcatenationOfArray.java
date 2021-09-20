package com.Lokesh.Easy;

class ConcatinationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int i =0;
        int[] ans = new int[2*n];
        for(i = 0; i<ans.length;i++){
            if(i<nums.length){
                ans[i] = nums[i];
            }
            // ans[i] = nums[i];
            if(i >= nums.length){
                int j = i-n;
                ans[i] = nums[j];
            }
        }

        return ans;
    }
}