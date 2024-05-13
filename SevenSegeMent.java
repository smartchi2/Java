import java.util.*;

 public class SevenSegeMent{
	public static void main(String...args){

Public String sevenSegeMents(String S, int N){
		Vector<int>numOfSegeMents = {6,2,5,5,4,5,6,3,7,5};
		
			int sum = 0;
		   for(int i = 0; i < N; i++){
		   sum += numOfSegeMents[S[i]-'0'];
			}
			sum -=2*N;
			Vector<int>output(N(2));
			
			int i = 0;
			while(i < N && sum>=4){
		
			sum -= 4;
			output[i++] = 6;
			}
			
			i = N-1;
			while(i>= 0 && sum){
			
			if(sum > 7 - output[i])
			sum -= 7 - output[i];
			output[i] = 7;
			i--;
			}
			output[i] += sum;
			sum = 0;
			
			String ans = "";
			for(int i = 0; i < N; i++){
			

			switch(output[i]){
		        case 2: ans+='1';
			break;
			case 3: ans+='7';
			break;
			case 4: ans+='4';
			break;
			case 5: ans+='2';
			break;
			case 6: ans+='0';
			break;
			case 7: ans+='8';
			break;
			
			return ans;
	  		
		 }
		//}