public class Numero {

    public static Boolean isCapicua(int n){
        boolean res = true;
        String[] cifras = Integer.toString(n).split("");
        int lon = (int)Math.floor(cifras.length/2);
        for(int i=0;i<lon;i++){
            if (cifras[i].equals(cifras[cifras.length-i-1])){
                res = true;
            }
            else{
                res = false;
                break;
            }
        }

        return res;
    }

    public static boolean isCapicua2(int n){
        String cifras = String.valueOf(n);
        if(cifras.equals(Cadena.invertir(cifras))) return true;
        else return false;
    }
}
