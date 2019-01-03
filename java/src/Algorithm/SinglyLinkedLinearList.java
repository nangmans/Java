//package Algorithm;
//
//import java.util.Scanner;
//public class SinglyLinkedLinearList {
//
//	public static void main(String[] args) {
//		
//		
//		LinkedList L = new LinkedList() ;
//		
//		
//		
//		
//		L.insertLastNode("Sun");
//		L.insertLastNode("Mon");
//	
//		
//		
//		System.out.println("수 노드 뒤에 금 노드 삽입하기");
//		
//		ListNode pre = L.searchNode("Mon");
//		
//		if(pre == null) {
//			System.out.println("찾는 데이터가 없습니다!");
//		}
//			else {
//				L.insertMiddleNode(pre, "금");
//				
//				L.printList();
//				
//			}
//	
//	} //main
//
//} //SinglyLinkedLinearList
//
//class LinkedList {
//	private ListNode head; //head값은 맨 처음 노드를 지정하는 노드로, 리스트의 기준점을 의미한다.
//	
//	public LinkedList() {
//		head = null; //head의 초기값은 null이다.
//	}
//	
//	public void insertMiddleNode(ListNode pre, String data) { //중간에 노드를 삽입하는 메소드
//		
//		ListNode newNode = new ListNode(data); //데이터 값만 가지는 새 노드를 생성(링크는 아래에서 설정하므로 null로 두어도 되기 떄문에 data값만 갖는 노드를 생성한다)
//		
//		newNode.link = pre.link; //이전 노드의 링크값을 새 노드의 링크값으로 옮긴다
//		
//		pre.link = newNode; //그 후 이전 노드의 링크는 새 노드를 지정하게 만든다
//	}
//	
//	public void insertLastNode(String data) { //마지막에 노드를 삽입하는 메소드
//		
//		ListNode newNode = new ListNode(data); //데이터 값만 가지는 새 노드를 생성한다
//		
//		if (head == null) { //만약 헤드값(맨 처음 노드)이 null이라면 아무것도 없는 것이므로 새 노드가 head가 되게 한다.
//			this.head = newNode;
//		}
//		
//		else { //헤드값이 null이 아니라면
//			ListNode temp = head; // while문을 돌리기 위해 temp의 초기값을 head로 설정한 뒤
//			while(temp.link != null) temp = temp.link;  //temp의 링크값이 null이 나올떄까지 temp에 temp의 링크값을 넣어 다음 temp값을 지정하게 만든다.		
//				temp.link = newNode; //while문이 끝나면 마지막 temp의 링크는 null 값이므로 null 대신 새 노드의 값을 지정하게 한다.
//		}
//		
//	}//insertLastNode
//	
//	public void deleteLastNode() { //마지막의 노드를 삭제하는 메소드(반환값이 없으므로 void, 매개변수는 없어도 되므로 ())
//		
//		ListNode pre, temp ; // 현재의 노드를 저장할 temp와 전의 노드를 저장할 pre를 선언한다. 
//		
//		if(head == null) return; //헤드가 null 이라면 비어있는 리스트이므로 return한다.
//		
//		if(head.link == null) { //헤드의 링크가 null이라면 헤드값만 있는 상태이므로
//			
//			head = null; //헤드값을 null로 만든다
//		}
//		else { //리스트에 노드가 존재하는 상태라면
//			pre =head; // pre값에 헤드를
//			temp = head.link; //temp값에 헤드의 링크, 즉 헤드 다음값을 지정한다.
//			
//			while(temp.link !=null) { //현재 temp값의 링크, 즉 다음값이 null이 되면 반복을 중단한다.
//				pre = temp; //현재 temp값을 pre로 밀고
//				temp = temp.link; //temp값은 다음 노드를 지정하게 해서 반복이 진행될수록 현재 노드(temp)와 이전 노드(pre)를 검사한다.
//			}
//				pre.link = null; //반복이 끝난 뒤 temp다음 값이 null이므로(마지막 노드이므로) 이전 노드 링크, 즉 다음값을 null로 만든다.
//			}		
//					
//	}//deleteLastNode
//	
//	public ListNode searchNode(String data) { //특정 data값을 가진 노드를 찾는 메소드
//		ListNode temp = this.head; //ListNode의 head값을 temp에 저장한다.
//		
//		while(temp != null) { //temp가 null이 되면(찾는 data가 없으면) 반복을 중단한다.
//			
//			if(data == temp.getData()) return temp; //getdata메소드로 인해 반환된 temp의 data값이 본 메소드의 매개변수와 같으면 temp를 반환한다.
//			
//			else { //아니라면
//				temp = temp.link; //다음 노드로 넘어간다.
//			}			
//		}
//		return temp; //data값을 못찾으면 null을 반환한다.
//	}//searchNode
//	
//	public void printList() { //리스트 안의 data값을 출력하는 메소드
//		
//		ListNode temp = this.head ; //temp로 head값을 지정한다.
//		
//		System.out.print("List = (");
//		
//		if(temp == null) //temp값이 null이라면, 즉 값이 없다면 
//			
//			System.out.print("저장된 값이 없습니다."); //해당 문구 출력
//		
//		else { //값이 존재한다면
//			
//		while(temp !=null) { //temp값이 null값이 아닐떄까지, 즉 마지막 노드가 나오면 반복 중단
//			
//			System.out.print(temp.getData()); //getdata 메소드로 인해 반환된 현재 temp값의 data값을 출력한다.
//			
//			temp = temp.link; //다음 노드로 넘어간다
//					
//					if(temp != null) { //출력값 중간마다 쉼표를 넣어준다. 마지막 노드가 나오면 넣지 않는다.
//						System.out.print(", ");
//					}
//				
//			}
//		}
//		System.out.print(")");
//		System.out.println(" ");
//		
//	}//printList
//	
//	
//}//LinkedList
//
//class ListNode { //노드 객체를 만드는 클래스
//
//	private String data;
//	public ListNode link;
//	
//	public ListNode() { //아무 값도 없는 노드
//		this.data = null; //this는 클래스의 속성값과 (위의 data,link) 매개변수를 구분하기 위해 쓴다. this가 붙은 것이 클래스의 속성값
//		this.link = null;
//	}
//	
//	public ListNode(String data) { //데이터 값만 있는 노드
//		this.data = data;
//		this.link = null;
//	}
//	public ListNode(String data, ListNode link) { //데이터와 링크 값이 있는 노드
//		this.data = data;
//		this.link = link;
//		}
//
//	public String getData() { // 데이터값을 추출하는 메소드
//		return this.data; 
//	}
//
//}//ListNode
