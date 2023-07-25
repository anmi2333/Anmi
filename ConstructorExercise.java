public class ConstructorExercise {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		System.out.println("p1的信息 name=" + p1.name + " age=" + p1.age);
		Person1 p2 = new Person1("scott", 50);
		System.out.println("p2的信息 name=" + p2.name + " age=" + p2.age);
		
	}
}

class Person1 {
	String name;
	int age;
	//第一个无参构造器：利用构造器设置所有人的age属性初始值都为18
	public Person1() {
	age = 18;
	}
	//第二个带pName和pAge两个参数的构造器
	public Person1(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
} 