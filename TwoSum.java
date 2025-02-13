class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] b= new int[2];

        int flag = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(target == nums[i]+nums[j]){
                    b[0]=i;
                    b[1]=j;  
                }
            }
        }
        return b;
    }
}
