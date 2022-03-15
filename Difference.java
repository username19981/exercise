import java.util.Scanner; 

class Difference {
  public static void main(String[] args) {
    int x, y, diff;
    Scanner in = new Scanner(System.in); 
    System.out.println("Type a number:");
    x = in.nextInt(); 

    System.out.println("Type another number:");
    y = in.nextInt(); 

    diff = x - y;  
    System.out.println("Difference is: " + diff); 
  }
} 