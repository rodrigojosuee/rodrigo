package Ejercicios,java;

public class Promedio {
    public static void main(String[] args) {
        /*
         * More actions
         */
         Scanner s = new Scanner(System.in);
        double prac, exp, inv, exa, act;
        System.out.println("Ingrese las 5 notas separadas por un espacio");
        prac = s.nextDouble();
        exp = s.nextDouble();
        inv = s.nextDouble();
        exa = s.nextDouble();
        act = s.nextDouble();

        double promedio = (prac+exp+inv+exa+act)/5;

        if (promedio >= 10.5) {
            System.out.println("Aprobado con "+promedio);More actions
        } else {
            System.out.println("Desaprobado con "+promedio);
        }
    }
}
