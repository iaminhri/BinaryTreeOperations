class BinaryNode {
    int info;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int info){
        this.info = info;
        left = null;
        right = null;
    }

    public BinaryNode(int info, BinaryNode left, BinaryNode right){
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public void displayNode(){
        System.out.print(this.info);
    }

    public String toString(){
        return "NodeInfo: " + info;
    }
}
