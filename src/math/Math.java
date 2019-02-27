package math;



public class Math {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 7, 11};

        int sum = sum(arr);
        System.out.println("sum =" + sum);

        System.out.println("Stdev=" + stdev(new double[]{1, 2, 3, 4, 5}));


    }

    // apelul de metoda se face cu numele metodei si argumente ( valori )

//        printArray(new int[]{3, 4, 5, 6, 7, 10, 120}, "Gigi");
//        printArray(new int[]{3}, "Vasile");
//        printArray(new int[]{1}, "Ion");
//        printArray(new int[]{12, 12, 14}, "Gheorghe");




    public static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];


        }

        return sum;

    }

    //metoda care parcurge un array si afiseaza elementele din el
    //metoda este declarata cu zero, unul sau mai multi parametri
    //si poate returna sau nu un rezultat


//
//    public static void printArray(int[] arr, String s) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
}


//5 ex. For, While, Metode
