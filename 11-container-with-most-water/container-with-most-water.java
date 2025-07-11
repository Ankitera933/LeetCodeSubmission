class Solution {
    public int maxArea(int[] height) {
     int left=0;
     int right=height.length-1;
     int area=0;
    int maxArea=0;
        while(left<right){
            int min=Math.min(height[left],height[right]);
            area=min*(right-left);
             maxArea=Math.max(area,maxArea);
            if(height[left]<height[right]){
                left++;

            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}