class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> seen = new HashMap<>();

        for(String s : strs) {
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);

            if(!seen.containsKey(key)) seen.put(key, new ArrayList<>());
            seen.get(key).add(s);
        }
        return new ArrayList<>(seen.values());
    }
}
