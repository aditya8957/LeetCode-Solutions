class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int i=0;
        int j = 0;
        int n = s.length();
        int max = Integer.MIN_VALUE;

        while(j<n){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
           
            while(i<n && mp.containsKey(s.charAt(j)) && mp.get(s.charAt(j))>2){ 
                mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                if(mp.get(s.charAt(i)) == 0){
                    mp.remove(s.charAt(i));
                }
                i++;
            }
            int len = j-i+1;
            max = Math.max(max,len);
            j++;
        }
        return max;
    }
}