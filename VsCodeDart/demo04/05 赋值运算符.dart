void main(List<String> args) {
  int? b; //赋值运算
  b ??= 23;
  print(b);

  int c = 6;
  c ??= 8;
  print(c);
}
