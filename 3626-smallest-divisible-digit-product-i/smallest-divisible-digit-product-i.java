class Solution {
    public int smallestNumber(int n, int t) {
        int num = n;

        while(true){
            int pro = 1;
            int num1 = num;
            while(num1>0){
                int rem = num1%10;
                pro = pro*rem;
                num1 /= 10;
            }
            if(pro%t == 0) return num;
            num++;
        }
       
    }
}