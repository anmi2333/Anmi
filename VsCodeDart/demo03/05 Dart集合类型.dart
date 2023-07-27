void main() {
  //1.第一种定义List的方式
  var l1 = ["张三", 20, 40];
  print(l1);
  print(l1.length);
  print(l1[0]);
  //2.第二种定义List的方式
  var l5 = ["张", 2, 4];
  l5.add("李四");
  print(l5.length);
  //2.第四种定义List的方式
  var l6 = List.filled(2, "6");
  print(l6);
  //l6.add("王武"); //错误写法 固定长度

  var l8 = List<String>.filled(2, "6"); //范型指定类型
}
