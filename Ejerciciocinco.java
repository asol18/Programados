
import java.util.Scanner;

public class EjercicioCinco{

    public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);


    while(num<=0){
        System.out.print("Ingrese un número entero positvo: ");
        int num= scanner.nextInt();
    }

    int factorial= calcularFactorial(num);
    System.out.println("El factorial de: " + num + " es " + factorial);

    } 
    public static int calcularFactorial(int n){
      if (n == 0 || n == 1){
        return 1;
      }else {
        int factorial= 1;
        for (int i= 2; i<= n; i++){
          factorial*= i;
        }
        return factorial;
      }
  } 
}