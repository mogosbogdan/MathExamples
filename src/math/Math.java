package math;


public class Math {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 7, 11};

        int sum = sum(arr);
        System.out.println("sum =" + sum);

    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];


        }

        return sum;

    }
}
