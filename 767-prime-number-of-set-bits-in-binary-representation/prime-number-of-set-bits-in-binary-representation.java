class Solution {
    public int count(int num){
        int c = 0;
        while(num>0){
            if((num & 1) !=0){
                c++;
            }
            num = num>>1;
        }
        return c;
    }
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
        primes.add(17);
        primes.add(19);

        for(int i=left; i<=right; i++){
            int val = count(i);
            if(primes.contains(val)){
                ans++;
            }
        }
        return ans;
    }
}