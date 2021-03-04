import java.util.Scanner;

public class Aritmatika{
  
  public static void main(String []args) {
    int a, b, hasil;
    
    
    Scanner test = new Scanner(System.in);
    
    System.out.print("Masukkan nilai a: ")
    a = test.nextInt();
    
    System.out.print("Masukkan nilai b: ")
    b = test.nextInt();
    
    hasil = a + b;
    System.out.println("Hasil =" +hasil);
    
  }
}
