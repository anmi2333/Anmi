public class BubbleSort {
	public static void main(String[] args) {
		
		//老韩思路
		int[] arr = {24, 69, 80, 57, 13, 30,55, 55, 66, 77, 88, 99, 99, 67, 44 , 34 , 32, 21, 19,};
		int temp = 0;//用于辅助交换的变量
		
		for(int i = 0; i < arr.length - 1; i++) {//外层循环是n次
			
			for( int j = 0; j < arr.length - 1; j++) {//n次比较
				//如果前面的数>大于后面的数,将交换
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("\n==第" + (i + 1) + "轮==");
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "\t");
			} 
		
	/*	for( int j = 0; j < 4; j++) {//4次比较
			//如果前面的数>大于后面的数,将交换
			if(arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		System.out.println("==第一轮==");
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "\t");
		}
		for( int j = 0; j < 3; j++) {//4次比较
			//如果前面的数>大于后面的数,将交换
			if(arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		System.out.println("\n==第二轮==");
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "\t");
		}
	
		for( int j = 0; j < 2; j++) {//4次比较
			//如果前面的数>大于后面的数,将交换
			if(arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		System.out.println("\n==第三轮==");
			for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "\t");
		}
			for( int j = 0; j < 1; j++) {//4次比较
				//如果前面的数>大于后面的数,将交换
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("\n==第四轮==");
				for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "\t");
			}
			*/
		}
	}
}