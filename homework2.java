public class homework2 {
	public static void main(String[] args) {
		
		int i = 1;
		int a = i / 10000;
		int b = i % 10000 / 1000;
		int c = i % 1000 / 100;
		int d = i % 100 / 10;
		int e = i % 10;
	
		while(true) {	
			a = i / 10000;
			b = i % 10000 /1000;
			c = i % 1000 / 100;
			d = i % 100 / 10;
			e = i % 10;		
			if(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) + 
					Math.pow(d, 3) + Math.pow(e, 3) == i) {
				System.out.println("a=" + a + " b=" + b + " c=" + c + " d="
						+ d +  " e=" + e +  " 数字" + i + "是水仙花数");
			}else {
				//System.out.println("数字" + i + "不是水仙花数字");
			}	
			
			if(++i == 100000 ) {
				break;
			}
		}
		//}else {
		//	System.out.println("数字大于" + i + "程序结束");
		//}
		
	}
}