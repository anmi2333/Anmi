import 'package:flutter/material.dart';
import 'package:flutterdemo02/pages/tabs/searchPage.dart';
import 'pages/tabs.dart';
import './pages/tabs/category.dart';
import './pages/tabs/searchPage.dart';
import './pages/tabs/form.dart';
import './pages/tabs/home.dart';
import './pages/tabs/message.dart';
import './pages/tabs/setting.dart';
import './pages/tabs/user.dart';

//引入flutter官方提供的主题包

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
      debugShowCheckedModeBanner: false,
      title: "Flutter Demo",
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      routes: {
        "/": (contxt) => const Tabs(),
        "/seachPage": (contxt) => const SearchPage(),
      },
    );
  }
}
