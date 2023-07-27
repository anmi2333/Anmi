Future<void> fetchData() async {
  // 模拟一个异步操作，比如网络请求或文件读取
  await Future.delayed(Duration(seconds: 2));
  print("Data fetched!");
}

void main() {
  print("Start fetching data...");
  fetchData(); // 异步方法调用
  print("End of main.");
}
