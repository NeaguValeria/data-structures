package tree;

public class MyBinarySearchTree {
    Node root;

    public Node add(Node n, int value) {
        if (n == null) {
            n = new Node(value);
        } else {
            if (value < n.info){
               n.left = add(n.left, value);
            }else{
                n.right = add(n.right, value);
            }
        }
        return n;
    }

    public void showInOrder(Node n){
        if(n == null){
            return;
        }else{
            showInOrder(n.left);
            System.out.print(n.info);
            showInOrder(n.right);
        }
    }

    public void showPreOrder(Node n){
        if(n != null){
            System.out.print(n.info);
            showPreOrder(n.left);
            showPreOrder(n.right);
        }
    }

    public void showPostOrder(Node n){
        if(n != null){
            showPostOrder(n.left);
            showPostOrder(n.right);
            System.out.print(n.info);
        }
    }

    public void showRNLOrder(Node n){
        if(n != null){
            showRNLOrder(n.right);
            System.out.print(n.info);
            showRNLOrder(n.left);
        }
    }
    // sau    //
    //public void showRNLOrder1(Node n){
    //if(n != null){
    //showInOrder(n.right);
    //System.out.print(n.info);
    //showInOrder(n.left);
    //}
    // }

    public int coutNodes(Node n){
        int m;
        if( n == null){
            return 0;
        }else{
            m = coutNodes(n.left) + coutNodes(n.right) + 1;
        }
        return m;
    }


}

