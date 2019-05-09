package tree;

public class Main {
    public static void main(String[] args) {
         MyBinarySearchTree bst = new MyBinarySearchTree();
         bst.root = bst.add(bst.root, 5);
         bst.add(bst.root, 7);
         bst.add(bst.root, 8);
         bst.add(bst.root, 9);
         bst.add(bst.root, 2);
         bst.add(bst.root, 4);
         bst.add(bst.root, 1);
         bst.showInOrder(bst.root);
        System.out.println();
         bst.showPreOrder(bst.root);
        System.out.println();
         bst.showPostOrder(bst.root);
        System.out.println();
         bst.showRNLOrder(bst.root);
        System.out.println();
        System.out.println(bst.coutNodes(bst.root));

    }
}
