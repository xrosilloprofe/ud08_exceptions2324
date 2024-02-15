package es.ieslavereda.exercices;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Copia {
    public static void main(String[] args) {
        try{
            Gato felix = new Gato("Felix",3);
            Gato pepa = new Gato("Pepa",13);
            Gato manuel = new Gato("Manuel",7);
            List<Gato> lista = new ArrayList<>(List.of(felix,pepa,manuel));
            try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("gatitos.dat")))){
                for (Gato gato:lista)
                    out.writeObject(gato);
            }
        } catch (Exception e){
            System.err.println(e);
        }


    }
}
