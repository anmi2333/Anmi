import 'package:flutter/material.dart';
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
      debugShowCheckedModeBanner: false, //去掉debug图标
      title: "Flutter Demo",
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const HomePage(),
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage>
    with SingleTickerProviderStateMixin {
  late TabController _tabController;
  //生命周期函数 当组件初始化的时候就会触发
  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    _tabController = TabController(length: 3, vsync: this);
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        //左侧按钮
        leading: IconButton(
            onPressed: () {
              print("左侧按钮图标");
            },
            icon: const Icon(Icons.menu)),
        backgroundColor: Colors.red, //导航背景颜色
        title: const Text("Flutter App"),
        //右侧按钮图标
        actions: [
          IconButton(
              //右侧按钮
              onPressed: () {
                print("搜索图标");
              },
              icon: const Icon(Icons.search)),
          IconButton(
              //右侧按钮
              onPressed: () {
                print("更多消息");
              },
              icon: const Icon(Icons.more_horiz)),
        ],
        bottom: TabBar(
          //isScrollable: true, //指示器是否可以滑动
          indicatorColor: Colors.blue, //指示器的颜色
          indicatorWeight: 2, //指示器高度 小白条
          //indicatorPadding: EdgeInsets.all(1),
          //indicator: const BoxDecoration(color: Colors.blue),
          labelColor: Colors.black, //标签颜色
          unselectedLabelColor: Colors.white, //未选中的颜色
          labelStyle: const TextStyle(fontSize: 14),
          unselectedLabelStyle: const TextStyle(fontSize: 14),
          controller: _tabController,
          tabs: [
            Tab(
              child: Text("关注"),
            ),
            Tab(
              child: Text("热门"),
            ),
            Tab(
              child: Text("视频"),
            ),
          ],
        ),
      ),
      body: TabBarView(
        controller: _tabController,
        children: [
          ListView(
            children: const [
              ListTile(
                title: Text("我是关注列表"),
              )
            ],
          ),
          ListView(
            children: const [
              ListTile(
                title: Text("我是热门列表"),
              )
            ],
          ),
          ListView(
            children: const [
              ListTile(
                title: Text("我是视频列表"),
              )
            ],
          )
        ],
      ),
    );
  }
}
