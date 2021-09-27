import java.util.Scanner;

public class DupString {
    public static void main(String[] args) throws Exception {

        String res = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        StringBuilder a = new StringBuilder(sc.nextLine());

        while (a.length() > 0) {
            int c = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(0) == a.charAt(j))
                    c = c + 1;
            }
            res = res + a.charAt(0) + "=" + c + "\n";
            String[] k = a.toString().split(a.charAt(0) + "");
            a = new StringBuilder(new String(""));
            for (String s : k) {
                a.append(s);
            }
            System.out.println(res);
        }
    }
}
