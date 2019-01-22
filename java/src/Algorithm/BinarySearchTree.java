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
			treeNode T = new treeNode();
			T.data = data;
			T.left = null;
			T.right = null;
			
			return T;
		}
		
		if(root.data>data) { //�� ����� �����Ͱ� �����ϰ��� �ϴ� �����ͺ��� ũ��
			root.left = insertBT(root.left,data); // ����� �������� �̵��� �����Լ��� ��������� �����Ų��.
			return root; //���������� ���������� ������ ���� �� ��� T�� �θ� ����� ���ʿ� �޸���, return�� ���� �����Ų��.
		}
		else if(root.data<data) {
			root.right = insertBT(root.right,data); //���������� �� ����� �����Ͱ� �����ϰ��� �ϴ� �����ͺ��� ������ ���������� ��������� �����Ų��.
			return root; //���������� ������尡 �θ� ����� �����ʿ� �޸���, �Լ��� �����Ų��. �� ���� ���� ���� ������ �� ��� T�� ġȯ�� �ȵȴ�.
		}
		else { // ����� �����Ͱ� �����ϰ��� �ϴ� ���̶� ���ٸ�
			return root ; // �� ��带 ȣ���ϰ� �����Ѵ�.
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
		
		
		
		T.insertBT(n1, 23);
		T.preOrder(n1);
		
		
		
	}

}
