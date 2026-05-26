class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anag = new HashMap<>();
        
        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            anag.putIfAbsent(sortedStr, new ArrayList<>());
            anag.get(sortedStr).add(str);
        }

        return new ArrayList<>(anag.values());
    }
}
