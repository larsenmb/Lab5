import java.util.Scanner;

public class lab5a {
    public static void main(String args[]) {
        String hexInput = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        hexInput = scan.nextLine();
        long x = 0;
        hexInput = hexInput.toLowerCase();

        if (hexInput.charAt(0) == '0' && hexInput.charAt(1) == 'x'){
            hexInput = hexInput.substring(2);

        }
        for (int i = 0;i < hexInput.length(); i++){
            if (hexInput.charAt(i) == '0')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 0;
            else if (hexInput.charAt(i) == '1')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 1;
            else if (hexInput.charAt(i) == '2')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 2;
            else if (hexInput.charAt(i) == '3')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 3;
            else if (hexInput.charAt(i) == '4')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 4;
            else if (hexInput.charAt(i) == '5')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 5;
            else if (hexInput.charAt(i) == '6')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 6;
            else if (hexInput.charAt(i) == '7')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 7;
            else if (hexInput.charAt(i) == '8')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 8;
            else if (hexInput.charAt(i) == '9')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 9;
            else if (hexInput.charAt(i) == 'a')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 10;
            else if (hexInput.charAt(i) == 'b')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 11;
            else if (hexInput.charAt(i) == 'c')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 12;
            else if (hexInput.charAt(i) == 'd')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 13;
            else if (hexInput.charAt(i) == 'e')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 14;
            else if (hexInput.charAt(i) == 'f')
                x += (long) Math.pow((double) 16, (double) (hexInput.length() - 1) - i) * 15;
        }
        System.out.println("Your number is " + x +" in decimal");
    }
}
