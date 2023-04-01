public class homework04 {
	public static void main(String[] args) {

		
		//定义原数组
		int [] arr = {10, 12, 45, 90};
		int insertNum = 23;
		int index = -1; //index就是要插入的位置
		
		//遍历 arr数组,如果发现 insertNum<=arr[i],说明i就是要插入的位置
		//使用 index 保留 index = i;
		//如果遍历完后，没有发现 insterNum<=arr[i], 说明 index = arr.length
		//即:添加到arr的最后
		
		for(int i = 0; i < arr.length; i++) {
			if(insertNum <= arr[i]) {
				index = i;
				break;//找到位置，就退出
			}
		}
		//判断index 的值
		if(index == -1) {//说明还没有找到位置
			index = arr.length;
		}
		
		//扩容
		//先创建一个新的数组，大小arr.length + 1
		int[] arrNew = new int[arr.length +1];
		for(int i = 0,j = 0; i < arrNew.length; i++) {
			if(i != index) {//说明可以把arr的元素拷贝到arrNew
				arrNew[i] = arr[j];
				j++;
			}else {//i这个位置就是要插入的数
				arrNew[i] = insertNum;
			}
		}
		//让arr 指向 arrNew，原来的数组，就成为垃圾 被销毁
		arr = arrNew;
		
		System.out.println("=====插入后,arr数组的的¥元素情况=====");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}