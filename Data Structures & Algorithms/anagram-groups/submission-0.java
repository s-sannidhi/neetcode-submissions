class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> sol = new ArrayList<>();
        Map<String, List<String>> anagramSorted = new HashMap<>();
        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(anagramSorted.containsKey(sorted)){
                anagramSorted.get(sorted).add(s);
            }
            else {
                anagramSorted.put(sorted, new ArrayList<String>(List.of(s)));
            }
        }
        for(List l : anagramSorted.values()){
            sol.add(l);
        }
        return sol;          
    }
}
