import java.util.List;

public class BubbleSorting {
    public static void main(String[] args) {
        int unsortedNumbers[] = {1, 0, 5, 6, 3, 2, 10, 7, 9, 8, 4};

        bubbleSort(unsortedNumbers);//calling the bubbleSort function

        System.out.println("Sorted array");

        printArray(unsortedNumbers); //calling the printArray function
    }
    static void printArray(int a[])
    {
        int len = a.length;
        for (int i = 0; i < len; i++)
            System.out.print(a[i] + " "); //printing the sorted array

        System.out.println();
    }
    static void bubbleSort(int a[])
    {
        int len = a.length; // calculating the length of array
        for (int i = 0; i < len-1; i++)
            for (int j = 0; j < len-i-1; j++) 
                if (a[j] > a[j+1]) //comparing the pair of elements
                {
                    // swapping a[j+1] and a[i]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
    }
}
