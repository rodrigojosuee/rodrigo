public class Aleatorio1 {
    public static void main(String[] args) {
        System.out.println("Genera 10 nùmeros aleatorios");

        for (int i=1;i <=10; i++) {
            System.out.println((int)(Math.random()*11)+21);
        }    
    }
}
        