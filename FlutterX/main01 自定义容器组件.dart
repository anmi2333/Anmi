import 'package:flutter/material.dart'; //引入flutter官方提供的主题包

void main() {
  //定义一个不需要返回值的主方法
  runApp(MaterialApp(
      //runapp 入口方法 MaterialApp内置根组件
      home: Scaffold(
          //所以flutter都需要 MaterialApp和Scaffold 包裹
          appBar: AppBar(title: const Text("你好fulutter")),
          //appBar:负责设置导航
          body: const MyApp())));
  //body负责设置内容区域
  //代码一般放在body里
}

//代码块 StatelessWidget
class MyApp extends StatelessWidget {
  //抽象类 StatelessWidget必须实现build方法
  //把body里的内容抽离成单独的组件
  //在flutter中 自定义组件其实就是一个类
  //这个类需要继承StatelessWidget/StatefulWidget
  //StatelessWidget(无状态组件)    StatefulWidget(有状态组件)
  const MyApp({Key? key}) : super(key: key); //构造函数 组件的v标识

  @override
  Widget build(BuildContext context) {
    return const Center(
      //返回自定义组件
      child: Text("我是一个自定义组件",
          textDirection: TextDirection.ltr,
          style: TextStyle(
              //color: Colors.red
              color: Color.fromRGBO(36, 36, 32, 1),
              fontSize: 40.0)),
    );
  }
}
