//package Algorithm;
//
//class treeNode{
//	Object data;
//	treeNode left;
//	treeNode right;
//}
//
//class linkedTree{
//	
//	treeNode root;
//	
//	public treeNode makeTree(treeNode bt1,Object data, treeNode bt2) {
//		treeNode root = new treeNode();
//		root.data = data;
//		root.left = bt1;
//		root.right = bt2;
//		return root;		
//	}
//	
//	public void preOrder(treeNode root){
//		if(root!=null) {
//		System.out.print(root.data);
//		preOrder(root.left);
//		preOrder(root.right);
//		}
//	}
//	public void inOrder(treeNode root){	
//		if(root!=null) {
//		inOrder(root.left);
//		System.out.print(root.data);
//		inOrder(root.right);
//		}
//	}
//	public void postOrder(treeNode root){
//		if(root!=null) {
//	
//		postOrder(root.left);		
//		postOrder(root.right);
//		System.out.print(root.data);
//		}
//	}
//}
//
//public class LinkedBinaryTree {
//
//	public static void main(String[] args) {
//		
//		linkedTree T = new linkedTree();
//		
//		
//		treeNode n1 = T.makeTree(null,"A",null);
//		treeNode n2 = T.makeTree(null,"B",null);		
//		treeNode n3 = T.makeTree(n1,"*",n2);
//		treeNode n4 =T.makeTree(null,"C",null);
//		treeNode n5 = T.makeTree(null,"D",null);
//		treeNode n6 = T.makeTree(n4,"/",n5);
//		treeNode n7 = T.makeTree(n3,"-",n6);
//		
//		System.out.println("전위순회");
//		T.preOrder(n7);
//		System.out.println(" ");
//		System.out.println("후위순회");
//		T.postOrder(n7);
//		System.out.println(" ");
//		System.out.println("중위순회");
//		T.inOrder(n7);
//	} //main
//
//} //LinkedBinaryTree
