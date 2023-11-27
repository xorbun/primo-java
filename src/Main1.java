// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main1
{
    public static void main(String[] args)
    {
        int num1=3;
        int num2=5;
        int prodotto=num1*num2;
        System.out.printf("il prodotto è "+ prodotto);

        String parola1="ciao ";
        String parola2="a tutti ";
        System.out.printf(parola1 + parola2);

        String parole []= {"ciao ","a ", "tutti ", "e ", "benvenuti"};
        for(int i=0;i<parole.length;i++)
        {
            System.out.printf(parole[i]);
        }

    }
}