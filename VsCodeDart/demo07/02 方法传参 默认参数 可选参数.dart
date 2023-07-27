void main(List<String> args) {
  //1调用方法传参
  sumNum(int n) {
    int sum = 0;
    for (var i = 0; i <= n; i++) {
      sum += i;
    }
    //print("1-" + n + "之和为=" + "$sum");
    return sum;
  }

  //print(sumNum(100));
  //2.调用方法打印用户信息
  printUserInfo(String username, int age) {
    return "姓名:$username---年龄:$age"; //$
  }

  print(printUserInfo("王超", 25));
  //3.定义一个带默认参数的方法
  printUserInfo1(String username, [age1]) {
    return "姓名:$username---年龄:$age1"; //$
  }

  print(printUserInfo1("王超"));

  //4.定义一个带可选参数的方法
  //6.
  fn1() {
    print("我是fn1方法");
  }

  fn2(x) {
    //print("我是fn2方法");
    x();
  }

  fn2(fn1());
}
