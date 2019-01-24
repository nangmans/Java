package Algorithm;




class randomArray { //1부터 100까지 랜덤한 숫자가 들어있는 배열을 만드는 클래스
	
	int[] arr = new int [100]; //배열의 크기를 100으로 정해준다
	
	
	public int[] array() { //array라는 메소드를 생성, 이 메소드는 난수가 들어있는 100까지의 배열을 생성해준다.
				
		for(int i =0 ;  i <100 ; i++) {
			arr[i]=(int) (Math.random()*100+1); //Math.random()을 통해 난수를 만들 수 있다. Math.random()*최대값+최소값의 구성을 지니고 있다.
		}
		return arr; //난수가 들어있는 배열을 반환
		
	}	
	
	public void printList(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}	
}
class bubbleSort { //bubble sort를 구현하는 클래스, 배열 내에서 반복 도중 한번도 값이 바뀌지 않은 경우는 이미 정렬된 경우이므로 무의미한 반복을 피하기 위해 sorted 함수가 true로 유지될 경우 바로 배열을 리턴하도록 했다.
	
	public int[] sort(int array[], int n) {
		
		for(int i=0; i<array.length;i++) {
			boolean sorted = true;
			for(int j=0; j<array.length-(i+1);i++) {
				if(array[j]>array[j+1]) {
					int temp;
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
					sorted = false;
				}
				if(sorted=true) return array;
			}
		}
		return array;		
	}
	
	public void printList(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}	
	
}
class insertionSort { //insertion sort를 구현하는 클래스, 배열의 2번째 요소를 item 변수에 담고 그 바로 아래 번호를 loc 변수에 담은 뒤 loc번의 요소가 item보다 클때마다 loc+1이 loc번의 요소가 되게 하고 loc를 1씩 줄여 한칸씩 계속 밀려나게 하였다. 
					  //item이 제자리를 찾을 시(item보다 loc번의 요소가 더 작을 시) loc+1번 요소에 item을 담고 i번째의 반복을 끝내도록 하였다.
	
	public int[] sort(int array[], int n) {
		
		for(int i=1; i<array.length; i++) {
			int loc = i-1;
			int item = array[i];
			while(array[loc]>item && loc>=0) {
				array[loc+1]=array[loc];
				loc--;
			}
			array[loc+1]=item;
		
		}
		return array;
	}
	public void printList(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}	
}

class selectionSort { //selection sort를 구현하는 클래스, 배열 내에서 큰 값을 구하는 largest메소드를 통해 매개변수를 받아 sort 메소드가 정렬되지 않은 배열의 맨 끝과 가장 큰 값을 바꿔준다.
	
	public int[] sort(int array[], int n) {
		
		for(int i = n-1 ; i>=0 ; i--) {
			int temp = array[i];
			array[i]=array[largest(array,i)];
			array[largest(array,i)]=temp;
			
		}
		return array;	
	}
	
	
	
	public int largest(int array[], int n) {
		
		int largest = 0;
		
		for(int i=0; i<=n;i++) {
		if(array[i]>array[largest]) {
			largest = i;
		}
			}
		return largest;		
	}
	
	public void printList(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}	
}

		

public class Sort {

	public static void main(String[] args) {
		
		randomArray R = new randomArray(); //randomArray에서 만든 배열을 구현할 객체 R 생성
		
		selectionSort S = new selectionSort();
		
		bubbleSort B = new bubbleSort();
		
		insertionSort I = new insertionSort();
		
		
		int randArray[] = R.array(); //intArray에 R의 난수배열값을 넣어준다
		
//		for(int i=0; i<100 ; i++) {
//			System.out.print(randArray[i]); //for문을 통해 intArray를 출력
//			System.out.print(" ");
//			}
//				
//		System.out.println(" ");
		R.printList(randArray);
		
		System.out.println(" ");
		
		long Ss = System.nanoTime();	 //nanoTime()은 코드수행시 소요되는 시간을 ns(나노초) 단위로 측정하게 해준다.
		S.sort(randArray, 100);
		long Es = System.nanoTime();
		System.out.println("SelectionSort = "+(Es-Ss)/1000.00000+"ns");
	
					
		long Sb = System.nanoTime();
		B.sort(randArray,100);
		long Eb = System.nanoTime();
		System.out.println("BubbleSort = "+(Eb-Sb)/1000.00000+"ns");
		
		long Si = System.nanoTime();
		I.sort(randArray,100);
		long Ei = System.nanoTime();
		System.out.println("InsertionSort = "+(Ei-Si)/1000.00000+"ns");
		
		
		
		
	}

}


