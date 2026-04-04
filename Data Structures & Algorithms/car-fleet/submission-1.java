class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Stack<Double> s = new Stack<>();

        int[][] pair = new int[n][2];
        for(int i =0;i<n;i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b) -> Integer.compare(b[0], a[0]));

        for(int[] p : pair){
            double t = (double)(target - p[0]) / p[1];
            s.push(t);

            if(s.size()>=2 && s.peek()<=s.get(s.size()-2)){
                s.pop();
            }
        }

        return s.size();

    }
}
