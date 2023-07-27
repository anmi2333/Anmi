import 'dart:convert';
import 'dart:io';

void main() async {
  var result = await getDataFormZhihuAPI();
  print(result);
}

getDataFormZhihuAPI() async {
  //1. 创建对象HttpClient
  var httpClient = new HttpClient();
  //2. 创建对象uri
  var uri = new Uri.http('www.bilibili.com/');
  //3. 发起请求，等待请求
  var request = await httpClient.getUrl(uri);
  //4. 关闭请求，等待响应
  var response = await request.close();
  //5. 解码响应内容
  return await response.transform(utf8.decoder).join();
}
