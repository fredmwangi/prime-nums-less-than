import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class primeNumsLessThan
{
  public static void main(String[] args)
  {
    int Prime;
    List<Integer> list = new ArrayList<>();
    boolean prime;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = scanner.nextInt();
    
    for(int i=2;i<number;i++)
    {
    	prime = true;
      	for(int k=2;k<i;k++)
        {
        	if(i%k==0)
                {
            	prime = false;
            	break;
        	}
        }
      	if(prime==true)
        {
      		list.add(i);
      	}
    }
    System.out.println(list);
  }
}
