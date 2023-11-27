import java.util.Scanner;

public class main3
{
    public static void main(String[] args)
    {
        perimetro();
        Scanner input= new Scanner(System.in);
        System.out.printf("scrivi un numero");
        int numero= input.nextInt();
        input.close();
        int a= pariodispari(numero);
        System.out.println(a);
        int lato1=3;
        int lato2=5;
        int lato3=7;
        double risultato= area(lato1,lato2,lato3);
        System.out.println("l'area del triangolo è "+ risultato);

    }
    public static void perimetro()
    {
        int base=4;
        int altezza=5;
        int perimetro=((base*2)+(altezza*2));
        System.out.printf("il perimetro del rettangolo è "+ perimetro);
    }
    public static int pariodispari(int numero1)
    {
        if(numero1%2==0)
        {
            return 0;
        }
        else
        {
         return 1;
        }
    }
    public static double area(int a, int b, int c)
    {

        int perimetro2=a+b+c;
        double area=Math.sqrt((perimetro2*(perimetro2-a)*(perimetro2-b)*(perimetro2*c)));
        return area;

    }
}
