import java.util.LinkedList;

public class binaryTree {


    public binaryNode buildTree(int[] array){
        LinkedList<binaryNode> nodeList=new LinkedList<>();

        for(int arrayIndex=0;arrayIndex<array.length;arrayIndex++){
            nodeList.add(new binaryNode(array[arrayIndex]));
        }

        for(int nodeListIndex=0;nodeListIndex<array.length/2-1;nodeListIndex++) {
            nodeList.get(nodeListIndex).left = nodeList.get(nodeListIndex * 2 + 1);
            nodeList.get(nodeListIndex).right = nodeList.get(nodeListIndex * 2 + 2);
        }

        int lastIndex=array.length/2-1;
        nodeList.get(lastIndex).left = nodeList.get(lastIndex * 2 + 1);
        if(array.length%2==1){
            nodeList.get(lastIndex).right = nodeList.get(lastIndex * 2 + 2);

        }

        return nodeList.get(0);

    }

    public void preorder(binaryNode current) {
        if (current == null) return;
        System.out.print(current.data);
        preorder(current.left);
        preorder(current.right);
    }
    public void inorder(binaryNode current){
        if(current == null) return;
        inorder(current.left);
        System.out.print(current.data);
        inorder(current.right);
    }
    public void postorder(binaryNode current){
        if(current == null) return;
        postorder(current.left);
        postorder(current.right);
        System.out.print(current.data);
    }
    public static void main(String[] args) {
        int[] array={0,1,2,3,4,5,6,7,8,9};
        binaryTree bT=new binaryTree();

        binaryNode root=bT.buildTree(array);

        bT.preorder(root);
        System.out.println("");
        bT.inorder(root);
        System.out.println("_________");
        bT.postorder(root);
    }
}

class binaryNode{
    int data;
    binaryNode left;
    binaryNode right;


    public  binaryNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    public binaryNode(int data, binaryNode left, binaryNode right){
        this.data = data;
        this.left=left;
        this.right=right;
    }
}
