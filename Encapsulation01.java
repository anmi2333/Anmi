public class Encapsulation01 {
	public static void main(String[] args) {

		Person22 person = new Person22();
		person.setName("jack");
		person.setAge(30);
		person.setSalary(30000);
		System.out.println();

	}
}


class Person22 {

	public String name;
	private int age;
	private double salary;
	private String job;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double salary() {
		return salary;
	}

	public void setJob(String job) {
		this.job = job;
	}
	public String getJob() {
		return job;
	}
	
	public String info () {
		return "信息为 name=" + name + "年龄=" + age + "薪水=" + salary;
	}
}
