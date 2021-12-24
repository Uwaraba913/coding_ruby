class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;
  Car(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public void run(int run) {
    System.out.println(run + "km走ります");
    if(this.fuel < run) {
      System.out.println("ガソリンが足りません");
    } else {
      this.fuel = this.fuel - run;
      this.distance = this.distance + run;
    }
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" +  this.fuel + "L");
  }

  public void charge(int g) {
    System.out.println(g + "L給油します");
    if(g <= 0) {
      System.out.println("給油できません");
    } else if(g + this.fuel >= 100) {
      System.out.println("満タンまで給油します");
      this.fuel = 100;
    } else {
      this.fuel += g;
    }
    System.out.println("ガソリン量：" + this.fuel + "L");
  }

  public void printData() {
    System.out.println("【車の情報】");
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
}