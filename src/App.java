import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Informe um número: ");
        int n=sc.nextInt();
        sc.close();
        imprimieLinha(n);
    }

    public static void imprimieLinha(int n){
        int a, b;

        for(a=1;a<=n;a++){
            for(b=1;b<=a;b++){
                System.out.print(a+"   ");
            }
            System.out.println();
        } 
    }
}

