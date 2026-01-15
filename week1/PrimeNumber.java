import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int num = in.nextInt();

    
    int count=0;

    for(int i=1; i<=num/2; i++){

      if(num%i==0)
      {count++;}
      
     }

    if (count<2)
    {
      System.out.println("prime");
    }
    else{
      System.out.println("Not prime");
    }
    
      
    
  }
  
}
