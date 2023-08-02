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
        appBar: AppBar(title: const Text("Amazon")),
        body: const LayoutDemo(),
      ),
    );
  }
}

class LayoutDemo extends StatelessWidget {
  const LayoutDemo({super.key});

  @override
  Widget build(BuildContext context) {
    return ListView(
      padding: const EdgeInsets.all(10),
      children: [
        Row(
          children: [
            Text(
              "热搜",
              style: Theme.of(context).textTheme.titleLarge,
            )
          ],
        ),
        const Divider(),
        Wrap(
          spacing: 10,
          runSpacing: 10,
          children: [
            Button("女装", onPressed: () {}),
            Button("男装", onPressed: () {}),
            Button("童装", onPressed: () {}),
            Button("皮鞋", onPressed: () {}),
            Button("上衣", onPressed: () {}),
            Button("外套", onPressed: () {}),
            Button("裤子", onPressed: () {}),
          ],
        ),
        const SizedBox(
          height: 10,
        ),
        Row(
          children: [
            Text(
              "历史记录",
              style: Theme.of(context).textTheme.titleLarge,
            )
          ],
        ),
        const Divider(),
        // ListView(//报错
        //   children: [
        //     ListTile(
        //       title: Text("女装"),
        //     )
        //   ],
        // )
        Column(
          children: const [
            ListTile(
              title: Text("女装"),
            ),
            Divider(),
            ListTile(
              title: Text("手机"),
            ),
          ],
        ),
        const SizedBox(
          height: 40,
        ),
        //Row(
        //  children: [
        Padding(
          padding: const EdgeInsets.all(40),
          child: OutlinedButton.icon(
              //自适应组件
              style: ButtonStyle(
                  foregroundColor: MaterialStatePropertyAll(Colors.black45)),
              onPressed: () {},
              icon: const Icon(Icons.delete),
              label: const Text("清空历史记录")),
        )

        // ],
        // )
      ],
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
          backgroundColor:
              MaterialStateProperty.all(Color.fromARGB(255, 227, 223, 223)),
          foregroundColor:
              MaterialStateProperty.all(Color.fromARGB(115, 58, 57, 57)),
        ), //背景颜色
        onPressed: onPressed, //凸起摁钮
        child: Text(text));
  }
}
