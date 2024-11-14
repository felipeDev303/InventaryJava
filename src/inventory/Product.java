package inventory;

public class Product {
    private int id;
    private String name;
    private int qty;
    private int price;
    private boolean active = true;

    // Constructor sin argumentos
    public Product() {
    }

    // Constructor con argumentos
    public Product(int id, String name, int qty, int price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isActive(){
        return this.active;
    }

    public void setActive(boolean active){
        this.active=active;
    }

    // Método de la Clase (calcular valor inventario por producto)
    public int setInventoryValue(){
        return this.qty * this.price;
    }

    // Mostrar Método de la Clase
    public void getInventoryValue(){
        System.out.println("Valorización de las existencias: " + setInventoryValue());
    }

    public String toString() {
        return "Product[Item Number=" + this.id + ", Name=" + this.name + ", Quantity in stock=" + this.qty + ", Price=" + this.price + ", Stock Value=" + setInventoryValue() + ", Product Status= " + (this.active && this.qty>0 ? "Activo" : "Descatalogado") + "]";
    }
}