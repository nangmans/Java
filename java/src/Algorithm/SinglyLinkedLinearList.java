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
//		System.out.println("�� ��� �ڿ� �� ��� �����ϱ�");
//		
//		ListNode pre = L.searchNode("Mon");
//		
//		if(pre == null) {
//			System.out.println("ã�� �����Ͱ� �����ϴ�!");
//		}
//			else {
//				L.insertMiddleNode(pre, "��");
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
//	private ListNode head; //head���� �� ó�� ��带 �����ϴ� ����, ����Ʈ�� �������� �ǹ��Ѵ�.
//	
//	public LinkedList() {
//		head = null; //head�� �ʱⰪ�� null�̴�.
//	}
//	
//	public void insertMiddleNode(ListNode pre, String data) { //�߰��� ��带 �����ϴ� �޼ҵ�
//		
//		ListNode newNode = new ListNode(data); //������ ���� ������ �� ��带 ����(��ũ�� �Ʒ����� �����ϹǷ� null�� �ξ �Ǳ� ������ data���� ���� ��带 �����Ѵ�)
//		
//		newNode.link = pre.link; //���� ����� ��ũ���� �� ����� ��ũ������ �ű��
//		
//		pre.link = newNode; //�� �� ���� ����� ��ũ�� �� ��带 �����ϰ� �����
//	}
//	
//	public void insertLastNode(String data) { //�������� ��带 �����ϴ� �޼ҵ�
//		
//		ListNode newNode = new ListNode(data); //������ ���� ������ �� ��带 �����Ѵ�
//		
//		if (head == null) { //���� ��尪(�� ó�� ���)�� null�̶�� �ƹ��͵� ���� ���̹Ƿ� �� ��尡 head�� �ǰ� �Ѵ�.
//			this.head = newNode;
//		}
//		
//		else { //��尪�� null�� �ƴ϶��
//			ListNode temp = head; // while���� ������ ���� temp�� �ʱⰪ�� head�� ������ ��
//			while(temp.link != null) temp = temp.link;  //temp�� ��ũ���� null�� ���Ë����� temp�� temp�� ��ũ���� �־� ���� temp���� �����ϰ� �����.		
//				temp.link = newNode; //while���� ������ ������ temp�� ��ũ�� null ���̹Ƿ� null ��� �� ����� ���� �����ϰ� �Ѵ�.
//		}
//		
//	}//insertLastNode
//	
//	public void deleteLastNode() { //�������� ��带 �����ϴ� �޼ҵ�(��ȯ���� �����Ƿ� void, �Ű������� ��� �ǹǷ� ())
//		
//		ListNode pre, temp ; // ������ ��带 ������ temp�� ���� ��带 ������ pre�� �����Ѵ�. 
//		
//		if(head == null) return; //��尡 null �̶�� ����ִ� ����Ʈ�̹Ƿ� return�Ѵ�.
//		
//		if(head.link == null) { //����� ��ũ�� null�̶�� ��尪�� �ִ� �����̹Ƿ�
//			
//			head = null; //��尪�� null�� �����
//		}
//		else { //����Ʈ�� ��尡 �����ϴ� ���¶��
//			pre =head; // pre���� ��带
//			temp = head.link; //temp���� ����� ��ũ, �� ��� �������� �����Ѵ�.
//			
//			while(temp.link !=null) { //���� temp���� ��ũ, �� �������� null�� �Ǹ� �ݺ��� �ߴ��Ѵ�.
//				pre = temp; //���� temp���� pre�� �а�
//				temp = temp.link; //temp���� ���� ��带 �����ϰ� �ؼ� �ݺ��� ����ɼ��� ���� ���(temp)�� ���� ���(pre)�� �˻��Ѵ�.
//			}
//				pre.link = null; //�ݺ��� ���� �� temp���� ���� null�̹Ƿ�(������ ����̹Ƿ�) ���� ��� ��ũ, �� �������� null�� �����.
//			}		
//					
//	}//deleteLastNode
//	
//	public ListNode searchNode(String data) { //Ư�� data���� ���� ��带 ã�� �޼ҵ�
//		ListNode temp = this.head; //ListNode�� head���� temp�� �����Ѵ�.
//		
//		while(temp != null) { //temp�� null�� �Ǹ�(ã�� data�� ������) �ݺ��� �ߴ��Ѵ�.
//			
//			if(data == temp.getData()) return temp; //getdata�޼ҵ�� ���� ��ȯ�� temp�� data���� �� �޼ҵ��� �Ű������� ������ temp�� ��ȯ�Ѵ�.
//			
//			else { //�ƴ϶��
//				temp = temp.link; //���� ���� �Ѿ��.
//			}			
//		}
//		return temp; //data���� ��ã���� null�� ��ȯ�Ѵ�.
//	}//searchNode
//	
//	public void printList() { //����Ʈ ���� data���� ����ϴ� �޼ҵ�
//		
//		ListNode temp = this.head ; //temp�� head���� �����Ѵ�.
//		
//		System.out.print("List = (");
//		
//		if(temp == null) //temp���� null�̶��, �� ���� ���ٸ� 
//			
//			System.out.print("����� ���� �����ϴ�."); //�ش� ���� ���
//		
//		else { //���� �����Ѵٸ�
//			
//		while(temp !=null) { //temp���� null���� �ƴҋ�����, �� ������ ��尡 ������ �ݺ� �ߴ�
//			
//			System.out.print(temp.getData()); //getdata �޼ҵ�� ���� ��ȯ�� ���� temp���� data���� ����Ѵ�.
//			
//			temp = temp.link; //���� ���� �Ѿ��
//					
//					if(temp != null) { //��°� �߰����� ��ǥ�� �־��ش�. ������ ��尡 ������ ���� �ʴ´�.
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
//class ListNode { //��� ��ü�� ����� Ŭ����
//
//	private String data;
//	public ListNode link;
//	
//	public ListNode() { //�ƹ� ���� ���� ���
//		this.data = null; //this�� Ŭ������ �Ӽ����� (���� data,link) �Ű������� �����ϱ� ���� ����. this�� ���� ���� Ŭ������ �Ӽ���
//		this.link = null;
//	}
//	
//	public ListNode(String data) { //������ ���� �ִ� ���
//		this.data = data;
//		this.link = null;
//	}
//	public ListNode(String data, ListNode link) { //�����Ϳ� ��ũ ���� �ִ� ���
//		this.data = data;
//		this.link = link;
//		}
//
//	public String getData() { // �����Ͱ��� �����ϴ� �޼ҵ�
//		return this.data; 
//	}
//
//}//ListNode
