public class ArrayReverse {
	public static void main(String[] args) {
		
		//定义数组
		int[] arr = {11, 22, 33, 44, 55, 66}; 
		//思路
		//1.把 arr [0] arr[5] 进行交换{66,22,33,44,55,11}
		//2.把 arr [1] arr[4] 进行交换{66,55,33,44,22,11}
		//3.把 arr [2] arr[3] 进行交换{66,55,44,33,22,11}
		//4.一共要交换 3 次 = arr.length / 2
		//5.每次交换时，对应下标是arr[i] 和 arr[arr.length -1 -i]
		//代码
		int temp = 0;
		int len = arr.length;
		for( int i = 0; i < len / 2; i++) {
			temp = arr[len - 1 - i];//保存temp值
			arr[len - 1 - i] = arr[i];//赋值
			arr[i] = temp;//反相赋值
		}
			
			System.out.println("========反转后的数组=========");
			for(int i = 0; i < len; i++) {
			System.out.println(arr[i] + "\t");//66,55,44,33,22,11
		}
	} 
}