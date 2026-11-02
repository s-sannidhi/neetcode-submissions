class PrefixTree {
    class TreeNode{
        public HashMap<Character, TreeNode> children;
        public char val;
        public TreeNode(char val){
            this.val = val;
            children = new HashMap<>();
        }
        public TreeNode(){
            children = new HashMap<>();
        }
    }
    TreeNode root;

    public PrefixTree() {
        this.root = new TreeNode();
    }

    public void insert(String word) {
        TreeNode curNode = root;
        for(char c: word.toCharArray()){
            if(curNode.children.containsKey(c)){
                curNode = curNode.children.get(c);
            }
            else{
                curNode.children.put(c, new TreeNode(c));
                curNode = curNode.children.get(c);
            }
        }
        // null term
        curNode.children.put('\0', new TreeNode());     
        }

    public boolean search(String word) { 
        TreeNode curNode = root;
        for(char c: word.toCharArray()){
            if(curNode.children.containsKey(c)){
                curNode = curNode.children.get(c);
            }
            else {
                return false;
            }
        }
        if(curNode.children.containsKey('\0')){
            return true;
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        TreeNode curNode = root;
        for(char c: prefix.toCharArray()){
            if(curNode.children.containsKey(c)){
                curNode = curNode.children.get(c);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
