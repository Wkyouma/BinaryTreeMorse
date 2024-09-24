class BinaryTree{
    private Node root;
    public BinaryTree(){
        root = new Node();    
    }

    public void insert(String morse, char caractere){
        Node Current = root;
        for(char token : morse.toCharArray()){
            if(token == '.'){
                if(Current.left == null){
                    Current.left = new Node();
                }
                Current = Current.left;
            }else if(token == '-'){
                if(Current.right == null){
                    Current.right = new Node();
                }
                Current = Current.right;
            }
            
        }
    }

}