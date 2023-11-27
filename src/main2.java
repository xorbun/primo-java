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
        System.out.printf("le tre stringhe in ordine di inserimento"+ " " + parola1 + " "+ parola2 +" "+ parola3);
        System.out.printf("le tre stringhe in ordine inverso"+ " " + parola3+ " " + parola2+ " " +parola1);
        String[] nuovoarray={parola1,parola2,parola3};
        

    }
}
