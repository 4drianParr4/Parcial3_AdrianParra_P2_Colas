public class ObjDoc {
    private String Nombre;
    private int Documento;
    private String TipoDoc;
    private int Turno;

    public ObjDoc(String nombre, int documento, String tipoDoc, int turno) {
        Nombre = nombre;
        Documento = documento;
        TipoDoc = tipoDoc;
        Turno = turno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int documento) {
        Documento = documento;
    }

    public String getTipoDoc() {
        return TipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        TipoDoc = tipoDoc;
    }

    public int getTurno() {
        return Turno;
    }

    public void setTurno(int turno) {
        Turno = turno;
    }
    
    
    
}