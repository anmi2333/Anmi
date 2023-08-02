/*import 'package:flutter/material.dart';
import './tabs/home.dart';
import './tabs/category.dart';
import './tabs/setting.dart';
import './tabs/user.dart';
import './tabs/message.dart';

class Tabs extends StatefulWidget {
  const Tabs({super.key});

  @override
  State<Tabs> createState() => _TabsState();
}

class _TabsState extends State<Tabs> {
  int _currentIndex = 0;
  final List<Widget> _pages = const [
    //遍历数组
    HomePage(), //
    CategoryPage(), //
    SettingPage(), //
    User(),
    Message(),
  ];
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("QQ管家")),
      drawer: const Drawer(
        //侧边栏
        child: Column(
          children: [
            Row(
              children: [
                Expanded(
                  flex: 1,
                  child: DrawerHeader(
                      decoration: const BoxDecoration(
                          //color: Colors.yellow,
                          image: DecorationImage(
                              fit: BoxFit.cover, //填充图片
                              image: NetworkImage(
                                  "https://img.dlsite.jp/resize/images2/work/doujin/RJ01079000/RJ01078257_img_main_240x240.jpg"))),
                      child: Column(
                        children: const [
                          ListTile(
                            leading: CircleAvatar(
                              backgroundImage: NetworkImage(
                                "https://img.dlsite.jp/resize/images2/work/doujin/RJ01079000/RJ01078257_img_main_240x240.jpg",
                              ),
                            ),
                            title: const Text(
                              "用户",
                              style: TextStyle(color: Colors.black),
                            ),
                          ),
                        ],
                      )),
                )
              ],
            ),
            // SizedBox(
            //   height: 60,
            // ),
            const ListTile(
              leading: CircleAvatar(
                child: Icon(Icons.people),
              ),
              title: Text("个人中心"),
            ),
            const Divider(),
            const ListTile(
              leading: CircleAvatar(
                child: Icon(Icons.settings),
              ),
              title: Text("系统设置"),
            ),
            const Divider(),
          ],
        ),
      ),
      //endDrawer: const Drawer(),
      body: _pages[_currentIndex],
      bottomNavigationBar: BottomNavigationBar(
          type: BottomNavigationBarType.fixed, //如果底部有四个或者四个以上的菜单的时候需要配置这个参数
          iconSize: 35, //底部图标大小
          fixedColor: Colors.red, //表示选中的颜色
          currentIndex: _currentIndex, //第几个菜单
          onTap: (index) {
            //表示点击菜单触发的方法
            setState(() {
              _currentIndex = index; //点击菜单让菜单选中功能
            });
          },
          items: const [
            //导航栏
            BottomNavigationBarItem(icon: Icon(Icons.home), label: "首页"),
            BottomNavigationBarItem(icon: Icon(Icons.category), label: "分类"),
            BottomNavigationBarItem(icon: Icon(Icons.settings), label: "设置"),
            BottomNavigationBarItem(icon: Icon(Icons.people), label: "用户"),
          ]),
    );
  }
}
*/