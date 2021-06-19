import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	try {
	    Scanner sc= new Scanner(System.in);
	  int n= sc.nextInt();
	  for (int i=0;i<n;i++){
	      char id= sc.next().charAt(0);
          if (id == 'b' || id == 'B') {
              System.out.println("BattleShip");
          } else if (id == 'C' || id == 'c') {
              System.out.println("Cruiser");
          } else if (id == 'D' || id == 'd') {
              System.out.println("Destroyer");
          } else if (id == 'f' || id == 'F') {
              System.out.println("Frigate");
          }
      }
	} catch(Exception e) {
	} finally {
	}
	}
}
