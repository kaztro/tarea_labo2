package tarea_labo2;

/**
 *
 * @author kaztro
 */
public class Proveedor {
    private String Nombre;
    private String Tel;
    private String Empresa;

    public Proveedor(){
        
    }
        
    public Proveedor(String Nombre, String Tel, String Empresa) {
        this.Nombre = Nombre;
        this.Tel = Tel;
        this.Empresa = Empresa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }
}

