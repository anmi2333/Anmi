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

  @override
  Widget build(BuildContext context) {
    return ListView(
      /*children: const <Widget>[
      ListTile(
        leading: Icon(Icons.home),
        title: Text("首页"),
        trailing: Icon(Icons.chevron_right_sharp),
      ), //列表
      Divider(), //横线
      ListTile(
        leading: Icon(Icons.assessment, color: Colors.red),
        title: Text("全部订单"),
        trailing: Icon(Icons.chevron_right_sharp),
      ),
      Divider(),
      ListTile(
        leading: Icon(Icons.payment, color: Colors.green),
        title: Text("待付款"),
        trailing: Icon(Icons.chevron_right_sharp),
      ),
      Divider(),
    ]*/
      //padding: const EdgeInsets.all(10),
      children: <Widget>[
        /* ListTile(
          leading: Image.network(
              "https://i0.hdslb.com/bfs/archive/ed2cba8037673df23714b625bb5316a9c6cfa2de.jpg@208w_142h.webp"), //图片
          title: const Text("【散人】国产悬疑惊悚《三伏》 旧时代三眼神童之谜（完结共6P）"), //标题
          subtitle:
              const Text("试玩视频BV1qF411x7ER 前作烟火BV15U4y1x7YS三伏终于上线了。"), //二级标题
        ),
        const Divider(),
        ListTile(
          leading: Image.network(
              "https://i0.hdslb.com/bfs/archive/ed2cba8037673df23714b625bb5316a9c6cfa2de.jpg@208w_142h.webp"), //图片
          title: const Text("【散人】国产悬疑惊悚《三伏》 旧时代三眼神童之谜（完结共6P）"), //标题
          subtitle:
              const Text("试玩视频BV1qF411x7ER 前作烟火BV15U4y1x7YS三伏终于上线了。"), //二级标题
        ),
        const Divider(),
        ListTile(
          leading: Image.network(
              "https://i0.hdslb.com/bfs/archive/ed2cba8037673df23714b625bb5316a9c6cfa2de.jpg@208w_142h.webp"), //图片
          title: const Text("【散人】国产悬疑惊悚《三伏》 旧时代三眼神童之谜（完结共6P）"), //标题
          subtitle:
              const Text("试玩视频BV1qF411x7ER 前作烟火BV15U4y1x7YS三伏终于上线了。"), //二级标题
        ),
        const Divider(),
      */
        Image.network(
            "https://i2.hdslb.com/bfs/archive/bbb626c83b7b324f9bca2685d253fc1a9d39263a.jpg@412w_232h_1c_!web-popular.avif"),
        Container(
          //padding: const EdgeInsets.all(10),
          height: 44,
          child: const Text(
            "我是一个标题",
            textAlign: TextAlign.center,
            style: TextStyle(fontSize: 22),
          ),
        ),
        Image.network(
            "https://i0.hdslb.com/bfs/archive/0cb31ed4bab05eb503bcfbac697ce5d56624e0e2.jpg@412w_232h_1c_!web-popular.avif"),
        Image.network(
            "https://i0.hdslb.com/bfs/archive/7c732bdd83be886d33fd49f3a47c2170141049f5.jpg@412w_232h_1c_!web-popular.avif"),
      ],
    );
  }
}
