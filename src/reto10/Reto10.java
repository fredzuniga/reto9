
package reto10;


public class Reto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(cambiar_car("Freddy"));
        
        // P r u e b a
        // a
        // Luna
        // aLun
        // Emilio
        // oEmili
    }
    
    public static String cambiar_car(String cadena){
        String palabra = cadena;
        // dividir la cadena en un array
        String[] letras = palabra.split("");
        // creo mi vector final
        String[] palabra_final = new String[letras.length];
        // Prueb a
        // letras[5]
        palabra_final[0] = letras[letras.length-1];
        // palabra_final[0] = letras[5];
        // palabra_final[0] = a;
        // [a][P][r][u][e][b]
        for(int r = 0 ; r < letras.length - 1; r++){
            palabra_final[r+1] = letras[r];
        }
        
        /*palabra = "";
        for(int r = 0 ; r < palabra_final.length; r++){
            palabra += palabra_final[r];
            // palabra + = a
            // palabra = "a"
            // palabra + = P
            // palabra = "aP"
        }*/
        
        return String.join("", palabra_final);
    }
}
