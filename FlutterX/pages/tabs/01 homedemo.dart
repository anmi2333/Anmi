import 'package:flutter/material.dart';
import '../../tools/keepAliveWrapper.dart';

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
    _tabController = TabController(length: 8, vsync: this);
    //监听改变事件
    _tabController.addListener(() {
      //print(_tabController.index); //获取两次
      if (_tabController.animation!.value == _tabController.index) {
        print(_tabController.index);
      }
    });
  }

  @override
  void dispose() {
    // TODO: implement dispose
    super.dispose();
    //销毁_tabController
    _tabController.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: PreferredSize(
        //可以配置appbar的高度
        preferredSize: const Size.fromHeight(40),
        child: AppBar(
          elevation: 10, //阴影
          backgroundColor: Colors.white, //标签背景颜色
          //title: const Text("Flutter APP"),
          title: SizedBox(
            height: 30,
            child: TabBar(
              isScrollable: true, //指示器是否可以滑动
              //indicatorColor: Color.fromARGB(255, 69, 169, 245), //指示器的颜色
              indicatorWeight: 2, //指示器高度 小白条
              //indicatorPadding: EdgeInsets.all(1),
              //indicator: const BoxDecoration(color: Color.fromARGB(255, 241, 240, 237)), //标签颜色选中
              labelColor: Colors.red, //标签颜色
              unselectedLabelColor: Colors.black, //未选中的颜色
              labelStyle: const TextStyle(fontSize: 22),
              unselectedLabelStyle: const TextStyle(fontSize: 16),
              indicatorSize: TabBarIndicatorSize.label,
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
                Tab(
                  child: Text("娱乐"),
                ),
                Tab(
                  child: Text("篮球"),
                ),
                Tab(
                  child: Text("国际"),
                ),
                Tab(
                  child: Text("生活"),
                ),
                Tab(
                  child: Text("医疗"),
                ),
              ],
            ),
          ),
          //centerTitle: true,
          //bottom:
        ),
      ),
      body: TabBarView(
        controller: _tabController,
        children: [
          KeepAliveWrapper(
              //自定义缓存组件
              child: ListView(
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
              ),
              ListView(
                children: const [
                  ListTile(
                    title: Text("我是娱乐列表"),
                  )
                ],
              ),
              ListView(
                children: const [
                  ListTile(
                    title: Text("我是篮球列表"),
                  )
                ],
              ),
              ListView(
                children: const [
                  ListTile(
                    title: Text("我是国际列表"),
                  )
                ],
              ),
              ListView(
                children: const [
                  ListTile(
                    title: Text("我是生活列表"),
                  )
                ],
              ),
              ListView(
                children: const [
                  ListTile(
                    title: Text("我是医疗列表"),
                  )
                ],
              ),
            ],
          ))
        ],
      ),
    );
  }
}
