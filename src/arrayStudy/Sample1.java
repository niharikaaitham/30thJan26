package arrayStudy;

import java.util.Arrays;

public class Sample1 {
    static void main(String[] args) {
        String colours[]=new String[5]; //array declaration -->capacity=5
        colours[0]="red"; //array usage ; indexes-->0,1,2,3,4
        colours[1]="blue";
        colours[2]="green";
        colours[3]="yellow";
        colours[4]="pink";

        System.out.println(colours[0]); //array usage
        //System.out.println(colours[7]); ->ArrayIndexOutOfBoundsException

        System.out.println(colours.length);
        for(int i=0;i<=colours.length-1;i++){
            Arrays.sort(colours);
            System.out.println(colours[i]);
        }
    }
}
