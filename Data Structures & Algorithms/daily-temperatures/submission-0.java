class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int tmpLength = temperatures.length;
        int[] res = new int[tmpLength];
        Stack<int[]> s = new Stack<>();

        for(int i = 0;i<tmpLength;i++){
            int t = temperatures[i];
            while(!s.isEmpty() && t > s.peek()[0]){
                int[] day = s.pop();
                res[day[1]] = i - day[1];
            }

            s.push(new int[]{t,i});
        }

        return res;
    }
}
