class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<int[]> s = new Stack<>();

        for(int i =0; i<heights.length;i++){
            int start = i;
            int h = heights[i];
            while(!s.isEmpty() && s.peek()[1] > h){
                int[] pair = s.pop();
                int index = pair[0];
                int height = pair[1];
                maxArea = Math.max(maxArea, height * (i - index));
                start = index;
            }
            s.push(new int[]{start, heights[i]});
        }

        for(int[] pair: s){
            int i = pair[0];
            int h = pair[1];
            maxArea = Math.max(maxArea, h * (heights.length - i));
        }

        return maxArea;
    }
}
