void main(List<String> args) {
  //第一种定义maps的方式
  var person = {
    "name": "张三",
    "age": 20,
    "work": ["程序员", "外卖员"]
  };
  print(person);
  print(person["name"]);
  print(person["age"]);
  //第一种定义maps的方式
  var p = new Map();
  p["name"] = "李四";
  p["age"] = 22;
  p["work"] = ["程序员", "外卖员"];
  print(p);
}
