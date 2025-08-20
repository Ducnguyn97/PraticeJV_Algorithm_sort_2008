import java.util.Arrays;
import java.util.Scanner;

public class SlectionSort {
    public static void selectionSort(int[] arr){
        for(int i =0; i<arr.length;i++){
            int currentMin = arr[i];
            int currenMinIndex = i;
            for(int j=i+1; j<arr.length;j++){
                if(currentMin>arr[j]){
                    currentMin=arr[j];
                    currenMinIndex=j;
                }
            }
            if(currenMinIndex!=i){
                arr[currenMinIndex]=arr[i];
                arr[i]=currentMin;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int number=scanner.nextInt();
        int[] arr=new int[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter the elements "+(i+1)+" in the array");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Array before sorting" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Array after sorting" + Arrays.toString(arr));
    }
}