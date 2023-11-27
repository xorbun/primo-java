import java.util.Scanner;

public class main3
{
    public static void main(String[] args)
    {
        perimetro();
        pariodispari();
        area();
    }
    public static void perimetro()
    {
        int base=4;
        int altezza=5;
        int perimetro=((base*2)+(altezza*2));
        System.out.printf("il perimetro del rettangolo è "+ perimetro);
    }
    public static void pariodispari()
    {
        Scanner input= new Scanner(System.in);
        System.out.printf("scrivi un numero");
        int numero= input.nextInt();
        input.close();
        if(numero%2==0)
        {
            System.out.printf("numero pari");
        }
        else
        {
            System.out.printf("numero dispari");
        }
    }
    public static void area()
    {
        int lato1=3;
        int lato2=5;
        int lato3=7;
        int perimetro2=lato1+lato2+lato3;
        double area=Math.sqrt((perimetro2*(perimetro2-lato1)*(perimetro2-lato2)*(perimetro2*lato3)));
        System.out.printf("l'area del triangolo è" + area);
    }
}
