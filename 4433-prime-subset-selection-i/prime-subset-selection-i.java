class Solution {
    public void sieve(List<Integer> list, int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        prime[0] = false;
        if (n >= 1) {
            prime[1] = false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                list.add(i);
            }
        }
    }

    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        long sum = 0;
        sieve(list,n);
        for(int i=0; i<list.size(); i++){
            sum += list.get(i);
            if(sum<=s){
                ans.add(list.get(i));
            }
            else{
                break;
            }
        }
        return ans;
    }
}