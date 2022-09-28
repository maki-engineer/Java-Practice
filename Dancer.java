public class Dancer extends Character {

  public Dancer(String name){
    this.name = name;
  }

  public void dance(){
    System.out.println(this.name + "は情熱的に踊った！");
  }

  public void attack(Matango m){
    System.out.println(this.name + "はお化けキノコ" + m.suffix + "に攻撃した！");
    System.out.println("お化けキノコ" + m.suffix + "に3のダメージ！");
    m.hp -= 3;
  }
}
