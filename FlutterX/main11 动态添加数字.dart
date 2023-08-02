import 'package:flutter/material.dart';
//import 'package:flutterdemo02/main07%20%E9%A1%B5%E9%9D%A2%E5%B8%83%E5%B1%80.dart'; //引入flutter官方提供的主题包

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
      home: const HomePage(),
    );
  }
}

//有状态组件
class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  int _countNum = 0;
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Amazon")),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              "$_countNum",
              style: Theme.of(context).textTheme.headline1,
            ),
            const SizedBox(
              height: 60,
            ),
            ElevatedButton(
                //按钮
                onPressed: () {
                  //需要实现的方法
                  setState(() {
                    //StatefulWidge里面特有的改变值的方法
                    _countNum++;
                    print(_countNum);
                  });
                },
                child: const Text("增加")) //按钮文本
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          setState(() {
            _countNum++;
          });
        },
        child: const Icon(Icons.add),
      ),
    );
  }
}
