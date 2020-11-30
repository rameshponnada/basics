package trees;

public class TreeNode<T> {

  private TreeNode<T> left, right;
  private T data;

  public TreeNode(T data) {
    this.data = data;
    this.right = null;
    this.left = null;
  }

  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(10);
    root.left = new TreeNode<>(20);
    root.left.left = new TreeNode<>(30);
    root.left.right = new TreeNode<>(40);
    root.left.right.left = new TreeNode<>(100);
    root.left.right.left.right = new TreeNode<>(100);

    root.right = new TreeNode<>(50);
    root.right.left = new TreeNode<>(60);
    root.right.right = new TreeNode<>(70);
    System.out.println ("InOrder --> ");
    inOrder(root);
    System.out.println ("\nPreOrder --> ");
    preOrder(root);
    System.out.println("\nPostOrder --> ");
    postOrder(root);

    System.out.println("\nHeight:: " + height(root));
    System.out.println("\nKth Distance :: ");
    levelOrder1(root);

    System.out.println("Size:: " + size(root));
  }

  private static void inOrder(TreeNode<Integer> root) {
    if (root == null)
      return;

    inOrder(root.left);
    System.out.print(root.data +" ");
    inOrder(root.right);

  }

  private static void preOrder(TreeNode<Integer> root){
    if(root == null)
      return;
    System.out.print(root.data +" ");
    preOrder(root.left);
    preOrder(root.right);
  }

  private static void postOrder(TreeNode<Integer> root){
    if(root == null)
      return;
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data +" ");
  }

  private static int height(TreeNode<Integer> root) {
    if(root == null)
      return 0;
    return Math.max(height(root.left), height(root.right)) +1;
  }

  private static void printKthLevel(TreeNode<Integer> root, int k){
    if(root ==null) return;
    if(k==0) {
      System.out.print(" " + root.data);
    }else{
      printKthLevel(root.left, k-1);
      printKthLevel(root.right, k-1);
    }
  }

  private static void levelOrder1(TreeNode<Integer> root){
    for(int i=0;i<height(root);i++){
      System.out.print("ith: " +i  +"  ::");
      printKthLevel(root, i);
      System.out.println("");
    }
  }

  // Queue with Null as level mark
  private static void levelOrder2(TreeNode<Integer> root) {}
  // 2 Loops
  private static void levelOrder3(TreeNode<Integer> root) {}

  private static int size(TreeNode<Integer> root){
    if(root==null) return 0;
    return 1+ size(root.left) + size(root.right);
  }
}
