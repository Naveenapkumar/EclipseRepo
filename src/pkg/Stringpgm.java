package pkg;

public class Stringpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hi";
		String s2="Naveena";
		String s3="hi";
		String s4="  Hello my dear intelligent student";
		//concat
		System.out.println(s1.concat(s2));
		System.out.println(1+2+s1+2+4);
		
		//equals
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//tolowercasetouppercase
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//length
		System.out.println(s2.length());
		
		//startswith and endswith
		System.out.println(s4.startsWith("Hello"));
		System.out.println(s4.endsWith("student"));
		
		//trim
		System.out.println(s4.trim());
		//replace
		System.out.println(s4.replace("Hello","Hi"));
		System.out.println(s4.trim());
		System.out.println(s4);
		
		//contains
		System.out.println(s4.contains("dear"));
		
		//split
		String[] ar=s4.split(" ");
		for(String v:ar)
		{
			System.out.println(v);
		}
		
		//substring-displays a part of string suing index position
		System.out.println(s2.substring(1,4));//o/p-ave
		 //charAt-to display chara at speicifed index position
		System.out.println(s1.charAt(1));
		//tocharArray
		char[] c=s1.toCharArray();
		for(char a:c)
		{
			System.out.println(a);
		}
	}

}
