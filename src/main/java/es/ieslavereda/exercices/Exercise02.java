package es.ieslavereda.exercices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        double[] vector = new double[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Valor " + i +": " );
            try {
                vector[i] = sc.nextDouble();
            } catch (InputMismatchException e){
                System.out.println(e);
                sc.nextLine();
                i--;
            }
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

    }
}
