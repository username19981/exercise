import java.util.Scanner; 

class Add {
  public static void main(String[] args) {
    int x, y, sum;
    Scanner in = new Scanner(System.in); 
    System.out.println("Type a number:");
    x = in.nextInt(); 

    System.out.println("Type another number:");
    y = in.nextInt(); 

    sum = x + y;  
    System.out.println("Sum is: " + sum); 
  }
} 