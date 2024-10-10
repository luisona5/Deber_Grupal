
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("\n\n----------------------------BIENVENIDO A SU CALCULADORA VIRTUAL----------------------------");
        System.out.println("\n----------Calculo de areas-----------");
        System.out.println("1) Cuadrado");
        System.out.println("2)Triangulo");
        System.out.println("3) Circulo");
        System.out.println("seleccione una opcion: ");
        n = sc.nextInt();
        if (n == 1) {

            Double base;
            Double altura;
            Double area;
            System.out.println("\n----------Area del Cuadrado-----------");
            System.out.println("ingrese la base: ");
            base = sc.nextDouble();
            System.out.println("ingrese la altura: ");
            altura = sc.nextDouble();
            area = base * altura;
            System.out.println("El area del trinagulo es: " + area);

        }


        System.out.println("Holaaaa");
    }
}