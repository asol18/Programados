import java.util.Scanner;
public class EjercicioSeis{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Ingrese un número entero:");
        for(int i= 1; i<= 10; i++){
            int numero= scanner.nextInt();
            int resultado= numero * i;
            System.out.println(numero + "x" +i+ "=" + resultado);
        }
    }
}
