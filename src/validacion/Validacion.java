package validacion;

import javax.swing.JOptionPane;

public class Validacion {
    public static void main(String[] args) {
        int numero=0;
        int intento=3;
        
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 10"));
            if (numero>10 || numero<0) {
                intento=(intento-1);
            }
            if(numero>10 || numero<0){
                JOptionPane.showMessageDialog(null, "Numero Incorrecto \n Intentos restantes: "+intento);
                
            }else{
                JOptionPane.showMessageDialog(null,"Numero Correcto");
            }
        } while((numero>10||numero<0)&(intento>0));
        
        
    }
    
}
