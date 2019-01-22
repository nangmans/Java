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
	
	public treeNode searchBT(treeNode root,int data) { //재귀적으로 BinaryTree의 search를 구현해보았다.
	
		if(root==null || root.data==data) //본 노드가 값이 없거나 데이터가 일치하면 null값이나 노드 포인터를 리턴한다.
			return root;
	
		if (root.data<data)			{ //노드의 데이터가 찾는 데이터보다 작으면
			
			return searchBT(root.right,data); //오른쪽 방향으로 다시 이 함수를 재귀적으로 실행시킨다.
		
		}
		else {
			
			return searchBT(root.left,data); //혹은 왼쪽 방향으로 실행시킨다.
		}
	}
	
	public treeNode insertBT(treeNode root,int data) { //삽입 또한 재귀적으로 실행해보았다.
		
		if(root==null ) { //본 노드가 null 값이면, 즉 리프노드이면 새 노드를 만들고 이를 호출한다. 밑의 재귀호출의 종말에서 실행되는 단이다.
			
			treeNode N = new treeNode();
			N.data =data;
			N.left=null;
			N.right=null;
		
			return N;
			
		}
		
		if(root.data>data) { //본 노드의 데이터가 삽입하고자 하는 데이터보다 크면
			root.left = insertBT(root.left,data); // 노드의 왼쪽으로 이동해 삽입함수를 재귀적으로 실행시킨다.
			
			return root ; //최종적으로 리프노드까지 내려가 위의 새 노드 T가 부모 노드의 왼쪽에 달리면, return을 통해 종료시킨다.
			
		}
		else {
			root.right = insertBT(root.right,data); //마찬가지로 본 노드의 데이터가 삽입하고자 하는 데이터보다 작으면 오른쪽으로 재귀적으로 실행시킨다.
		
			return root; //최종적으로 리프노드가 부모 노드의 오른쪽에 달리면, 함수를 종료시킨다. 이 단을 통해 위의 노드까지 새 노드 T로 치환이 안된다.
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
		
		
		
	
				T.insertBT(n1, 15);              //insertBT함수는 결국 리턴값으로 n1, 즉 루트값을 반환해야만 한다. 맨 아래 삽입하면서 그 위도 다시 숫자를 넣으며 올라가는 원리이기 떄문이다.
		treeNode n2 = T.searchBT(n1, 15);		// 그래서 변수 n2에 루트가 아닌 별개 노드의 주소를 넣으려면 searchBT함수를 통해 찾는 값의 노드값을 넣어야 한다.
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
