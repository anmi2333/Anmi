import 'package:flutter/material.dart'; //引入flutter官方提供的主题包

void main() {
  //定义一个不需要返回值的主方法
  runApp(const MyApp());
  //body负责设置内容区域
  //代码一般放在body里
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: Scaffold(
        appBar: AppBar(title: const Text("Flutter app")),
        body: const MyHomePage(),
      ),
    );
  }
}

class MyHomePage extends StatelessWidget {
  const MyHomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Column(
      //内置图标
      children: const [
        SizedBox(
          height: 550, //外间距高度
        ),
        Icon(
          Icons.home,
          size: 70,
          color: Colors.red,
        ),
        Icon(
          Icons.settings,
          size: 70,
          color: Colors.yellow,
        ),
        Icon(
          Icons.search,
          size: 70,
          color: Colors.black,
        )
      ],
    );
  }
}
