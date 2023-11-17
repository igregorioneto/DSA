String somatorio_numeros(int num) {
  int sum = 0;
  String resulting = "";
  for (var i = 1; i < num; i++) {
    if (i % 3 == 0 || i % 5 == 0) {
      resulting += "$i ";
      sum += i;
    }
  }
  return "O Resultante é $resulting \nA Soma é $sum ";
}

void main() {
  print("Entrada de 10");
  print(somatorio_numeros(10));
  print("\nEntrada de 11");
  print(somatorio_numeros(11));
}
