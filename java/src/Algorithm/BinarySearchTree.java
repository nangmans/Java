package Algorithm;


class treeNode {
	int data;
	treeNode left;
	treeNode right;
}

class binaryTree {
	
	public treeNode makeBT(treeNode bt1, int data, treeNode bt2) {
		
		treeNode root = new treeNode();
		
		root.data = data;
		root.left = bt1;
		root.right = bt2;
		
		return root;
	}
	
	public boolean searchBT(treeNode root,int data) {
			
		if(root.data == data) {
			return true;
		}
			else if(root.data > data && root.left!=null) {
				return searchBT(root.left, data);
			}
			else if(root.data < data && root.right!=null) {
				return searchBT(root.right ,data);
		}		
			else {
				return false;
			}
	}
	
	public treeNode insertBT(treeNode root,int data) {
		
		if(searchBT(root,data)==true) {
			System.out.println("값이 이미 있습니다.");
			return null;
		}
			else {
				treeNode I = new treeNode();
				I.data = data;
				
					 if(root.data > data && root.left!=null) {
						return insertBT(root.left, data);
					}
					else if(root.data < data && root.right!=null) {
						return insertBT(root.right ,data);
				}		
					else {
						if(root.data<data) {
							root.right = I;
						}
							else {
								root.left = I;
							}
					}
					 
					 return I;	
			}
		
		}
	public void preOrder(treeNode root){
		if(root!=null) {
		System.out.print(root.data);
		System.out.print(" ");
		preOrder(root.left);
		preOrder(root.right);
		
		
		}
	}
	}

	
	

public class BinarySearchTree {

	public static void main(String[] args) {
		
		binaryTree T = new binaryTree();
		
		
		treeNode n7= T.makeBT(null, 16, null);
		treeNode n6= T.makeBT(null, 14, n7);
		treeNode n5= T.makeBT(null, 5, null);
		treeNode n4= T.makeBT(null, 2, null);
		treeNode n3= T.makeBT(null, 10, n6);
		treeNode n2= T.makeBT(n4, 3, n5);
		treeNode n1= T.makeBT(n2, 8, n3);
		
		
		
		T.insertBT(n1, 11);
		T.insertBT(n1, 17);
		T.insertBT(n1, 15);
		T.preOrder(n1);
		
		
		System.out.println(T.searchBT(n1,17));
	}

}
