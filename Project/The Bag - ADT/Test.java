
import java.util.Scanner;


/* Name: BURAK ASLAN
   Id:   180135068
   Comp. Engineering
*/


public class Test {
    
    
    
    
      public static void run(Bag bag){  
       
        
        System.out.println("Wellcome, please choose a operation which you want; ");
        System.out.println("1. Add to Element\n"
                + "2. Remove to Element\n"
                + "3. Clear the Bag\n"
                + "4. it Contains?\n"
                + "5. Distict Size of Bag\n"
                + "6. Element Size\n"
                + "7. İs Empty\n"
                + "8. Size of Bag\n"
                + "9.Print the Bag\n"
                + "10. Equals to Bag\n"
                + "11. Exit");
        
     
        Scanner s=new Scanner(System.in);
        
        boolean dongu = false;
        while (!dongu) {
            
        
        System.out.print(" Your Choise: ");
        int choise = s.nextInt();
        
        s.nextLine();
        
            switch (choise) {
                case 1:
                    
                  System.out.print(" Enter the element: ");
                  String a = s.nextLine();
                  bag.add(a);
                  System.out.println(a+ " was added...");
                    
                    break;
                    
                case 2:
                  System.out.print(" Enter the element: ");
                  String b = s.nextLine();
                  bag.remove(b);
                  System.out.println(b + " was removed...");
                  
                    break;
                        
                case 3:
                    
                    bag.clear();;
                    System.out.println("Your Bag is clear");
                    
                    break;
                    
                 case 4:
                     
                    System.out.print(" Enter the element: ");
                    String c= s.nextLine();
                     
                   if( bag.contains(c)){
                       
                       System.out.println(c+ " has in your Bag ");
                       
                   }
                   else System.out.println(c+ " has not in your Bag");
                    
                    break;
                    
                case 5:
                   System.out.println("\nDistict Size : " + bag.distictSize());
                 
                    break;
                        
                case 6:
                    System.out.print(" Enter the element: ");
                    String d = s.nextLine();
                    System.out.println(" Element size of "+ d +": "+ bag.elementSize(d));
                    
                  
                    break;
                    
                    
                case 7:
                    
                    if(bag.isEmpty()){
                    System.out.println("Your Bag is empty");
        
                    } else System.out.println("Your Bag isn't empty");
       
                    break;
        
                case 8:
                    System.out.println("Size of your Bag: "+ bag.getSize());
                    break;
    
                case 9:
               
                    System.out.println(bag);
                    break;
                    
                case 10:   
                    System.out.println("Didn't find");
                    break;
                     
                 case 11:    
                     
                     System.out.println("Logout...");
                     dongu = true;
            }
    
}
     }
    
    
   
    public static void main(String[] args) {
       
        Bag bag = new Bag();
        Bag bag2 = new Bag();
        Bag bag3 = new Bag();
        Bag bag4 = new Bag();
        
        bag.add(1);
        bag.add(2);
        bag.add(4);
        bag2.add(1);
        bag2.add(2);
        bag2.add(3);
        
        
        if(bag.equals(bag2)){
            System.out.println("İt has equals");
            
            
        }else 
            System.out.println("it hasn't equals");
        
        run(bag3);
        run(bag4);
        

    }
    
  
    
}