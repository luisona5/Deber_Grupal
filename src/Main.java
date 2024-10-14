
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("\n\n----------------------------BIENVENIDO A SU CALCULADORA VIRTUAL----------------------------");

        int n = 0;

        while (n != 4) {

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
            System.out.println("Ingrese la base: ");
            base = sc.nextDouble();
            System.out.println("Ingrese la altura: ");
            altura = sc.nextDouble();
            area = base * altura;
            System.out.println("El area del cuadrado es: " + area);

        }
        else if (n == 2) {

            Double base;
            Double altura;
            Double area;
            System.out.println("\n----------Area del Triangulo-----------");
            System.out.println("Ingrese la base: ");
            base = sc.nextDouble();
            System.out.println("Ingrese la altura: ");
            altura = sc.nextDouble();
            area = (base * altura) / 2;
            System.out.println("El area del trinagulo es: " + area);

        }
        else if (n == 3) {

            System.out.println("\n----------Area del Criculo-----------");
            System.out.println("Ingrese el radio del circulo es: ");
            double radio = sc.nextDouble();
            double areacirculo = 3.141592653 * Math.pow(radio, 2);
            System.out.println("El area del circulo es: " + areacirculo);

        }

        else if (n == 4) {

            System.out.println("Saliendooo .....");

        }

            System.out.println("Muchas gracias :D ");

        }

        sc.close();

    }

}
