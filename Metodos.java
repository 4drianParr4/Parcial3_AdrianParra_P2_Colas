import java.util.Queue;
import java.util.Scanner;

public class Metodos {
    Validaciones v = new Validaciones();
    int cont = 1;

    Queue<ObjDoc> RegistrarDocumentos(Queue<ObjDoc> docu, Scanner sc) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el nombre de quien lo entrega: ");
            String nombre = v.ValidarString(sc);
            sc.nextLine();
            System.out.println("Ingrese su identificacion: ");
            int documento = v.ValidarEntero(sc);
            sc.nextLine();
            System.out.println("Ingrese el nombre del documento a entregar: ");
            String TipoDoc = v.ValidarString(sc);
            sc.nextLine();
            int turno = cont;
            cont++;
            System.out.println("Turno asignado: " + turno);

            ObjDoc o = new ObjDoc(nombre, documento, TipoDoc, turno);
            System.out.println("¿Desea registrar otro documento? s/n");
            String opt = v.ValidarString(sc);
            if (opt.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        return docu;
    }

    Queue<ObjDoc> ModificarInfo(Queue<ObjDoc> docu, Scanner sc) {
        System.out.println("¿Que desea modificar?");
        String modificar = v.ValidarString(sc);
        for (ObjDoc c : docu) {
            if (modificar.equalsIgnoreCase("nombre")) {
                docu.remove();
                System.out.println("Ingresa el nombre nuevo: ");
                String nom = v.ValidarString(sc);
                // docu.add(nom);

            }
        }

        return docu;
    }

    Queue<ObjDoc> CancelarSolicitud(Queue<ObjDoc> docu, Queue<ObjDoc> Cancelados, Scanner sc) {
        System.out.println("Ingrese el documento del usuario: ");
        int doc = v.ValidarEntero(sc);
        for (ObjDoc c : docu) {
            if (c.getDocumento() == doc) {
                docu.remove();
                docu.offer(c);
            }
            System.out.println("Turno " + "Cancelado");
        }

        return docu;
    }

    ObjDoc actual = null;

    Queue<ObjDoc> Siguiente(Queue<ObjDoc> docu) {
        if (!docu.isEmpty()) {
            actual = docu.poll();
        }else{
            System.out.println("No hay solicitudes en espera");
            return null;
        }
        System.out.println("Turno " + actual.getTurno() + "Nombre " + actual.getNombre());
        return docu;
    }


    public void FinalizarTramite(Queue<ObjDoc> documento, Queue<ObjDoc> Cancelados) {
        System.out.println("-------Informacion Solicitudes-------");
        System.out.println("---------Solicitudes Activas---------");
        for (ObjDoc c : documento) {
            if (!documento.isEmpty()) {
                System.out.println("Nombre: " + c.getNombre() + " / " + "Documento: " + c.getDocumento() + " / "
                    + "Tipo Documento: " + c.getTipoDoc() + " / " + "Turno: " + c.getTurno());
                }
            }
            
        System.out.println();
        System.out.println("--------Solicitudes Canceladas--------");
        for (ObjDoc c : Cancelados) {
            if (!Cancelados.isEmpty()) {
                System.out.println("Nombre: " + c.getNombre() + " / " + "Documento: " + c.getDocumento() + " / "
                    + "Tipo Documento: " + c.getTipoDoc() + " / " + "Turno: " + c.getTurno());
                }
            }
            
    }
}