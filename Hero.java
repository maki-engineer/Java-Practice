public class Hero extends Character {
  Sword sword;

  public Hero(String name, String sword){
    this.name = name;
    this.hp   = 100;
    this.sword = new Sword(sword);
  }

  public Hero(){
    this("テスト用キャラクター", "テストの剣");
  }

  public void attack(Matango m){
    m.hp -= this.sword.damage;
    System.out.println(this.name + "はお化けキノコ" + m.suffix + "に" + this.sword.name + "で攻撃した！");
    System.out.println("お化けキノコ" + m.suffix + "に" + this.sword.damage + "のダメージを与えた！");
  }

  public void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }

  public void sit(int sec){
    this.hp += sec;
    System.out.println(this.name + "は" + sec + "秒間座った！");
    System.out.println(this.name + "は体力が" + sec + "回復した！");
  }

  public final void slip(){
    this.hp -= 5;
    System.out.println(this.name + "は転んでしまった！");
    System.out.println("5のダメージ！");
  }
}
