package arrays2;

public interface List<E> {

  int size();

  void add(E element);

  void print();

  void removeAt(int index);

  int indexOf(E value);

  Integer intMax();
}
