public class test01 {
	public static void main(String[] args) {
	
		int a = 4;
		if (a > 2) {
			a = (a - 1);
			}
			System.out.println("a=" + a);
			
		T t1 = new T();
		t1.test(7);
	
	}
}

class T {
	
	public void test(int n) {
		if (n > 2) {
		test(n - 1);
		}
		System.out.println("n=" + n);
	}
	
}