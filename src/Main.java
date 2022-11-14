import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int mat, fizik , turkçe , kimya ,muzik;
       double avarage;

       Scanner input = new Scanner(System.in);

        System.out.print("Matematik değerini girin : ");
        mat=input.nextInt();
        while (mat<0 || mat>100){
            System.out.println("Yanlış veri girdiniz tekrar deneyin...");
            mat=input.nextInt();

        }
        System.out.print("Fizik değerini girin : ");
        fizik=input.nextInt();
        while (fizik<0 || fizik>100){
            System.out.println("Yanlış veri girdiniz tekrar deneyin...");
            fizik=input.nextInt();
        }
        System.out.print("Türkçe değerini girin : ");
        turkçe=input.nextInt();
        while (turkçe<0 || turkçe>100){
            System.out.println("Yanlış veri girdiniz tekrar deneyin...");
            turkçe=input.nextInt();
        }
        System.out.print("Kimya değerini girin : ");
        kimya=input.nextInt();
        while (kimya<0 || kimya>100){
            System.out.println("Yanlış veri girdiniz tekrar deneyin...");
            kimya=input.nextInt();
        }
        System.out.print("Müzik değerini girin : ");
        muzik=input.nextInt();
        while (muzik<0 || muzik>100){
            System.out.println("Yanlış veri girdiniz tekrar deneyin...");
            muzik=input.nextInt();
        }

        avarage=(mat+fizik+turkçe+kimya+muzik)/5;

        System.out.println("Ortalamız : "+avarage);
        if(avarage>=55){
            System.out.println("Tebrikler. Geçtiniz...");
        }else{
            System.out.println("Maalesef kaldınız...");
        }

    }
}