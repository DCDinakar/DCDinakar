import java.io.*;
import java.util.Arrays;

class clfibd{
	public static void main(String[] args) throws IOException{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);

		int t = Integer.parseInt(in.readLine());
		String[] out = new String[t];

		for(int i=0; i<t; i++){
			String s = in.readLine();

			char[] arr = s.toCharArray();
			out[i] = isDynamic(arr);
		}
		for(int i=0; i<t; i++)
			System.out.println(out[i]);
	}
	static String isDynamic(char[] arr){
		int[] count = new int[26];
		for(int i=0; i<count.length; i++)
			count[i] = 0;

		for(int i=0; i<arr.length; i++){
			char test = arr[i];
			if(test == 'a')
				++count[0];
			else if(test == 'b')
				++count[1];
			else if(test == 'c')
				++count[2];
			else if(test == 'd')
				++count[3];
			else if(test == 'e')
				++count[4];
			else if(test == 'f')
				++count[5];
			else if(test == 'g')
				++count[6];
			else if(test == 'h')
				++count[7];
			else if(test == 'i')
				++count[8];
			else if(test == 'j')
				++count[9];
			else if(test == 'k')
				++count[10];
			else if(test == 'l')
				++count[11];
			else if(test == 'm')
				++count[12];
			else if(test == 'n')
				++count[13];
			else if(test == 'o')
				++count[14];
			else if(test == 'p')
				++count[15];
			else if(test == 'q')
				++count[16];
			else if(test == 'r')
				++count[17];
			else if(test == 's')
				++count[18];
			else if(test == 't')
				++count[19];
			else if(test == 'u')
				++count[20];
			else if(test == 'v')
				++count[21];
			else if(test == 'w')
				++count[22];
			else if(test == 'x')
				++count[23];
			else if(test == 'y')
				++count[24];
			else if(test == 'z')
				++count[25];
		}
		for(int i=0; i<count.length; i++){
			int sum = count[i];
			
			for(int j=1; j<arr.length; j++)
				for(int k=2;k<arr.length; k++)
					if(count[j] + count[k] == sum && count[j] !=0 && count[k] !=0)
					return "Dynamic";
		}
		return "Not";
	}
}
