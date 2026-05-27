class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int i=0; i<n; i++){
            if(!mp.containsKey(word.charAt(i))){
                mp.put(word.charAt(i), i);
            }
            else{
                if(Character.isLowerCase(word.charAt(i))){
                    mp.put(word.charAt(i), i);
                }
            }
        }

        int count = 0;
        for(int i=0; i<n; i++){
            char ch = word.charAt(i);
            int idx = -1;
            int idx1 = -1;
            if(mp.containsKey(word.charAt(i))){
                idx = mp.get(ch);
                mp.remove(ch);
                if(mp.containsKey((char)(ch-32))){
                    idx1 = mp.get((char)(ch-32));
                    mp.remove((char)(ch-32));
                }
                if(idx < idx1) count++;
            }
        }
        return count;
    }
}