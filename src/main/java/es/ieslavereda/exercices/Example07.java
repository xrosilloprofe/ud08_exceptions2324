package es.ieslavereda.exercices;

public class Example07 {
    public static void main(String[] args) {
        try {
            contieneA("Aray");
            contieneA("Santi");
            contieneA("Jesus");
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void contieneA(String nombre) throws Exception{
        if(!nombre.contains("A") && !nombre.contains("a"))
            throw new Exception(nombre + " no tiene la A");
        System.out.println(nombre);
    }

}
