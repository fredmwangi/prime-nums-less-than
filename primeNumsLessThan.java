import java.util.List;
import java.util.ArrayList;

public class primeNumsLessThan
{
  public static void main(String[] args)
  {
    int Prime;
    List<Integer> list = new ArrayList<>();
    boolean prime;
    
    for(int i=2;i<100;i++)
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
