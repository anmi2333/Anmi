import 'package:flutter/material.dart';
import 'package:flutterdemo02/main.dart';

void main() {
  runApp(const Center(
    child: Text(
      "你好flutter",
      textDirection: TextDirection.ltr,
      style: TextStyle(
          //color: Colors.red
          color: Color.fromRGBO(244, 244, 123, 1)),
    ),
  ));
}
