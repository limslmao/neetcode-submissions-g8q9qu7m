class TimeMap {

    private static class Pair{
        int timestamp;
        String value;
        Pair(int timestamp, String value){
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    Map<String, List<Pair>> m;

    public TimeMap() {
        m = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        m.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair> li = m.get(key);
        if(li == null) return "";

        String res = "";
        int l = 0;
        int r = li.size() - 1;

        while(l<=r){
            int m = (l+r) / 2;
            Pair p = li.get(m);
            if(p.timestamp == timestamp){
                return p.value;
            }

            if(p.timestamp < timestamp){
                res = p.value;
                l = m+1;
            }else{
                r = m-1;
            }
        }

        return res;
    }
}
