/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensandroguillen;

import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class ExamenSandroGuillen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner (System.in);
          System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine ();
        System.out.println("Ingrese su edad");
        double edad = sc.nextInt ();
        System.out.println("INGRESE EL PESO");
        double peso = sc.nextDouble();
        System.out.println("ingrese la altura");
        double altura = sc.nextDouble();
        
        
        Persona persona1 = new Persona(nombre,edad,peso,altura);
        System.out.println("      Dato de la persona       ");
        System.out.println("Nombre es "+persona1.getNombre());
        System.out.println("edad es "+persona1.getEdad());
         
        System.out.println("peso  es "+persona1.getPeso());
        System.out.println("Altura es "+persona1.getAltura());
        System.out.println("Resultado de masa corporal de la persona es "+ persona1.calculeimc());
        System.out.println("Mensaje"+persona1.MostrarEstado());
        
   //     Persona INC= new Persona("Juan",35,90,1.80);
       
        
      /*  System.out.println("        Masa Corporal de la persona 1     ");  
        System.out.println("Nombre = "+INC.getNombre());
        System.out.println("Edad = "+INC.getEdad());
        System.out.println("Peso = "+INC.getPeso());
        System.out.println("Altura = "+INC.getAltura());
        System.out.println("Altura = "+INC.MasaCorporal());
        
       /* Persona2 INC2= new Persona2();
        
        
        System.out.println("        Masa Corporal de la persona 2     ");  
        System.out.println("Nombre = "+INC2.getNombre());
        System.out.println("Edad = "+INC2.getEdad());
        System.out.println("Peso = "+INC2.getPeso());
        System.out.println("Altura = "+INC2.getAltura());
        System.out.println("Altura = "+INC2.MasaCorporal());
      
    }*/
    
}
}