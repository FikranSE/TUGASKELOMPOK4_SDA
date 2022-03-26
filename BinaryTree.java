class BinaryTree {
    // akar
    Node root;
    BinaryTree() { root = null; }

    //postorder
    void printPostorder(Node node)
    {
        if (node == null)
            return;

        // daun kiri
        printPostorder(node.left);

        // daun kanan
        printPostorder(node.right);

        
        System.out.print(node.key + " ");
    }

    //inorder
    void printInorder(Node node)
    {
        if (node == null)
            return;

        //daun kiri
        printInorder(node.left);

        //cetak node
        System.out.print(node.key + " ");

        //daun kanan
        printInorder(node.right);
    }

    //preorder
    void printPreorder(Node node)
    {
        if (node == null)
            return;

        //cetak data awal
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    
    void printPostorder() { printPostorder(root); }
    void printInorder() { printInorder(root); }
    void printPreorder() { printPreorder(root); }
}