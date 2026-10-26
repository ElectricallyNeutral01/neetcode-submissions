class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        Map<Character, Integer> word1 = new HashMap<>();
        Map<Character, Integer> word2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            word1.merge(s1[i], 1, Integer::sum);
        }
        for(int i=0; i<t.length(); i++){
            word2.merge(t1[i], 1, Integer::sum);
        }

        return word1.equals(word2);
    }
}
