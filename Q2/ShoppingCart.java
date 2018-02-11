import java.util.*;
public class ShoppingCart{
private ArrayList<ShoppingCartLineItem> list = new ArrayList<ShoppingCartLineItem>();  
    public ArrayList<ShoppingCartLineItem> getAllLineItems(){
        
        return list;
    }
    public void addLineItem(ShoppingCartLineItem item){
        list.add(item);    
    }
    public double getCartTotal(){
        double result = 0;
        for ( ShoppingCartLineItem x: list)
        result += x.getLineTotal();
        
        return result;
    }
    public void clear(){
        list.clear();
    }
}