import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-->0){
            int C = sc.nextInt(); 
            int D=sc.nextInt(); 
            int L=sc.nextInt();
   
           boolean result=false;
           if(L%4==0 && L<=(C+D)*4L && L>= ((Math.max(0, C-D*2)+D)*4L)){
               result=true;
           }
           if(result==true){
               System.out.println("yes");
           }else{
                System.out.println("no");
           }
            }
         sc.close();
    }
 
 
}
}
