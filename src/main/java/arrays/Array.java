package arrays;

import java.util.NoSuchElementException;

public class Array {

    private int[] data;
    private int count;

    public Array(int initialSize) {
        data = new int[initialSize];
    }

    public int getSize() {
        return count;
    }

    public void add(int number) {
        if (count < data.length) {
            data[count++] = number;
        } else {
            // Create new array and assign
            int[] tempArray = new int[data.length * 2];
            for (int i = 0; i < count; i++) {
                tempArray[i] = data[i];
            }
            tempArray[count++] = number;
            data = tempArray;
        }
    }

    public int indexOf(int num) {
        for (int i = 0; i < count; i++) {
            if (data[i] == num) {
                return i;
            }
        }
        return -1;
    }


    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(data[i]);
        }
    }

    public void remove(int number) {
        int index = indexOf(number);
        if (index >= 0) {
            for (int i = index; i < count; i++) {
//                System.out.print("i:: "+ i  +" data[i] ::" +data[i] +" data[i+1:: " + data[i+1] +" \n");
                data[i] = data[i + 1];
            }
            count--;
        } else {
            throw new NoSuchElementException();
        }
    }


}
