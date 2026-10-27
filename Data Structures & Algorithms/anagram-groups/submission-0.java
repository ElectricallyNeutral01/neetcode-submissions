class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<Character>> st = new ArrayList<>();
        Map<List<Character>, List<String>> map = new HashMap<>();
        for (int i=0;i<=strs.length-1;i++){
           List<Character> key = toChar(strs[i]);
           map.putIfAbsent(key, new ArrayList<>());
           map.get(key).add(strs[i]);
        }


        return new ArrayList<>(map.values());
    }

    public List<Character> toChar(String s1) {
    char[] a = s1.toCharArray();
    Arrays.sort(a);
    List<Character> result = new ArrayList<>();
    for (char c : a) {
        result.add(c);
    }
    return result;
}
}
