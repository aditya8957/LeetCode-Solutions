class Solution {
    public boolean canReach(int[] start, int[] target) {
        int x = Math.abs(target[0]-start[0]) + Math.abs(target[1]-start[1]);
        return x%2 == 0;
    }
}