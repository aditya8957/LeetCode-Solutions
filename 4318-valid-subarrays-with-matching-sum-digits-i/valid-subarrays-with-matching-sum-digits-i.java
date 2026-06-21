class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            long sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                String t = String.valueOf(sum);
                if(t.charAt(0) == (char)(x+'0')  && t.charAt(t.length()-1) == (char)(x+'0')){
                    count++;
                }
            }
        }
        return count;
    }
}