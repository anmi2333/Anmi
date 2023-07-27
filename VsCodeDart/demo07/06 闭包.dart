void main(List<String> args) {
  var a = 123;
  print(a);
  fn() {
    a++;
    print(a);
  }

  fn();
  fn();
  fn();

  bn() {
    var b = 1234;
    return () {
      b++;
      print(b);
    };
  }

  var c = bn();
  c();
  c();
  c();
}
