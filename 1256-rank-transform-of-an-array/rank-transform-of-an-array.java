class Solution {
    public int[] arrayRankTransform(int[] arr) {  
        int[] temp = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(arr);
       
        int k = 1;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],k);
                k++;
            }
        }
        int[] ans = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            ans[i] = mp.get(temp[i]);
        }
        return ans;
    }
}