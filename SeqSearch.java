import java.util.Scanner;
public class SeqSearch {
	public static void main(String[] args) {

		//定义一个字符串数组
		String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "轻翼幅王"};
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入名字");
		String findName = myScanner.next();
		
		//遍历数组，逐一比较，如果有，则提示信息，并退出
		int index = -1;
		for(int i = 0; i < names.length; i++) {
			//字符串 比较 equals
			if(findName.equals(names[i])) {
				System.out.println("恭喜你找到 " + findName);
				System.out.println("下标为= " + i);
				index = i;
				break;
			}
		}
		
		if(index == -1);{
			System.out.println("sorry ,没有找到 " + findName);
			}
		}
	}
