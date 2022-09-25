public class Main{
  public static void main(String args[]){
    Hero h1 = new Hero("まき");

    Hero h2 = new Hero("ダイチ");

    Hero h3 = new Hero();

    System.out.println(h1.name);
    System.out.println(h2.name);
    System.out.println(h3.name);
  }
}