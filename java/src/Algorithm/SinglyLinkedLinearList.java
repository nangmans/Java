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
	
	public void insertMiddleNode(ListNode pre, String data) { //�߰��� ��带 �����ϴ� �޼ҵ�
		
		ListNode newNode = new ListNode(data); //������ ���� ������ �� ��带 ����(��ũ�� �Ʒ����� �����ϹǷ� null�� �ξ �Ǳ� ������ data���� ���� ��带 �����Ѵ�)
		
		newNode.link = pre.link; //���� ����� ��ũ���� �� ����� ��ũ������ �ű��
		
		pre.link = newNode; //�� �� ���� ����� ��ũ�� �� ��带 �����ϰ� �����
	}
	
	public void insertLastNode(String data) { //�������� ��带 �����ϴ� �޼ҵ�
		
		ListNode newNode = new ListNode(data); //������ ���� ������ �� ��带 �����Ѵ�
		
		if (head == null) { //���� ��尪(�� ó�� ���)�� null�̶�� �ƹ��͵� ���� ���̹Ƿ� �� ��尡 head�� �ǰ� �Ѵ�.
			this.head = newNode;
		}
		
		else { //��尪�� null�� �ƴ϶��
			ListNode temp = head; // while���� ������ ���� temp�� �ʱⰪ�� head�� ������ ��
			while(temp.link != null) temp = temp.link;  //temp�� ��ũ���� null�� ���Ë����� temp�� temp�� ��ũ���� �־� ���� temp���� �����ϰ� �����.		
				temp.link = newNode; //while���� ������ ������ temp�� ��ũ�� null ���̹Ƿ� null ��� �� ����� ���� �����ϰ� �Ѵ�.
		}
		
	}
	
	
}//LinkedList

class ListNode { //��� ��ü�� ����� Ŭ����

	private String data;
	public ListNode link;
	
	public ListNode() { //�ƹ� ���� ���� ���
		this.data = null; //this�� Ŭ������ �Ӽ����� (���� data,link) �Ű������� �����ϱ� ���� ����. this�� ���� ���� Ŭ������ �Ӽ���
		this.link = null;
	}
	
	public ListNode(String data) { //������ ���� �ִ� ���
		this.data = data;
		this.link = null;
	}
	public ListNode(String data, ListNode link) { //�����Ϳ� ��ũ ���� �ִ� ���
		this.data = data;
		this.link = link;
		}

	public String getData() { // �����Ͱ��� �����ϴ� �޼ҵ�
		return this.data; 
	}

}//ListNode
