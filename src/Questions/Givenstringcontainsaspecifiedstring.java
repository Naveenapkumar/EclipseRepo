package Questions;

public class Givenstringcontainsaspecifiedstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java language is platform independent";
		String substring = "language";
        boolean containsSubstring = s.contains(substring);
        
        if (containsSubstring) {
            System.out.println("The string contains the substring "+ substring );
        } else {
            System.out.println("The string does not contain the substring "+ substring );
        }
    }

	}


