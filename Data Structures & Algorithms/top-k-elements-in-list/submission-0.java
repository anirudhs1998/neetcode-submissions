class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num: nums){
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: counts.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                arr.add(new int[]{value, key});
        }

        arr.sort((a,b) -> b[0] - a[0]);

        int[] res = new int[k];
        for(int i =0; i<k; i++){
            res[i] = arr.get(i)[1];
        }

        return res;


    }
}
