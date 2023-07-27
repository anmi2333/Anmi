void main(List<String> args) {
  var o1 = new Object();
  var o2 = new Object();
  const o3 = ["1", "2"];
  const o4 = ["1", "2"];

  //identical(o1, o2);
  print(identical(o1, o2)); //是否共用同一个存储空间
  print(identical(o3, o4));
}
