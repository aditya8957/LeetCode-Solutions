class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int countA = 0;
        int countB = 0, countC = 0, count = 0;
        while(i<n && j<n){
            char ch = s.charAt(j);
            if(ch == 'a') countA++;
            if(ch == 'b') countB++;
            if(ch == 'c') countC++;

            while(countA >0 && countB>0 && countC>0){
                if(j < n-1){
                    count += n-j;

                }
                else{
                    count += 1;
                }
                char ch1 = s.charAt(i);
                if(ch1 == 'a') countA--;
                if(ch1 == 'b') countB--;
                if(ch1 == 'c') countC--;
                i++;
            }
            j++;
        }
        return count;
    }
}