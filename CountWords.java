import  java.util.Scanner;
public class CountWords{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text:");
        String str = input.nextLine();

        System.out.println("words count:" + wordCount(str));
    }

    private static int wordCount(String s) {
        if(s.isEmpty() || s == null)
            return 0;
        return s.trim().split("[\\s]+").length;
    }
}
