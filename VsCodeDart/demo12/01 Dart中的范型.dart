import 'dart:io';

void main(List<String> args) {
  print(getData(1));
  print(getData<String>("123"));
}

T getData<T>(T value) {
  return value;
}
