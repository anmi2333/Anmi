public class MethodParameter02 {
	public static void main(String[] args) {
	
	Person p = new Person();
	p.name = "milan";
	p.age = 100;
	
	MyTools tools = new MyTools();
	Person p2 = tools.copyPerson(p);
	System.out.println("p的属性 age=" + p.age + " 名字=" + p.name);
	System.out.println("p2的属性 age=" + p2.age + " 名字=" + p2.name);
	
	}
}

class Person {
	String name;
	int age;
}

class MyTools {
	public Person copyPerson(Person p) {
		Person p2 = new Person(); 
		p2.name = p.name;//把原来对象的名字赋给p2.name
		p2.age = p.age;//把原来对象的年龄赋给p2.age

		return p2;
	}
}