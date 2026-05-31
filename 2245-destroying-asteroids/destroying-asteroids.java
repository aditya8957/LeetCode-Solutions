class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long temp = mass;
        for(int i=0; i<asteroids.length; i++){
            if(temp>=asteroids[i]){
                temp += asteroids[i];
            }
            else temp -= asteroids[i];
        }
        return temp>=0;
    }
}