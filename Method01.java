public class Method01 {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.speak();//调用方法
	}
} 

class Person {
	
	String name;
	int age;
	//方法(成员方法)
	//添加speak成员方法，输出"我是一个好人"
	public void speak() {//方法公开 方法没有返回值 方法名 ()等于没有返回参数
		//{}
		System.out.println("我是一个好人");
		
	}
}