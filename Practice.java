
public class Practice {
	public static void main(String[] args) {
		int a;
		int sum = 1;
		for(a = 0;a <= 100; a++ ) {
			if(a % 2 != 0) {
				System.out.println("奇数是" + a );
				sum += 1;
			}
		}
		System.out.println(sum);
		
		for (int i = 2; i <= 100; i++) {
	       boolean isPrime = true; // 用于记录是否为质数的标志变量
	         for (int j = 2; j < i; j++) {
	         if (i % j == 0) { // 如果i能被j整除，则i不是质数
	             isPrime = false;
	             break;
	         }
	     }
	         if (isPrime) { // 如果i是质数，则输出
	     System.out.println(i);  
	         }
	     }
	}
}


