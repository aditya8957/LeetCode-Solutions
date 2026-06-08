class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <pivot){
                list1.add(nums[i]);
            }
            else if(nums[i] ==pivot){
                count++;
            }
            else{
                list2.add(nums[i]);
            }
        }
        while(count-- >0){
            list1.add(pivot);
        }
        list1.addAll(list2);
        for(int i=0; i<nums.length; i++){
            nums[i] = list1.get(i);
        }
        return nums;
    }
}