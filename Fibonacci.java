public class Fibonacci {
	public static void main(String[] args) {

	abb t1 = new abb();
	int n = 30;
	int res = t1.fibonacci(n);
	if(res != -1) {
	System.out.println("当" + n + "对应的斐波那契数=" + res);
		
		}
	}
}

class abb {
	
	public int fibonacci(int n) {
		if(n >= 1) {
		if(n == 1 || n == 2) {
			return 1;
		}else {
			 return fibonacci(n - 1) + fibonacci(n - 2); 
			}
		}else {
			System.out.println("要求输入的n>=1的整数");
			return -1;
		}
	}
}