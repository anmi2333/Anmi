public class ArrayAdd {
	public static void main(String[] args) {
		
		//1.定义初始数组 int[] arr = {1,2,3};
		//2.定义一个新的数组 int[] arr = {1,2,3}//下标0-2
		//3.遍历 arr 数组,依次将arr的元素拷贝到 arrNew数组
		//4.付给 arrNew[arrNew.length - 1] = 4;把4赋给arrNew最后一个元素
		//5.让 arr 指向 arrNew; arr = arrNew;原来的arr数组会被销毁
		int[] arr = {1,2,3};
		int[] arrNew = new int[arr.length + 1];
		//遍历 arr数组,依次将arr的元素拷贝到 arrNew数组
		for(int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		//把4赋给arrNew最后一个元素
		arrNew[arrNew.length - 1] = 4;
		//让 arr 指向arrNew
		arr = arrNew;
		//输出arr 看看效果
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + "\t");
		}
	}
}