class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();

        for(String curr: strs){
            int[] count = new int[26];
            for(int j =0; j<curr.length(); j++){
                count[curr.charAt(j) - 'a']++;
            }
            String key = Arrays.toString(count);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(curr);
        }
        return new ArrayList<>(result.values());
    }
}
