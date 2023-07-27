void main(List<String> args) {
  // Map person = {"name": "张三", "age": 20};
  // print(person.keys.toList());
  // print(person.values.toList());
  // person.addAll({"work": "敲代码"});
  // print(person);

  // List myList = ["芒果", "葡萄", "椰子"];
  // for (var item in myList) {
  //   print(item);
  // }

  // myList.forEach((value) {
  //   print("$value");
  // });

  // List myList1 = [2, 4, 6];
  // var newList = myList1.map((value) {
  //   //修改集合数据
  //   return value * 2;
  // });
  // print(newList);
  List myList2 = [1, 3, 4, 5, 7, 8, 9];

  var newList1 = myList2.where((value) {
    //判断条件 当...满足条件时 输出满足条件的集合
    return value > 5;
  });
  print(newList1.toList());

  var f = myList2.any((value) {
    //判断条件 当...满足条件时 返回true
    //every 需要每一个满足条件
    return value > 5;
  });
}
