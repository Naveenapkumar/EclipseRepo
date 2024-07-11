package stringpkg;

public class Firstquestion {
//o/p Center Training Testing
    public static void main(String[] args) {
        // The input string
        String s = "Testing Training Center";
        
        String[] arr = s.split(" ");
        
//        System.out.println(arr[2] + " " + arr[1] + " " + arr[0]);
        
        // Loop to print the words in reverse order
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
