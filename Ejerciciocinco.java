
import java.util.Scanner;

public class EjercicioCinco{
    public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);

    System.out.print("Ingrese un número: ");
    int numero= scanner.nextInt();
    scanner.close();

    double factorial= calcularFactorial(numero);
    System.out.println("El factorial de: " + numero + " es " + factorial);
    } 
    public static double calcularFactorial(int n){
      if (n == 0 || n == 1){
        return 1;
      }else {
        double factorial= 1;
        for (int i= 2; i<= n; i++){
          factorial*= i;
        }
        return factorial;
      }
  } 
}


 