import java.lang.Math;
import java.util.*;
public class Strr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]={"byte","short","int","long"};
		for(int i=0;i<s.length;i++){
		System.out.println(s[i]);
		}
		int a=107;
		if(a>=-Math.pow(2, 7) && a<Math.pow(2, 7)){
			System.out.println("can fit in byte");
		}
		else{
			System.out.println("cant fit in byte");
		}
			
		System.out.println("Please enter the input:");
		Scanner sc = new Scanner(System.in);
		try{
		byte b=sc.nextByte();
		
		System.out.println(b);}
		catch (Exception e){
			System.out.println("cant fit in");
		}
		sc.close();
		

	}

}
