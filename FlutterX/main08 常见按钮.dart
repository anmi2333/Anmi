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
        body: const LayoutDemo(),
      ),
    );
  }
}

class LayoutDemo extends StatelessWidget {
  const LayoutDemo({super.key});

  @override
  Widget build(BuildContext context) {
    return ListView(
      //界面
      children: [
        //子
        Row(
          //行
          mainAxisAlignment: MainAxisAlignment.spaceAround,
          children: [
            //子
            ElevatedButton(
                onPressed: () {
                  print("object");
                }, //按钮 onPressed: () {}传入方法 //可以返回空
                child: const Text("普通按钮")),
            TextButton(
                onPressed: () {}, //文本按钮
                child: const Text("文本按钮"))
          ],
        ),
        Row(
          //行
          mainAxisAlignment: MainAxisAlignment.spaceAround,
          children: [
            //子
            ElevatedButton(
                onPressed: () {
                  print("object");
                }, //按钮 onPressed: () {}传入方法 //可以返回空
                child: const Text("普通按钮")),
            TextButton(
                onPressed: () {}, //文本按钮
                child: const Text("文本按钮"))
          ],
        )
      ],
    );
  }
}
