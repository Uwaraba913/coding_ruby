import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Bicycle byc = new Bicycle("ビアンキ", "緑");
    byc.printData();
    Scanner s = new Scanner(System.in);
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int i = s.nextInt();
    byc.run(i);
    System.out.println("=================");

    Car car1 = new Car("フェラーリ", "赤");
    car1.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int r = s.nextInt();
    car1.run(r);
    System.out.println("-----------------");
    int g = s.nextInt();
    car1.charge(g);
  }
}