class Solution {
    public int maxArea(int[] height) {
        int first = 0; // pointer on first position in the array
        int second = height.length - 1;// pointer on last or second position in the array
        int curr_max = 0; // amount of water between first and second pointers in the array
        int max = 0; // maximum amount of water(result)
        while(first != second){
            curr_max = (second - first) * Math.min(height[first], height[second]);  
            max = Math.max(curr_max, max); // updating max 
            if(height[first] > height[second]) // moving pointers 
                second--;
            else
                first++;
        }
        return max;
    }
}