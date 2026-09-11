class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> st = new HashSet<>();
        int n = digits.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k = 0; k<n; k++){
                    if(digits[i] != 0 && i!=j && j != k && i != k && digits[k]%2 == 0){
                        int num = digits[i]*100 + (digits[j]*10) + digits[k];
                        st.add(num);
                    }
                }
            }
        }
        return st.size();
    }
}