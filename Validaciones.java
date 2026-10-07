import java.util.Scanner;

public class Validaciones {
    public int ValidarEntero(Scanner sc){
        while (!sc.hasNextInt()) {
            System.out.println("Ingrese solo valores numericos");
            sc.next();
        }
        return sc.nextInt();
    }

    public String ValidarString(Scanner sc){
        while (!sc.hasNextLine()) {
            System.out.println("Ingrese solo caracteres de texto ");
            sc.next();
        }
        return sc.nextLine();
    }
}
