void main(List<String> args) {
  //1.number于string类型转换 toString parse
  String a = "123";
  var myNum = int.parse(a);
  print(a);
  print(myNum is int);
  var myNum1 = 12;
  var str = myNum1.toString();
  print(str);
  print(str is String);
  //2其他类型转换成booleans类型
  var str1 = "xxx";
  if (str1.isEmpty) {
    print("str为空");
  } else {
    print(str1);
  }
  //3
}
