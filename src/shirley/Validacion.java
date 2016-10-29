/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shirley;

import java.util.regex.Pattern;

public class Validacion {
    public Validacion(){}
   
     public boolean nombreProveedorValido(String nombre){
        
        Pattern p = Pattern.compile("[a-zA-Z_]{0,20}");
        if(!p.matcher(nombre).matches()){
            return false;
        }
        return true;
    }
    public boolean NITValido(String NITT){
        Pattern p = Pattern.compile("[0-9]{0,20}");
        if(!p.matcher(NITT).matches()){
            return false;
        }
        return true;
    } 
    public boolean ApellidosValido(String apellidos){
        Pattern p = Pattern.compile("[a-zA-z_]");
        if(!p.matcher(apellidos).matches()){
            return false;
        }
        return true;
    }
    public boolean CIValido(String CI){
        Pattern p = Pattern.compile("[0-9]{1,8}");
        if(!p.matcher(CI).matches()){
            return false;
        
        }
        return true;
    }
    public boolean MarcaValida(String marca){
     Pattern p = Pattern.compile("[a-zA-Z]{1,50}");
        if(!p.matcher(marca).matches()){
            return false;
        
        }
        return true;
    }

}

     
    

