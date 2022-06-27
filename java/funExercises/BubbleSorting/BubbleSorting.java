import java.util.List;

public class BubbleSorting {
    public static void main(String[] args) {
        Integer unsortedNumbers[] = {1, 0, 5, 6, 3, 2, 10, 7, 9, 8, 4};

        // bubbleSort(unsortedNumbers);//calling the bubbleSort function

        System.out.println("Sorted array");

        bubbleSort(unsortedNumbers); //calling the printArray function
    }
    private static void bubbleSort(Integer list[])
    {
         // calculating the length of list
        for (Integer inner = 0; inner < list.length; inner++)
            for (Integer num2 = 0; num2 < list.length-inner-1; num2++) 
                if (list[num2] > list[num2+1]) //comparing the pair of lists
                { // swapping a[j+1] and a[i]
                    Integer temp = list[num2];
                    list[num2] = list[num2+1];
                    list[num2+1] = temp;
                }
        
            Integer lengthOfList2 = list.length;
            for (Integer i = 0; i < lengthOfList2; i++)
            System.out.print(list[i] + " "); //printing the sorted array
            System.out.println();
    }
}
