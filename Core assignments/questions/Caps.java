package questions;

class change{
	public static String changecaps(String small) {
		String words[]=small.split(" ");
		StringBuilder str=new StringBuilder();
		for(String word:words) {
			str.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
		}
			return str.toString();
		}
	
	
}
public class Caps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sent="hello world hi";
		System.out.println(change.changecaps(sent));
		

	}

}
