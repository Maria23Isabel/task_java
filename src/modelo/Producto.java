
package modelo;

public class Producto {
    private String codigo;
    private String nombre;
    private int stock;
    private double precio;
    private String descripcion;
    private String provedor;
    public int prioridad;
    
    public Producto() {
    }
    
        public Producto(String codigo, String nombre, int stock, double precio, String descripcion , String provedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.descripcion = descripcion;
        this.provedor = provedor;
       
    }

    public Producto(String codigo, String nombre, int stock, double precio, String descripcion , String provedor ,int p) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.descripcion = descripcion;
        this.provedor = provedor;
        this.prioridad = p;
    }
 
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }
    
    public Object[][] getProductosAbarrotes() {return productosAbarrotes;}

    public void setProductosAbarrotes(Object[][] productosAbarrotes) {this.productosAbarrotes = productosAbarrotes;}
    
    public Object[][] productosAbarrotes = new Object[][] {
            {"AB001", "Arroz", 20, 1.5 ,"Arroz integral de grano largo","San Fernando"},
            {"AB002", "Lentejas", 10, 1.5, "Lentejas secas" , "Bartolome"}
        };
    
    @Override
    public String toString() {
    return "{" + "codigo=" + codigo + ", nombre=" + nombre + ", stock=" + stock + ", precio=" + precio + ", descripcion=" + descripcion + ", provedor=" + provedor + '}';
        }
}
