package Exaprac2;

import javax.swing.JOptionPane;

public class ejercicio {
    
    public static void main(String[] args){
        
        int cant=0;
        double total=0;
        double totalP=0;
        double mayor=-1000000;
        int EmM=0;
        
        cant=Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos desea registrar"));
        
        String Empleado[] = new String[cant];
        int HorasT [] = new int[cant];
        double Salario[] = new double[cant];
        double SxH[] = new double [cant];
        
        for(int x=0; x<cant; x++){
            
            Empleado[x]=JOptionPane.showInputDialog("Nombre del empleado " + (x+1) + ":");
            HorasT[x]=Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadad:"));
            Salario[x]=Double.parseDouble(JOptionPane.showInputDialog("Salario del empleado: "));
            total = Salario[x]*HorasT[x];
            SxH[x]=total;
            totalP+=total;
            
            if(SxH[x]>mayor){
                
               EmM=x;
               mayor=SxH[x];
                
            }
            
        }
        for(int i=0; i<cant; i++){            
            JOptionPane.showMessageDialog(null, "Nombre: " + Empleado[i] + "\n" + "Horas trabajadas: " + HorasT[i] + "\n" + "Salario por hora: " + SxH[i]);
        }
        
        JOptionPane.showMessageDialog(null, "El total de la plantilla fue: " + totalP);

        JOptionPane.showMessageDialog(null, "El empleado que mas gano en la plantilla fue: " + Empleado[EmM]); 
        
    }
    
}
