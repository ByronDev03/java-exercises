import javax.swing.JOptionPane;
public class secuencial_indefinida {
    public static void main(String[] args) 
    {
      int arreglo[], nElementos;
      int dato;
      boolean band = false;
      
      
      nElementos = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NÚMERO DE ELEMENTOS DEL ARREGLO: "));
      
      arreglo = new int[nElementos];
      
      JOptionPane.showMessageDialog(null, "INGRESE ELEMENTOS AL ARREGLO");
      for(int i = 0; i < nElementos; i++)
          arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "INGRESE UN NÚMERO: "));
      
      
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
