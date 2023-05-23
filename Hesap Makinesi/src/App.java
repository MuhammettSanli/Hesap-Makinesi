import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        Scanner girdi=new Scanner(System.in);

        int sayi,sayi1,sayi2,sonuç;
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("Hesap Makinesine Hoş Geldiniz.");
        System.out.println("*****************************");
        System.out.println("*****************************");

        System.out.println("1-Toplama \n2-Çıkarma\n3-Bölme\n4-Çarpma");


        System.out.println("Yapmak istediğiniz işlemi giriniz.");
        sayi=girdi.nextInt();


        if(sayi==1)
        {
            System.out.println("İkis sayi giriniz.");
            sayi1=girdi.nextInt();
            sayi2=girdi.nextInt();
            sonuç=(sayi1+sayi2);
            System.out.println("Sonuç: "+sonuç);

        }
        else if(sayi==2)
        {
            System.out.println("İkis sayi giriniz.");
            sayi1=girdi.nextInt();
            sayi2=girdi.nextInt();
            sonuç=(sayi1-sayi2);
            System.out.println("Sonuç: "+sonuç);

        }
        else if(sayi==3)
        {
            System.out.println("İkis sayi giriniz.");
            sayi1=girdi.nextInt();
            sayi2=girdi.nextInt();
            sonuç=(sayi1/sayi2);
            System.out.println("Sonuç: "+sonuç);

        }
        else if(sayi==4)
        {
            System.out.println("İkis sayi giriniz.");
            sayi1=girdi.nextInt();
            sayi2=girdi.nextInt();
            sonuç=(sayi1*sayi2);
            System.out.println("Sonuç: "+sonuç);
        }
        else 
        {
            System.out.println("Yanlış sayı girdiniz.");
        }




      
    }


    }