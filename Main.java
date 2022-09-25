public class Main{
  public static void main(String args[]){
    Hero h1    = new Hero("まき", "炎の剣");
    Matango m1 = new Matango('A');

    System.out.println(m1.hp);
    h1.attack(m1);
    System.out.println(m1.hp);
  }
}