class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<strs.size();i++){
        s.append(strs.get(i).length());
        s.append("#");
        s.append(strs.get(i));
        }

        return s.toString();
        
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf('#', i);          
            int len = Integer.parseInt(str.substring(i, j));
            result.add(str.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }
        return result;
    }
}
