
public class bubble {
	public static void main(String[] args) {
		//验证数组的排序
		int j = 0; 
		int temp = 0;//定义一个中间保存量
		int[] arr = {1,5,3,3,7,2,9,8};//定义一个一维数组
		for(int i = 0; i < arr.length - 1;i++) {//外层循环for循环数组本身长度次数arr.length
			for(j = 1; j < arr.length - i;j++) {//内层循环for每次的循环次数为外层循环次数减去1 循环到arr.length-i（i++）次
				if(arr[j-1] > arr[j]) {//内层循环if变量 如果前项数字的值大于后项就执行　否则顺序不变 arr[j-1]和arr[j]与不是标号
					//temp的作用数保存变量 防止arr[j-1]和arr[j]数据交换冲突
					temp = arr[j];//令变化前的arr[j]后项等于temp
					arr[j] =arr[j-1];//赋值令j = j-1的值 此时后项的j变成力前项的值
					arr[j-1] = temp;//j-1=temp 因为前面的值已经被覆盖所以 前项值需要去访问中间变量temp
				}
			}
			System.out.print("\t内循环=" + (j - 1));//内层循环次数为外循环的每次-1
		}
			System.out.println();//换行
		 
		for(int i = 0 ; i < arr.length;i++){//for打印定义一个i 次数为数组长度-1
			System.out.print("\t" + arr[i]);//打印数组i 循环每次
		}
	}
}
