public final class Main{
  public static void main(String args[]){
    Dancer d    = new Dancer("くるみん");
    Matango m1 = new Matango('A');

    System.out.println(m1.hp);
    d.attack(m1);
    System.out.println(m1.hp);
  }
}