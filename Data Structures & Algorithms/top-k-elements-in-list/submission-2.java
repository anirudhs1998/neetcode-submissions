class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];
        for(int i =0; i<freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int num: nums){
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: counts.entrySet()){
            int key = entry.getKey(); //number
            int value = entry.getValue(); // frequency

            freq[value].add(key);
        }

        int[] res = new int[k];
        int i = 0;
        for(int j = freq.length -1; j>0 && i <k; j--){
            for(int n: freq[j]){
                res[i++] = n;
                if(i == k){
                    return res;
                }
            }
        }

        return res;

        
    }
}
