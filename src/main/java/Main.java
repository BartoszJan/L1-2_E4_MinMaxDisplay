import java.util.Scanner;

/**
 * Created by Bartek on 2017-09-13.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Wprowadzadź liczby. Program będzie pokazywał najmniejszą i największą dotychczas wprowadzoną. Wpisanie -1 zakończy program");
        Scanner scanner2 = new Scanner(System.in);
        int numMax = scanner2.nextInt();
        int numMin = numMax;
        int numCom;
        do {
            numCom = scanner2.nextInt();
            if (numMax >= numCom)
                numMax = numMax;
            else numMax = numCom;
            if (numMin <= numCom)
                numMin = numMin;
            else numMin = numCom;
            System.out.println("Najmniejsza liczba to: " + numMin + ", a największa : " + numMax);
        }
        while (numCom != -1);
    }
}
