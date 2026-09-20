class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int k = 1;
        for(int i=0; i<s.length(); i++){
            sum += (Math.abs(s.charAt(i)-'z')+1)*(k++);
        }
        return sum;
    }
}