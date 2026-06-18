class Solution {
    public double angleClock(int hour, int minutes) {
        double angle = (Math.abs(60*hour - 11*minutes))/2.0;
        if(Math.abs(360-angle)<angle) return 360-angle;
        return angle;
    }
}