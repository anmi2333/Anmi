void main(List<String> args) {
  List myList = ["香蕉", "苹果", "西瓜"];
  print(myList.length);
  print(myList.isEmpty);
  print(myList.isNotEmpty);
  print(myList.reversed); //倒叙排序

  var newMylist = myList.reversed.toList(); //转换成集合
  print(newMylist);
  //myList.add("桃子");
  myList.addAll(["芒果", "葡萄", "椰子"]); //(["","",""])
  print(myList.indexOf("芒果"));
  myList.removeAt(2);
  myList.fillRange(1, 3, "拉面");
  //print(myList);
  var str = myList.join("-");
  var str1 = "芒果 葡萄 椰子";
  var list1 = str1.split(' ');
  print(str);
  print(list1);
}
