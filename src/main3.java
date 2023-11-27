import java.util.Scanner;

public class main3
{
    public static void main(String[] args)
    {
        int base=4;
        int altezza=5;
        int perimetro=((base*2)+(altezza*2));
        System.out.printf("il perimetro del rettangolo è "+ perimetro);
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
        int lato1=121;
        int lato2=5;
        int lato3=7;
        double perimetro2=Math.sqrt(lato1);
        System.out.printf("il perimetro del triangolo è" + perimetro2);
    }
}
