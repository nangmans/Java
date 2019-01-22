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
	
	public treeNode searchBT(treeNode root,int data) { //��������� BinaryTree�� search�� �����غ��Ҵ�.
	
		if(root==null || root.data==data) //�� ��尡 ���� ���ų� �����Ͱ� ��ġ�ϸ� null���̳� ��� �����͸� �����Ѵ�.
			return root;
	
		if (root.data<data)			{ //����� �����Ͱ� ã�� �����ͺ��� ������
			
			return searchBT(root.right,data); //������ �������� �ٽ� �� �Լ��� ��������� �����Ų��.
		
		}
		else {
			
			return searchBT(root.left,data); //Ȥ�� ���� �������� �����Ų��.
		}
	}
	
	public treeNode insertBT(treeNode root,int data) { //���� ���� ��������� �����غ��Ҵ�.
		
		if(root==null ) { //�� ��尡 null ���̸�, �� ��������̸� �� ��带 ����� �̸� ȣ���Ѵ�. ���� ���ȣ���� �������� ����Ǵ� ���̴�.
			
			treeNode N = new treeNode();
			N.data =data;
			N.left=null;
			N.right=null;
		
			return N;
			
		}
		
		if(root.data>data) { //�� ����� �����Ͱ� �����ϰ��� �ϴ� �����ͺ��� ũ��
			root.left = insertBT(root.left,data); // ����� �������� �̵��� �����Լ��� ��������� �����Ų��.
			
			return root ; //���������� ���������� ������ ���� �� ��� T�� �θ� ����� ���ʿ� �޸���, return�� ���� �����Ų��.
			
		}
		else {
			root.right = insertBT(root.right,data); //���������� �� ����� �����Ͱ� �����ϰ��� �ϴ� �����ͺ��� ������ ���������� ��������� �����Ų��.
		
			return root; //���������� ������尡 �θ� ����� �����ʿ� �޸���, �Լ��� �����Ų��. �� ���� ���� ���� ������ �� ��� T�� ġȯ�� �ȵȴ�.
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
	
	public void deleteTree(treeNode root,treeNode delete,treeNode parent) {
		
		if(root==delete) {
			root=deleteNode(root);
		}
		else if(parent.left==delete) {
			parent.left=deleteNode(delete);
		}
		else  {
			parent.right=deleteNode(delete);
		}
		}
		
	
	
	public treeNode deleteNode(treeNode delete) {
		
		if(delete.left==null && delete.right==null) {
			return null; //case1
		}
		
		else if(!delete.left.equals(null) && delete.right.equals(null)) {
			return delete.right; //case 2-1
		}
		
		else if(delete.left.equals(null) && !delete.right.equals(null)) {
			return delete.left; //case 2-2
		}
		
		else { //case 3
			treeNode s = delete.right;
			while(s.left!=null) {
				s=s.left;
			}
			return s;
		}		
	}
	
	}

	
	

public class BinarySearchTree {

	public static void main(String[] args) {
		
		binaryTree T = new binaryTree();
	
		
		
		
		treeNode n1= T.makeBT(null, 55, null);
		
		
		
	
				T.insertBT(n1, 15);              //insertBT�Լ��� �ᱹ ���ϰ����� n1, �� ��Ʈ���� ��ȯ�ؾ߸� �Ѵ�. �� �Ʒ� �����ϸ鼭 �� ���� �ٽ� ���ڸ� ������ �ö󰡴� �����̱� �����̴�.
		treeNode n2 = T.searchBT(n1, 15);		// �׷��� ���� n2�� ��Ʈ�� �ƴ� ���� ����� �ּҸ� �������� searchBT�Լ��� ���� ã�� ���� ��尪�� �־�� �Ѵ�.
				T.insertBT(n1, 60);
		treeNode n3 =T.searchBT(n1, 60);
				T.insertBT(n1, 8);
		treeNode n4 =T.searchBT(n1, 8);
				T.insertBT(n1, 28);
		treeNode n5 =T.searchBT(n1, 28);
				T.insertBT(n1, 90);
		treeNode n6=T.searchBT(n1, 90);
				T.insertBT(n1, 3);
		treeNode n7 =T.searchBT(n1, 3);
				T.insertBT(n1, 18);
		treeNode n8 =T.searchBT(n1, 18);
				T.insertBT(n1, 45);
		treeNode n9 =T.searchBT(n1, 45);
				T.insertBT(n1, 41);
		treeNode n10 =T.searchBT(n1, 41);
				T.insertBT(n1, 48);
		treeNode n11 =T.searchBT(n1, 48);
				T.insertBT(n1, 30);
		treeNode n12=T.searchBT(n1, 30);
				T.insertBT(n1, 50);
		treeNode n13=T.searchBT(n1, 50);
				
		
		System.out.println(n2.data);
		System.out.println(n5.data);
		
		T.deleteTree(n1, n5, n2);
	
		
		
		T.preOrder(n1);
		
		
		
	}

}
