public class TwoDimensionalArray01 {
	public static void main(String[] args) {
		
		/*
		请用二维数组输出以下 
		0 0 0 0 0 0
		0 0 1 0 0 0
		0 2 0 3 0 0
		0 0 0 0 0 0
		*/
		
		//二维数组是什么
		//定义形式 int[][]
		//原来的一维数组的每个元素是一维数组
		int[][] arr = 
	           {{0, 0, 0, 0, 0, 0},
				{0, 0, 1, 0, 0, 0},
				{0, 2, 0, 3, 0, 0},
				{0, 0, 0, 0, 0, 0}};
		
		for(int i = 0;i < arr.length;i++) {
		//遍历二维数组的每个元素(数组)
		//1.arr[i]表示二维数组的第i+1个元素, 比如arr[0]:二维数组的第一个元素
		//2.arr[i].length 得到对应的每个一维数组的长度
			for(int j = 0; j < arr[i].length;j++) {
		System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}