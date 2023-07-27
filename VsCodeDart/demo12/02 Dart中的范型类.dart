class MyList<T> {
  List list = <T>[];
  void add(T value) {
    this.list.add(value);
  }

  List getList() {
    return list;
  }
}

void main(List<String> args) {
  MyList l1 = new MyList();
  l1.add("张三");
  l1.add(12);
  l1.add(true);

  print(l1.getList());

  MyList l2 = new MyList<String>();
  l2.add("123");
  print(l2.getList());
}
