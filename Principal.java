import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Bienvenidos a la practica de estructuras");
            System.out.println("que desea realizar 1: , 2: 3: 4: salir");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("suerte que digo");
                    continuar = false;
                    break;

                default:
                    break;
            }
        }
    }
}
