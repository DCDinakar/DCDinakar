import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- != 0){
            int n = sc.nextInt();
            int a[] = new int[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            Map<Integer, Integer> mp = new HashMap<>();
            for(int i=0; i<n; i++){
                if(mp.containsKey(a[i])){
                    mp.put(a[i], mp.get(a[i])+1);
                }else{
                    mp.put(a[i], 1);
                }
            }

            ArrayList<Integer> li = new ArrayList<>();
            for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
                if(entry.getValue() >= 2){
                    li.add(entry.getKey());
                }
            }

            if(li.size() <= 1){
                System.out.println("-1");
            }else{
                int max = 0;
                for(int i=0; i<li.size(); i++){
                    if(li.get(i) > max){
                        max = li.get(i);
                    }
                }

                int max2 = 0;
                for(int i=0; i< li.size(); i++){
                    if(li.get(i) > max2 && li.get(i) < max){
                        max2 = li.get(i);
                    }
                }

                int area = max*max2;
                System.out.println(area);
            }
        }
	}
}
