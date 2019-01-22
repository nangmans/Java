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
			treeNode T = new treeNode();
			T.data = data;
			T.left = null;
			T.right = null;
			
			return T;
		}
		
		if(root.data>data) { //본 노드의 데이터가 삽입하고자 하는 데이터보다 크면
			root.left = insertBT(root.left,data); // 노드의 왼쪽으로 이동해 삽입함수를 재귀적으로 실행시킨다.
			return root; //최종적으로 리프노드까지 내려가 위의 새 노드 T가 부모 노드의 왼쪽에 달리면, return을 통해 종료시킨다.
		}
		else if(root.data<data) {
			root.right = insertBT(root.right,data); //마찬가지로 본 노드의 데이터가 삽입하고자 하는 데이터보다 작으면 오른쪽으로 재귀적으로 실행시킨다.
			return root; //최종적으로 리프노드가 부모 노드의 오른쪽에 달리면, 함수를 종료시킨다. 이 단을 통해 위의 노드까지 새 노드 T로 치환이 안된다.
		}
		else { // 노드의 데이터가 삽입하고자 하는 값이랑 같다면
			return root ; // 본 노드를 호출하고 종료한다.
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
