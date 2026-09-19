class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int xmin = 0;
        int ymin = 0;

        if(x1 > xCenter) xmin = x1;
        else if(x2 < xCenter)  xmin = x2;
        else xmin = xCenter;

        if(y1 > yCenter) ymin = y1;
        else if(y2 < yCenter) ymin = y2;
        else ymin = yCenter;

        int d = (int)Math.sqrt((int)(Math.pow(xmin-xCenter,2)+Math.pow(ymin-yCenter,2)));

        if(d<=radius) return true;
        return false;
    }
}