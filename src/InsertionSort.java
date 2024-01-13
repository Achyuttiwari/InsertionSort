import java.util.Scanner;

public class InsertionSort {
    public void insertionSort(int[] array, int sizeOfArray) {
        for (int i = 0; i < sizeOfArray; i++) {
            int keyValue = array[i];
            int j = i - 1;
            while(j >=0 && array[j] > keyValue){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = keyValue;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        System.out.println("Enter the array value: ");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(array, sizeOfArray);
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
