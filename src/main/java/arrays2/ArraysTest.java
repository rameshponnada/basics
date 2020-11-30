package arrays2;

public class ArraysTest {

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>(3);
    l.add(10);
    l.add(30);
    l.add(66);
    l.add(20);
    l.add(11);
    l.add(22);
    //    l.removeAt(4);
    l.print();
    System.out.println(l.size());

    System.out.println(l.indexOf(40));

    System.out.println(l.intMax());
  }
}
