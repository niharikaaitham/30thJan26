package arrayStudy;

public class MultiArrayTest {
    static void main(String[] args) {
        String a[][]={{"aa", "ab", "ac"},{"ba","bb","bc"}}; //l=2 for i
        for(int i=0;i<=a.length-1;i++) {  //row i=0,j=0/ i=1,j=1/i=2,j=2/
for(int j=0;j<=a[0].length-1;j++){ //column j=0,j=1; l=3 for j
    System.out.print(a[i][j]+" ");
}
            System.out.println();
        }
    }
}
