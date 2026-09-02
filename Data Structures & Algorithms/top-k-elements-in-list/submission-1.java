class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for(int num: nums){
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for(Map.Entry<Integer, Integer> entry: counts.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            heap.offer(new int[]{value, key});

            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] res = new int[k];
        for(int i =0;i<k;i++){
            res[i] = heap.poll()[1];
        }
        
        return res;
    }
}
