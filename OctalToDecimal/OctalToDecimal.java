import java.util.Scanner;
public class OctalToDecimal
{
    public static int getDecimal(int octal)
    {
        int decimal = 0;
        int n = 0;
        while(true)
        {
            if(octal == 0)
            {
                break;
            }
            else
            {
                int temp = octal % 10;
                decimal += (int)(temp * Math.pow(8, n));
                octal /= 10;
                n++;
            }
        }
        return decimal;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number in octal: ");
        int octal = scanner.nextInt();
        System.out.println();
        System.out.println(octal + " in octal is " + getDecimal(octal) + " in decimal.");
    }
}
