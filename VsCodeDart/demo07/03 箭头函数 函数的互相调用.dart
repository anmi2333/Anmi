import 'dart:io';

void main(List<String> args) {
  List myList1 = [2, 3, 5, 6, 3, 1];
  // myList1.forEach((value) {
  //   print(value);
  // });

  //myList1.forEach((value) => print(value));
  //
  var myList2 = myList1.map((value) {
    if (value > 2) {
      return value *= 2;
    }
    return value;
  });
  var myList3 = myList1.map((value) => value > 3 ? value * 2 : value);
  print(myList2.toList());
  print(myList3.toList());
  //自执行方法
  ((n) {
    print(n);
    print("自执行方法");
  })(12);
  //
  var sum = 1;
  fn(n) {
    //sum *= n;
    if (n == 1) {
      return;
    }
    fn(n - 1);
  }

  fn(5);
  print(sum);
}
