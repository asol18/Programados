import java.util.Scanner;
public class  EjercicioUno 
{ 
    public static void main (String [] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese su número");
        int valor= scanner.nextInt ();
        if (valor%2==0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }
}