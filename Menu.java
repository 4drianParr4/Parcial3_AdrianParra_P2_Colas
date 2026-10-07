import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Menu {
    public static void main(String[] args) {
        Queue<ObjDoc> Documento = new LinkedList();
        Queue<ObjDoc> Cancelados = new LinkedList();
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Validaciones v = new Validaciones();

        boolean continuar = true;
        while (continuar) {
            System.out.println("-----Documentacion AA-----");
            System.out.println("1) Registrar Documento");
            System.out.println("2) Modificar");
            System.out.println("3) Cancelar Solicitud");
            System.out.println("4) Llamar Siguiente");
            System.out.println("5) Finalizar Tramite");
            System.out.println("6) Salir");
            int opt = v.ValidarEntero(sc);

            switch (opt) {
                case 1:
                    Documento = m.RegistrarDocumentos(Documento, sc);
                    break;
                case 2:
                    Documento = m.ModificarInfo(Documento, sc);
                    break;
                case 3:
                    Documento = m.CancelarSolicitud(Documento, Documento, sc);
                    break;
                case 4:
                    Documento = m.Siguiente(Documento);
                    break;
                case 5:
                    m.FinalizarTramite(Documento, Cancelados);
                    break;
                case 6:
                    System.out.println("¡Vuelva Pronto!");
                    continuar = false;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
        
        

    }
    
}