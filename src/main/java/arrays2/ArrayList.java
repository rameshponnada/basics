package arrays2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayList<E> implements List<E> {

  private E[] data;
  private int size;

  public ArrayList() {
    data = (E[]) new Object[10];
  }

  public ArrayList(int initialSize) {
    data = (E[]) new Object[initialSize];
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public void add(E element) {
    if (size == data.length) {
      E[] tempData = (E[]) new Object[size * 2];
      IntStream.range(0, size).forEachOrdered(i -> tempData[i] = data[i]);
      data = tempData;
    }
    data[size++] = element;
  }

  @Override
  public void print() {
    Arrays.stream(data, 0, size).forEachOrdered(System.out::println);
  }

  @Override
  public void removeAt(int index) {
    if (index >= size || index < 0) return;
    IntStream.range(index, size - 1).forEachOrdered(i -> data[i] = data[i + 1]);
    size--;
  }

  @Override
  public int indexOf(E value) {
    for (int i = 0; i < size; i++) {
      if (value.equals(data[i])) {
        return i;
      }
    }
    return -1;
  }

  @Override
  public Integer intMax() {
    return Arrays.stream(data, 0, size)
        .mapToInt(value -> Integer.parseInt(value.toString()))
        .max()
        .orElse(0);
  }
}
