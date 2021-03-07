
public class Element <T> {
    
    private T data;
    private Element<T> left;
    private Element<T> right;
    private int count=1;
    
    
    public Element(T data){
        this.data=data;
        this.right=null;
        this.left=null;
        this.count=count;
         
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Element<T> getLeft() {
        return left;
    }

    public void setLeft(Element<T> left) {
        this.left = left;
    }

    public Element<T> getRight() {
        return right;
    }

    public void setRight(Element<T> right) {
        this.right = right;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
    public void upCount(){
    
    count++;
    
    
}
    public void downCount(){
        
        count--;
        
    }
    
   
  
     
    
}
