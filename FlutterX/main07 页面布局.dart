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
        body: const HomePage(),
      ),
    );
  }
}

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        IconContainer(Icons.home),
        IconContainer(
          Icons.search,
          color: Colors.yellow,
        ),
        IconContainer(Icons.ac_unit_sharp, color: Colors.orange),
      ],
    );
  }
}

//自定义区块
class IconContainer extends StatelessWidget {
  Color color;
  IconData icon;
  IconContainer(this.icon, {super.key, this.color = Colors.red});

  @override
  Widget build(BuildContext context) {
    return Container(
      alignment: Alignment.center,
      height: 120,
      width: 120,
      color: color,
      child: Icon(
        icon,
        color: Colors.white,
        size: 28,
      ),
    );
  }
}
