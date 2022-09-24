public class Main{
  public static void main(String args[]){
    Cleric c = new Cleric();

    c.name = "まき";
    c.mp = 3;

    int result = c.pray(6);
    System.out.println(result);
  }
}