package arraypkg;

public class Practicequestions {

    public static void main(String[] args) {
        // The input string
        String s = "Testing Training Center";
        
        // Splitting the string into an array of words
        String[] arr = s.split(" ");
        
        // Print the words in the desired order
//        System.out.println(arr[2] + " " + arr[1] + " " + arr[0]);
        
        // Loop to print the words in reverse order
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
