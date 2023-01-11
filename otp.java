import java.util.Scanner;
public class otp
{
    public static String generateOTP() 
    {
        int pin = (int) (Math.random()*9000)+1;
        String otpp = String.valueOf(pin);
        return otpp;
    }
    public static void main(String[] args) 
    {
        String otpString = generateOTP();
        System.out.println(otpString);    
    }
}
