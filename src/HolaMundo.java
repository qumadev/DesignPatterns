/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class HolaMundo {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        saludar();


        System.out.println(validarUsuario(18,"76334467","adrian@gmail.com"));
    }
    
    static void saludar(){
        System.out.println("Hola mundo");
    }
    
    static String validarUsuario(int edad,String dni, String email) throws Exception{
        
        if(dni == null){
            throw new Exception("El usuario no tiene un DNI registrado");
        }
        if(edad < 18){
            throw new Exception("El usuario no es mayor de edad");
        }
        if(email == null){
            throw new Exception("El usuario no cuenta con un email");
        }

            
        return "Todo salio correctamente";

    }
    

    
}
