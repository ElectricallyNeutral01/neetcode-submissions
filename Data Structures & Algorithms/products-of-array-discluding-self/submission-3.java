class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeros = 0;
        for (int x:nums){
            if(x==0){ zeros++;}
        }
        if(zeros == nums.length){return nums;}
        else if(zeros==1 || zeros==0){
            int product = 1;
            int pro=1;
            for(int i=0;i<nums.length;i++){
                if(nums[i] != 0){
                    product = product * nums[i];
                }
                
                pro = pro * nums[i];
                
            }
            int[] result = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                if(nums[i] != 0){
                    result[i]= pro/nums[i];
                }
                else{
                    result[i]= product;
                }
                
            }
            return result;
        }
        else{
            int[] result = new int[nums.length];
            for(int x: result){
                x = 0;
            }
            return result;
        }
    }
}  
