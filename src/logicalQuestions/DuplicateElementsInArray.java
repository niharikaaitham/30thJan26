package logicalQuestions;

public class DuplicateElementsInArray {
    static void main(String[] args) {
        int a[]={1,0,4,1,6,8,3,4,6,3};
        int count=0;
        for(int i=0;i<=a.length-1;i++){ //i=0,1
            for(int j=i+1;j<=a.length-1;j++){ //j=1,2
                if(a[i]==a[j]){
                    System.out.println("duplicate found "+a[i]);
                    count++;
                }
            }
        }
        System.out.println("Total duplicates are "+count);
    }
}
