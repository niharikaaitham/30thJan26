package arrayStudy;

public class MaxMin {
    public static void main(String[] args) {
        int a[] = {1, 6, 5, 7, 3, 9, 2};
        int max = a[0];
        int min = a[0];
        //Array max or min
        for (int num : a) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
