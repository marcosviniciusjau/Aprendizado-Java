import java.until.Arrays;

public class ArraySimples{
    public static void main(String[] args){
        String[] paises = {"BRASIL" , "CHINA", "EUA"};

        System.out.println(paises[0]);
        System.out.println(Arrays.toString (paises));

        int posicao = Arrays.binarySearch (paises, "Brasil");
        System.out.println(posicao);

        Arrays.sort (paises, 0, paises.lenght);
        System.out.println(Arrays.toString(paises));
    }
}