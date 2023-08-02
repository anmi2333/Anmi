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

  List<Widget> _initListData() {
    List<Widget> list = [];
    for (var i = 0; i < 20; i++) {
      list.add(ListTile(
        title: Text("我是一个列表---${i}"),
      ));
    }
    return list;
  }

  @override
  Widget build(BuildContext context) {
    //主轴数量
    return GridView.count(
      //图标状态栏方法
      //GridView.count
      //padding: const EdgeInsets.all(10),
      //crossAxisSpacing:10,水平间距
      //mainAxisSpacing:10,垂直间距
      crossAxisCount: 4, //一行显示的宽度数量
      //maxCrossAxisExtent:120
      //childAspectRatio:0.7, 宽高比
      children: const [
        Icon(Icons.pedal_bike),
        Icon(Icons.home),
        Icon(Icons.ac_unit),
        Icon(Icons.search),
        Icon(Icons.settings),
        Icon(Icons.airport_shuttle),
        Icon(Icons.all_inclusive),
        Icon(Icons.beach_access),
        Icon(Icons.cake),
        Icon(Icons.circle),
      ],
    );
  }
}
