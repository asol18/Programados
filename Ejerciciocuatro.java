import java.util.Scanner;
public class EjercicioCuatro{
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese un radio");
        int radio = nextInt();
    }
    func area (int x){
        double pi =(3,14);
        radio=x * x;
        double area = pi*radio;
        System.out.println("El área da" + area);
        return area
    }

    func perimetro(y int){
        double pi =3,14
        double perimetro =2 *pi *y;
        System.out.println("El perímetro es" + perimetro);
        return perimetro
    }
}