import java.util.Scanner;
public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un radio");
        int radio = scanner.nextInt();
        
        EjercicioCuatro ejercicio = new EjercicioCuatro();
        ejercicio.area(radio);
        ejercicio.perimetro(radio);
    }

    public void area(int x) {
        double pi = 3.1416;
        double radio = x * x;
        double area = pi * radio;
        System.out.println("El área es de: " + area);
    }

    public void perimetro(int y) {
        double pi = 3.1416;
        double perimetro = 2 * pi * y;
        System.out.println("El perímetro es de: " + perimetro);
    }
}
