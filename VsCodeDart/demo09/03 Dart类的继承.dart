void main(List<String> args) {}

class Person {
  String name = "张三";
  num age = 20;
  //默认构造函数简写
  void printInfo() {
    print("${this.name}----${this.age}");
  }
}

class web extends Person {}
