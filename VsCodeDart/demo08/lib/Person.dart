class Person {
  String name;
  int age;
  //默认构造函数简写

  Person(this.name, this.age);
  void printInfo() {
    print("${this.name}----${this.age}");
  }
}
