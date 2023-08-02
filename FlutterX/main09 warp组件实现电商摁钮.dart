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
    return Padding(
      padding: const EdgeInsets.all(10),
      child: Wrap(
        alignment: WrapAlignment.center,
        spacing: 10, //x
        runSpacing: 10, //y
        //direction: Axis.vertical,
        children: [
          //可以放集合
          Button("第一集", onPressed: () {}),
          Button("第二集", onPressed: () {}),
          Button("第三集", onPressed: () {}),
          Button("第四集", onPressed: () {}),
          Button("第五集", onPressed: () {}),
          Button("第六集", onPressed: () {}),
          Button("第七集", onPressed: () {}),
          Button("第八集", onPressed: () {}),
          Button("第九集", onPressed: () {}),
          Button("第十集", onPressed: () {}),
          Button("第十一集", onPressed: () {}),
          Button("第十二集", onPressed: () {}),
          Button("第十三集", onPressed: () {}),
          Button("第十四集", onPressed: () {}),
        ],
      ),
    );
  }
}

//自定义按钮组件
class Button extends StatelessWidget {
  String text; //按钮文字
  void Function()? onPressed; //方法传参
  Button(this.text, {Key? key, required this.onPressed}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return ElevatedButton(
        style: ButtonStyle(
          backgroundColor: MaterialStateProperty.all(
              const Color.fromARGB(255, 255, 255, 255)),
          foregroundColor: MaterialStateProperty.all(
              const Color.fromARGB(115, 107, 106, 106)),
        ), //背景颜色
        onPressed: onPressed, //凸起摁钮
        child: Text(text));
  }
}
