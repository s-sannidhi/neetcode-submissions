class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder("");
        for (String s : strs) {
            result.append(s.length()).append("#").append(s);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> sol = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int slash = str.indexOf('#', i);
            int size = Integer.parseInt(str.substring(i, slash));
            i = slash + 1;
            sol.add(str.substring(i, i + size));
            i += size;
        }
        return sol;

    }
}
