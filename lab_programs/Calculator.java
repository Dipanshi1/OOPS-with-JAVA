public class Calculator {
  int add(int a, int b) {
    return a + b;
  }
  float add(float a, float b) {
    return a + b;
  }
  int add(int a, int b, int c) {
    return a + b + c;
  }
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println(calc.add(2, 3));
    System.out.println(calc.add(2.5f, 3.5f));
    System.out.println(calc.add(1, 2, 3));
  }
}
