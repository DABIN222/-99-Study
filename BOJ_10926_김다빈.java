import java.util.Scanner; 
public class Main { 
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in); 
    String id = in.next(); 
    
    if(id.equals("joonas")) { 
      System.out.println(id+"??!"); 
    } else { 
      System.out.println(id); 
    }
  } 
}

