import java.lang.*;
public class Permute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	StringBuilder s=new StringBuilder("mary");
	permute(s);

	}
	static void permute(StringBuilder ss){
		StringBuilder s=new StringBuilder("");
		permuteHelper(ss,s);
		
	}
	static void permuteHelper(StringBuilder s, StringBuilder choosen){
		System.out.println(s+"----------------"+choosen);
		if(s.length()==0){
			System.out.println(choosen);
		}
		else{
			for(int i=0;i<s.length();i++){
				char c=s.charAt(i);
				choosen.append(c);
				s.deleteCharAt(i);
				permuteHelper(s,choosen);
				s.insert(i, c);
				choosen.deleteCharAt(choosen.length()-1);
			}
		}
	}

}
