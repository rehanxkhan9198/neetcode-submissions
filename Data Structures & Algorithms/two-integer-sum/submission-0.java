class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] pos=new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(target-nums[i]==nums[j] && i!=j){
                    pos[1]=i;
                    pos[0]=j;
                }
            }
        }
        return pos;
        

    }
}
