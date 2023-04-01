public class homework05 {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		//(int)(Math.random() * 100) + 1 生产 随机数 1-100
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println("====arr的元素情况===="); 
		 for(int i = 0;i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		 
		System.out.println("\n====arr的元素情况====");
		for(int i = arr.length - 1; i >= 0; i--){
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println("\n====arr的平均值====");
		double sum = arr[0];
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 1; i < arr.length;i++) {
			
			sum += arr[i];
			
			if(max < arr[i]){//说明max不是最大值，就变化
			   max = arr[i];
			   maxIndex = i; 
			   arr[i] /=  arr.length;
			}
		}
		System.out.println("\nmax= " + max + " maxIndex=" + maxIndex);
		System.out.println("\n平均值= " + (sum / arr.length)); 
		
		//查找数组中是否有8->使用顺序查找
		int findNum = 8;
		int index = -1;//如果找到，就把下标记录到index
		for(int i = 0;i < arr.length;i++) {
		if(findNum == arr[i]) {
			System.out.println("找到数" + findNum + " 下标" + i);
			index = 1;
			break;
			}
		}
		
		if(index == -1) {
			System.out.println("\n没有找到数" + findNum);
		}
	}
}