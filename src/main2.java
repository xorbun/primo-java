import java.util.Scanner;

public class main2
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.printf("scrivi una parola");
        String parola1=input.nextLine();
        System.out.printf("scrivi una seconda parola");
        String parola2=input.nextLine();
        System.out.printf("scrivi una terza parola");
        String parola3=input.nextLine();
        input.close();
        String[] nuovoarray={parola1,parola2,parola3};
        for(int i=0;i< nuovoarray.length;i++)
        {
            System.out.printf(nuovoarray[i]);
            System.out.printf(" ");
        }
        for(int j=nuovoarray.length-1;j>=0 ;j--)
        {
            System.out.println(nuovoarray[j]);
            System.out.printf(" ");
        }

    }
}
