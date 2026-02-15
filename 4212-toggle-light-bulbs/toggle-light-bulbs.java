class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Collections.sort(bulbs);
        int[] count = new int[101];
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<bulbs.size(); i++){
            // count[bulbs.get(i)]
            int c=1;
            while(i<bulbs.size()-1 && bulbs.get(i) == bulbs.get(i+1) ){
                c++;
                i++;
            }
            if(c%2 != 0){
                ans.add(bulbs.get(i));
            }
        }
        return ans;
    }
}