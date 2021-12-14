//コンソールに直接文字や数字を入力する
import java.util.Scanner; //Scannerクラスを読み込む

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //Scanner 変数名 = new Scanner(System.in);

    System.out.print("名前：");

    String firstName = scanner.next();  //文字列は 変数名.next()

    System.out.print("名字：");

    String lastName = scanner.next();

    System.out.print("年齢：");

    int age = scanner.nextInt();　//整数列は 変数名.nextInt()

    System.out.print("身長(m)：");

    double height = scanner.nextDouble();　//小数点がある数字は 変数名.nextDouble()

    System.out.print("体重(kg)：");

    double weight = scanner.nextDouble();

    Person.printData(Person.fullName(firstName, lastName), age, height, weight);
  }
}