public class Hero {
  String name;
  int hp;

  /*
  public void attack(){
    //
  }
  */

  public void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }

  public void sit(int sec){
    this.hp += sec;
    System.out.println(this.name + "は" + sec + "秒間座った！");
    System.out.println(this.name + "は体力が" + sec + "回復した！");
  }

  public void slip(){
    this.hp -= 5;
    System.out.println(this.name + "は転んでしまった！");
    System.out.println("5のダメージ！");
  }

  public void run(){
    System.out.println(this.name + "は逃げ出した！");
    System.out.println("GAME OVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
}