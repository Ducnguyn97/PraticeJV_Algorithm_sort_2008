import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int number = Integer.parseInt(scanner.nextLine());
        int[] arr=new int[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter element "+(i+1)+" of array");
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        boolean needNextPass=true;
        for(int i=1;i<arr.length && needNextPass ;i++){
            needNextPass=false;
            for(int j=0;j<arr.length -i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    needNextPass=true;
                }
            }
            if(!needNextPass){
                System.out.println("Array may be sorted after step" + i);
                break;
            }
            System.out.println("List after the "+ i + "sort: ");
            System.out.println(Arrays.toString(arr));
        }
    }
}
