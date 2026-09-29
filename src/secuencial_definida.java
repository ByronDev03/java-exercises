import javax.swing.JOptionPane;
public class secuencial_definida {
    public static void main(String[] args)
    {
       int arreglo[] = {4,1,3,5,2};
       int dato;
       boolean band = false;
       
       dato = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NÚMERO A BUSCAR: "));
      
       //ALGORITMO PARA BUSQUEDA SECUENCIAL
       int i = 0;
       while(i < 5 && band == false)
       {
          if(arreglo[i] == dato)
              band = true;
          i++;
       }
      
       if(band == false)
           JOptionPane.showMessageDialog(null, "EL NÚMERO NO SE ENCUENTRA EN EL ARREGLO");
       else 
           JOptionPane.showMessageDialog(null, "EL NÚMERO HA SIDO ENCONTRADO EN LA POSICION: "+(i - 1));
    }
}
