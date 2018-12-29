package Algorithm;

public class SinglyLinkedLinearList {

	public static void main(String[] args) {
	

	} //main

} //SinglyLinkedLinearList

class LinkedList {
	private ListNode head;
	
	public LinkedList() {
		head = null;
	}
	
	public void insertMiddleNode(ListNode pre, String data) { //중간에 노드를 삽입하는 메소드
		
		ListNode newNode = new ListNode(data); //데이터 값만 가지는 새 노드를 생성(링크는 아래에서 설정하므로 null로 두어도 되기 떄문에 data값만 갖는 노드를 생성한다)
		
		newNode.link = pre.link; //이전 노드의 링크값을 새 노드의 링크값으로 옮긴다
		
		pre.link = newNode; //그 후 이전 노드의 링크는 새 노드를 지정하게 만든다
	}
	
	public void insertLastNode(String data) { //마지막에 노드를 삽입하는 메소드
		
		ListNode newNode = new ListNode(data); //데이터 값만 가지는 새 노드를 생성한다
		
		if (head == null) { //만약 헤드값(맨 처음 노드)이 null이라면 아무것도 없는 것이므로 새 노드가 head가 되게 한다.
			this.head = newNode;
		}
		
		else { //헤드값이 null이 아니라면
			ListNode temp = head; // while문을 돌리기 위해 temp의 초기값을 head로 설정한 뒤
			while(temp.link != null) temp = temp.link;  //temp의 링크값이 null이 나올떄까지 temp에 temp의 링크값을 넣어 다음 temp값을 지정하게 만든다.		
				temp.link = newNode; //while문이 끝나면 마지막 temp의 링크는 null 값이므로 null 대신 새 노드의 값을 지정하게 한다.
		}
		
	}
	
	
}//LinkedList

class ListNode { //노드 객체를 만드는 클래스

	private String data;
	public ListNode link;
	
	public ListNode() { //아무 값도 없는 노드
		this.data = null; //this는 클래스의 속성값과 (위의 data,link) 매개변수를 구분하기 위해 쓴다. this가 붙은 것이 클래스의 속성값
		this.link = null;
	}
	
	public ListNode(String data) { //데이터 값만 있는 노드
		this.data = data;
		this.link = null;
	}
	public ListNode(String data, ListNode link) { //데이터와 링크 값이 있는 노드
		this.data = data;
		this.link = link;
		}

	public String getData() { // 데이터값을 추출하는 메소드
		return this.data; 
	}

}//ListNode
