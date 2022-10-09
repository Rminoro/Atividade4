import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Pedir 4 notas bimestrais
    float a, b, c, d, e, f;
    Scanner S =new Scanner(System.in);

    System.out.println("Digite a primeira nota");
    a = S.nextFloat();
    System.out.println("Digite a segunda nota");
    b = S.nextFloat();
    System.out.println("Digite a terceira nota");
    c = S.nextFloat();
    System.out.println("Digite a quarta nota");
    d = S.nextFloat();
    
    e = (a+ b + c + d);
    f =(e/4);

    //Calcule a média 
    System.out.println("A média é " + f);
    }
}
