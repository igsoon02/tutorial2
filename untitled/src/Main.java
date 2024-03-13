import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        double[] myArray = {1, 2, 1, 2};
        double[] myArray2 = {3, 4, 3, 4};

        printArray(myArray);// 1, 2, 1, 2
        double[] mergedArray = mergeArrays(myArray, myArray2);
        printArray(mergedArray); // 1, 2, 1, 2, 3, 4, 3, 4
        System.out.println(isInArray(myArray, 3)); // false
        System.out.println(getAlgebraicMean(myArray)); // 1.5
        System.out.println(isIncreasing(myArray)); // false
    }

    //zad 1
    public static void printArray(double[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);


        }
    }


    //zad 2
    public static double[] mergeArrays(double[] myArray, double[] myArray2) {
        List<Double> lista = new ArrayList<>();

        for (double liczba : myArray) {
            lista.add(liczba);
        }

        for (double liczba : myArray2) {
            lista.add(liczba);
        }


        double[] mergedArray = new double[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            mergedArray[i] = lista.get(i);
        }

        return mergedArray;





    }








    //zad 3
    public static boolean isInArray(double[] myArray, double num){

        for(double element : myArray){
            if (element == num){
                return true;
            }
        }
        return false;




    }





    // Zad 4

    public static double getAlgebraicMean ( double[] myArray){
        double sum = 0.0;
        for (var i = 0; myArray.length > i; i++) {
            sum += myArray[i];
        }
        return sum / myArray.length;



    }

    //zad 5
    public  static boolean isIncreasing(double[] myArray){

        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] > myArray[i + 1]) {
                return false; 
            }
        }
        return true;





    }





}





