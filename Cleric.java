public class Cleric {
  String name;
  int hp          = 50;
  final int MAXHP = 50;
  int mp          = 10;
  final int MAXMP = 10;

  public void selfAid(){
    this.mp -= 5;
    this.hp = this.MAXHP;
    System.out.println(this.name + "はセルフエイドを使用した！体力が全回復した！");
  }

  public int pray(int sec){
    int recMp = new java.util.Random().nextInt(3) + sec;

    if((recMp + this.mp) > this.MAXMP){
      recMp -= (recMp + this.mp) - this.MAXMP;
      this.mp += recMp;
      return recMp;
    }else{
      this.mp += recMp;
      return recMp;
    }
  }
}
