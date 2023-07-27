abstract class A {
  printA();
}

abstract class B {
  printB();
}

class C implements A, B {
  @override
  printA() {
    print("A");
  }

  @override
  printB() {
    print("B");
  }
}

void main(List<String> args) {
  C c = new C();
  c.printA();
  c.printB();
}
