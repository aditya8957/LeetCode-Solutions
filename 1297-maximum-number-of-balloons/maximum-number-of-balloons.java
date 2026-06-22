class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        int[] freq = new int[26];
        int count = 0;
        for(int i=0; i<text.length(); i++){
            int ch = text.charAt(i)-'a';
            freq[ch]++;
        }
        boolean flag = true;
        String temp = "balloon";
        for(int i=0; i<text.length(); i++){
            for(int j=0; j<7; j++){
                if(freq[temp.charAt(j)-'a']>0){
                    freq[temp.charAt(j)-'a']--;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}