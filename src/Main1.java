
public class Main1
{
    public static void main(String[] args)
    {
        moltiplicazione();
        concatenazione();
        String[] array1={"ciao ", "a ", "tutti ", "e ", "benvenuti "};
        String nuovaparola1="boh ";
        String[] messaggio =inserisciinarray(array1,nuovaparola1);
        for(int i=0;i<prova.length;i++)
        {
            System.out.printf(messaggio[i]);
        }


    }
    public static void moltiplicazione()
    {
        int num1=3;
        int num2=5;
        int prodotto=num1*num2;
        System.out.printf("il prodotto è "+ prodotto);
    }
    public static void concatenazione()
    {
        String parola1="ciao ";
        String parola2="a tutti ";
        System.out.printf(parola1 + parola2);
    }
    public static String[] inserisciinarray(String[] primoarray, String nuovaparola)
    {

        String[] secondoarray=new String[6];
        secondoarray[0] = primoarray[0];
        secondoarray[1] = primoarray[1];
        secondoarray[2] = nuovaparola;
        secondoarray[3] = primoarray[2];
        secondoarray[4] = primoarray[3];
        secondoarray[5] = primoarray[4];

        return secondoarray;
    }
}