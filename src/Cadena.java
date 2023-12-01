import java.lang.reflect.Array;

public class Cadena {

    public static String invertir(String pal){
        char[] letras = pal.toCharArray();
        String res="";
        for(int i=letras.length;i>0;i--){
            res += letras[i-1];
        }
        return res;
    }
}
