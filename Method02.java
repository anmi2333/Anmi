public class Method02 {
	public static void main(String[] args) {
		
		int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
		//使用方法完成输出
		MyTools tool = new MyTools();
		tool.printArr(map);
		tool.printArr(map);
		tool.printArr(map);
	}
} 

class MyTools {
		//方法，接受一个二维数组
	public void printArr(int[][] map) {
	//对传入数组进行遍历输出
		System.out.println("=======");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]+ " ");
			}
			System.out.println();
		}
	}
}