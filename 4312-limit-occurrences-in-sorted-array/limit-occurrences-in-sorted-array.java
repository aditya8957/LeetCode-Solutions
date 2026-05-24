class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int j = 1;
        int t = k;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1] && k>1){
                ans.add(nums[i]);
                k--;
            }
            else if(nums[i] != nums[i-1]){
                k=t;
                ans.add(nums[i]);
            }
        }
        System.out.println(ans);
        int[] arr = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}