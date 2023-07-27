void main(List<String> args) {
  //5 打印list
  List list = ["张三", "李四", "王五"];
  List list1 = [
    {"title": "111"},
    {"title": "222"},
    {"title": "333"}
  ];
  for (var i = 0; i < list1.length; i++) {
    print(list1[i]["title"]);
  }

  //打印二维数组
}
