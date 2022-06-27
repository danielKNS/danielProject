import java.util.List;

public class BubbleSorting {
    public static void main(String[] args) {
        Integer unsortedNumbers[] = {1, 0, 5, 6, 3, 2, 10, 7, 9, 8, 4};

        System.out.println("Sorted array");

        bubbleSort(unsortedNumbers); 
    }
    private static void bubbleSort(Integer list[])
    {
         // calculating the length of list
        for (Integer inner = 0; inner < list.length; inner++)
            for (Integer outer = 0; outer < list.length-inner-1; outer++) 
                if (list[outer] > list[outer+1]) //comparing the pair of lists
                { // swapping numbers
                    Integer temp = list[outer];
                    list[outer] = list[outer+1]; 
                    list[outer+1] = temp;
                }
            for (Integer i = 0; i < list.length; i++)
            System.out.print(list[i] + " "); //printing the sorted array
            System.out.println();
    }
}
