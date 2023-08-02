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
              //Mybutton(),
              SizedBox(
                height: 50,
              ),
              Circular()
            ],
          ))));
  //body负责设置内容区域
  //代码一般放在body里
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Container(
        margin: const EdgeInsets.fromLTRB(0, 160, 0, 0), //外间距
        //alignment: Alignment.centerLeft,
        height: 300,
        width: 300,
        decoration: const BoxDecoration(
          //容器内细节设置
          color: Colors.yellow, //背景
        ),
        child: Image.network(
          //"https://i0.hdslb.com/bfs/archive/ed2cba8037673df23714b625bb5316a9c6cfa2de.jpg@208w_142h.webp",
          "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg1.gamersky.com%2Fimage2020%2F09%2F20200913_jjj_412_5%2Fgamersky_01small_02_202091311374CF.jpg&refer=http%3A%2F%2Fimg1.gamersky.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1693145709&t=22aba3545f529fe29a34db935b8cbf2a",
          //scale: 1 //缩放
          //alignment: Alignment.centerLeft, //显示容器中的位置
          //fit: BoxFit.fill,
          fit: BoxFit.cover, //不变形拉伸
          repeat: ImageRepeat.repeat,
        ),
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
        color: Colors.black, //按钮颜色
        borderRadius: BorderRadius.circular(20),
      ), //
      child: const Text("启动", //容器文本
          style: TextStyle(color: Colors.white, fontSize: 20)),
    );
  }
}

class Circular extends StatelessWidget {
  const Circular({super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
      height: 150,
      width: 150,
      decoration: BoxDecoration(
          color: Colors.yellow, //颜色
          borderRadius: BorderRadius.circular(75),
          image: const DecorationImage(
              image: NetworkImage(
                  "https://pbs.twimg.com/profile_images/1038794854262759424/HpyHEmot_400x400.jpg"),
              fit: BoxFit.cover)),
    );
  }
}
