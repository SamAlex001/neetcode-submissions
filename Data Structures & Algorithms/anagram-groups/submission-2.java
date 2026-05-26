class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anag = new HashMap<>();
        
        for (String str : strs) {
            int[] charCount = new int[26];
            for (char c : str.toCharArray()) {
                charCount[c - 'a']++;
            }            
            String key = Arrays.toString(charCount);

            anag.putIfAbsent(key, new ArrayList<>());
            anag.get(key).add(str);
        }

        return new ArrayList<>(anag.values());
    }
}
