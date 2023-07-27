void main(List<String> args) {}

abstract class Db {
  //当做接口 接口就是约定 规范
  String? uri;
  add();
  save();
  delete();
}

class Mysql implements Db {
  @override
  add() {
    // TODO: implement add
    throw UnimplementedError();
  }

  @override
  delete() {
    // TODO: implement delete
    throw UnimplementedError();
  }

  @override
  save() {
    // TODO: implement save
    throw UnimplementedError();
  }

  @override
  String? uri;
}

class Mssql {}

class mongodb {}
