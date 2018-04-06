package tarea_labo2;

/**
 *
 * @author kaztro
 */
public class Producto {
    private String NomProduct;
    private int CantProduct;
    private float costo;

    public Producto(){
        
    }
    
    public Producto(String NomProduct, int CantProduct, float costo) {
        this.NomProduct = NomProduct;
        this.CantProduct = CantProduct;
        this.costo = costo;
    }
    
    public String getNomProduct() {
        return NomProduct;
    }

    public void setNomProduct(String NomProduct) {
        this.NomProduct = NomProduct;
    }

    public int getCantProduct() {
        return CantProduct;
    }

    public void setCantProduct(int CantProduct) {
        this.CantProduct = CantProduct;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}

