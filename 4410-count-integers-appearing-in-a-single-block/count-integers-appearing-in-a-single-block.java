class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        HashMap<Integer, List<Integer>> mp = new HashMap<>(); 
        for(int i=0; i<n; i++){
           if (!mp.containsKey(nums[i])) {
                mp.put(nums[i], new ArrayList<>());
            }

            mp.get(nums[i]).add(i);
        }
        int count = 0;
        for(Map.Entry<Integer,List<Integer>> entry: mp.entrySet()){
            List<Integer> list = entry.getValue();
            boolean flag = true;
            for(int i=1; i<list.size(); i++){
                if(list.get(i)-list.get(i-1) != 1){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}