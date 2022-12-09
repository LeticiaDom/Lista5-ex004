import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite um numero: ");
        int num = sc.nextInt(); 
        sc.close();
        String numero = detector(num); 
        System.out.println("O numero é " + numero);
    } 
    public static String detector(int num) {
        if (num > 0) {
            return "P"; 
        } else {
            return "N"; 
        }
    }
}
