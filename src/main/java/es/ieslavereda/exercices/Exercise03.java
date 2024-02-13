package es.ieslavereda.exercices;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args){
        try{
            Gato felix = new Gato("Felix",3);
//            felix.setNombre("a");
            Gato pepa = new Gato("Pepa",-3);
        } catch (ExcepcionGatuna e){
            System.err.println(e);
        }

        List<Gato> camada = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            try {
                System.out.print("Nombre del gato: ");
                String nombre = scanner.next();
                System.out.print("Edad del gato: ");
                int edad = scanner.nextInt();
                camada.add(new Gato(nombre, edad));
            } catch (InputMismatchException e){
                System.err.println(e);
                scanner.nextLine();
                i--;
            } catch (ExcepcionGatuna e){
                System.err.println(e);
                i--;
            }
        }

        for(Gato gat:camada)
            System.out.println(gat);

    }
}
