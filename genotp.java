import java.util.Scanner;

class otp {
  private int otp;
  
  protected int gen() {
    otp = (int)(Math.random() * 1000000);
    return otp; 
  }

  protected void display() {
    System.err.println("Generated OTP: " + gen());
  }

  public int getOtp() {
    return otp;
  }
}

public class genotp {
  public static void main(String[] args) {
    otp obj = new otp();
    obj.display();
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the OTP: ");
    int otp = sc.nextInt();


    if (obj.getOtp() == otp) {
      System.out.println("OTP is correct");
    }
    else {
      System.out.println("OTP is incorrect");
    }

    sc.close();

  }
}
