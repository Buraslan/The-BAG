
import java.util.Objects;




public class Bag<E extends Comparable<E>> {
    
    private Element<E> root;
    private Element<E> temp = root;

    private int size=0;
   
   
    
    public Bag(){
        root = null;
        
    }
    
 
    public void add(E data){
        
        Element<E> newNode = new Element<>(data);
        size++;
   
        if(root == null){ 
        root = newNode;
        }
        else{
            
       Element<E> current =root;
       
            while (true) {
                  
                if (data.compareTo(current.getData()) <0 ) 
                {
                    if (current.getLeft()!=null)
                    {
                        current=current.getLeft(); 
                    }
                    else
                    {
                        
                        current.setLeft(newNode); 
                        break;
                    }
                }
                if(data.compareTo(current.getData()) >0 ){ 
                    if (current.getRight()!=null)
                    {
                        current=current.getRight(); 
                    }
                    else
                    {
                        current.setRight(newNode); 
                        break;
                    }
                }
                 if(data.compareTo(current.getData()) ==0){
                    current.upCount(); 
                    break;
                    }
            }
    }
    }
    
    
    public boolean isEmpty(){
        if(root!= null)
        return false;       
        else
        return true; 
        
    }
    
    public void clear(){
        
        root=null; 
    }

    
    
    private String toString(Element<E> root) { 
        
        if(isEmpty())
        {
            return "Bag is empty"; 
        }
        
          else {
            Element<E> current = root;      
            String total = "" ;
            
            
            if (current == null) {            
                return "";
            }
            
          total += toString(current.getLeft())+ " " + 
                  
                  current.getData().toString() + "("+ current.getCount()+")" + 
                  
                  toString(current.getRight());
            

            return total ;

        }
       
        }
    
    
    public String toString() 
    {
       return toString(root);
    }
    

   
    
    public int elementSize(E data) {
            
            Element<E> temp = root;
            int elementSize =0;
            
            if(!contains(data)){
                System.out.println(data+ " is not found in the bag");
            }
            else{
                    while (true) {
                        
                        if(data.compareTo(temp.getData())<0){
                            
                            if(temp.getData()!=null){
                                
                                temp=temp.getLeft();
                                
                            } else break;
                          
                        } else if(data.compareTo(temp.getData())>0){
                            if(temp.getData()!=null){
                            temp=temp.getRight();
                            
                        } else break;
                        
                        } else if(data.compareTo(temp.getData())==0){
                            
                            elementSize= temp.getCount();
                            break;
                            
                        }
                        }   
                        }
                        return elementSize;
            }
            
    
    
    
    public boolean contains(E data)
    {
        Element<E> current=root;
        boolean flag=true;
        while (flag) {
            if (data.compareTo(current.getData()) < 0) {
                if (current.getLeft() != null) {
                    current = current.getLeft();
                }
                else break;


            }  if (data.compareTo(current.getData()) > 0) {
                if (current.getRight() != null) {
                    current = current.getRight();
                }
                else break;

            }  if (data.compareTo(current.getData()) == 0) {

               flag=false;
            }
        }
        return !flag;
    }
   
    
    private int distictSize(Element<E> node){
            if(node!=null){
                
                return (distictSize(node.getLeft()) + 1 + distictSize(node.getRight())); 
                                                                                     
                
            } else return 0;
         
    }
        
    public int distictSize(){      //çantanın rootunu çağırıyoruz
        
        return(distictSize(root));
        
    }
        
        
    
    private Element<E> remove(Element<E> root,E data)
    {
        Element<E> temp = root;
        
       if(temp == null) return temp; 
       
       else if(data.compareTo(temp.getData())<0){ 
        
           temp.setLeft(remove(temp.getLeft(), data));
           
       } else if(data.compareTo(temp.getData())>0){ 
           
           temp.setRight(remove(temp.getRight(), data));
           
       } 
       else if (data.compareTo(temp.getData())==0)
       {
            if (temp.getCount() > 1) {
                temp.downCount();
                return temp;
            }
            else {
                if (temp.getLeft() != null && temp.getRight() != null ) {
                    Element <E> minRight=min(temp.getRight());
                    temp.setData(minRight.getData());
                    remove(temp.getRight(),minRight.getData());
                }
                else if (temp.getLeft() != null ) {
                    temp=temp.getLeft();
                }
                  else if (temp.getRight() != null ) {
                       temp=temp.getRight();
                 }
                 else
                {
                    temp=null;
                }
            }
        }
       
       
        return temp;
    }
       
      
       
    
    public void remove(E data) {
        if (!contains(data)) {
            System.out.println( data + " has not in the Bag");  
        }
        else {
            Element<E> temp = remove(root, data); 
        }
    }
     
     
    private Element<E> min(Element<E> node){
        
        while (node.getLeft()!=null) {
            
            node=node.getLeft();
            
        }
            return node;
        
    }
   
   
    
    
    
    public int getSize(){
        
        return size;
    }
    

    public Element<E> getTemp() {
        return temp;
    }

   
    
    
        public boolean equals(Element<E> node, Element<E> node2) {
         
    if (node ==null && node2== null) {
        return true;
    }
    if (node != null && node2 != null) {
       
    return (node.getData().equals(node2.getData()) && equals(node.getLeft(),node2.getLeft()) &&
           equals(node.getRight(), node2.getRight()));
    
     }else 
        return false;
     
     }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }

        Bag<?> other = (Bag<?>) obj;
        if (this.size != other.size) {
            return false;
        }
       
        if (equals(this.temp, (Element<E>) other.root)) {
            return true;
        }
        return false;
    }
        
        
        
        
        
     
    
    
}