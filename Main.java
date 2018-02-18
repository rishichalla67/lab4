import java.util.Scanner;

public class Main
{
    public static long hexConv(String num)
    {
        String characters = "0123456789ABCDEF";
        char identify = 'X';
        num = num.toUpperCase();
        long ans = 0;
        if (num.charAt(1) == identify)
        {
            for (int i = 2; i < num.length(); i++)
            {
                char c = num.charAt(i);
                int d = characters.indexOf(c);
                ans = 16 * ans + d;
            }
        }
        else
        {
            for (int i = 0; i < num.length(); i++)
            {
                char c = num.charAt(i);
                int d = characters.indexOf(c);
                ans = 16 * ans + d; // instead of squaring, multiplies the product each time the for loop runs then adds d
            }
        }
        return ans;


    }
    public static void main(String[] args)
    {
        String hexNum;
        long decNum;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        hexNum = scan.nextLine();

        decNum = hexConv(hexNum);

        System.out.println("Your number is " + decNum + " in decimal");
    }
}

