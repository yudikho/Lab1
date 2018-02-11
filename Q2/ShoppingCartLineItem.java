public class ShoppingCartLineItem{
    private int quantity;
    private Product p; // why the box doesnt have this and we have to figure it out ourselves?
    public ShoppingCartLineItem(Product p, int q){
        this.p = p;
        quantity = q;
    }
    public double getLineTotal(){
        return quantity * p.getPrice();
    }
    public int getQuantity(){
        return quantity;
    }
    public void addQuantity(int q){
        quantity += q;
    }
    public Product getProduct(){
        return p;
    }
}   