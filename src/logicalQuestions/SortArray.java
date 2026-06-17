package logicalQuestions;

import java.util.Arrays;

public class SortArray {
    static void main(String[] args) {
//Write java program to sort array in ascending order int arr[] = {5,2,8,1}
int arr[]={5,2,8,1};
for(int i=0;i<= arr.length-1;i++){
    Arrays.sort(arr);
    System.out.println(arr[i]);
}
    }
}
