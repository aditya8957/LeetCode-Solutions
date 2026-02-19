class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        boolean down = true;
        int j = 0;
        for(int i = 0; i<s.length(); i++){
            if(down){
                rows[j] += s.charAt(i);
                if(j == numRows-1){
                    down = false;
                    j--;
                }
                else
                    j++;
            }
            else{
                rows[j] += s.charAt(i);
                if(j == 0){
                    down = true;
                    j++;
                }
                else 
                    j--;  
            }
            
        }
        String ans = "";
        for(int i=0; i<numRows; i++){
            ans += rows[i];
        }
        return ans;
    
    }
}