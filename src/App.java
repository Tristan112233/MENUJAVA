import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido la opcion 1");
                    break;
                case 2:
                    System.out.println("Ha elegido la opcion 2");
                    break;
                case 3:
                    System.out.println("Ha elegido la opcion 3");
                    break;
                case 4:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 4);

        input.close();
    }
}
