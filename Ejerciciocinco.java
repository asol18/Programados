import java.util.Scanner;

public class EjercicioCinco{
    public static void main(String[] args);
    Scanner scanner= new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num= scanner nextInt();
    System.out.println("El factorial de :" + num + "es" + fac);
}
public static double factorial(int n){
    double aux= 1;
    for (int i=2 i<= n; i++){
        aux*= i;
    }
    return aux;
}