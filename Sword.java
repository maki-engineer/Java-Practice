public class Sword {
  String name;
  int damage = new java.util.Random().nextInt(6) + 1;

  public Sword(String name){
    this.name = name;
  }
}
