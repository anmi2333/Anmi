import 'package:flutter/material.dart'; //引入flutter官方提供的主题包

void main() {
  //定义一个不需要返回值的主方法
  runApp(MaterialApp(
      //runapp 入口方法 MaterialApp内置根组件
      home: Scaffold(
          //所以flutter都需要 MaterialApp和Scaffold 包裹
          appBar: AppBar(title: const Text("你好fulutter")),
          //appBar:负责设置导航
          body: Column(
            children: const [
              //一次方多个组件的方法!!
              MyApp(),
              Mybutton()
            ],
          ))));
  //body负责设置内容区域
  //代码一般放在body里
}

//容器颜色字体方法
class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Container(
        //容器
        margin: const EdgeInsets.fromLTRB(0, 60, 0, 0), //外间距
        alignment: Alignment.center, //配置container容器内元素的方位
        width: 200,
        height: 200,
        transform: Matrix4.translationValues(0, 0, 0), //外间距位移
        decoration: BoxDecoration(
            //容器内细节设置
            color: Colors.yellow, //背景
            border: Border.all(color: Colors.red, width: 2), //边框
            borderRadius: BorderRadius.circular(10), //配置圆角
            boxShadow: const [
              //阴影
              BoxShadow(
                  color: Colors.black, //阴影颜色
                  blurRadius: 10.0) //阴影强度
            ],
            gradient: const LinearGradient(colors: [
              //渐变色
              Colors.red, Colors.yellow
            ])),
        child: const Text("hello world", //容器文本
            style: TextStyle(color: Colors.black, fontSize: 30)),
      ),
    );
  }
}

class Mybutton extends StatelessWidget {
  const Mybutton({super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
      //按钮
      alignment: Alignment.center,
      width: 200,
      height: 40,
      //padding: const EdgeInsets.fromLTRB(left, top, right, bottom),//里间距
      margin: //外间距
          //const EdgeInsets.all(10), //按钮上下左右10的距离 fromLTRB(left,top,right,bottom)
          const EdgeInsets.fromLTRB(
              0, 40, 0, 0), //fromLTRB(left,top,right,bottom) 指定上下左右距离
      decoration: BoxDecoration(
        color: Colors.blue, //按钮颜色
        borderRadius: BorderRadius.circular(20),
      ), //
      child: const Text("按钮", //容器文本
          style: TextStyle(color: Colors.white, fontSize: 20)),
    );
  }
}

class MyText extends StatelessWidget {
  const MyText({super.key});

  @override
  Widget build(BuildContext context) {
    return Container();
  }
}
