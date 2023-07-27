import '../demo11/01 Dart中 implements实现多个接口.dart';

void main(List<String> args) {
  String printUserInfo(String username,
      {required int age, required String sex}) {
    if (age != 0) {
      return "姓名:$username---性别:$sex---年龄:$age";
    }
    return "姓名:性别:年龄保密:";
  }
}
