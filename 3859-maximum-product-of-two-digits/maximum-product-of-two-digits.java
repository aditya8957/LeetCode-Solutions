class Solution {
    public int maxProduct(int n) {
        int max1 = -1;
        int max2 = -2;

        int temp = n;
        while(temp>0){
            int rem = temp%10;
            if(rem >= max1){
                max2 = max1;
                max1 = rem;
            }
            else if(rem> max2){
                max2 = rem;
            }
            temp = temp/10;
        }
        long ans = max1*max2;
        return (int)ans;
    }
}