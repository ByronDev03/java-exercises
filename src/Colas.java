import java.util.LinkedList;
import java.util.Queue;
public class Colas {
    public static void main(String[] args) 
    {
      Queue<Integer> cola = new LinkedList();
        for (int i = 0; i < 10; i++) 
        {
          cola.offer(i);  
        }
        //cola.remove();//Sirve para quitar el ultimo elemento.
        System.out.println(cola);
        //System.out.println(cola.peek());//Sirve para consultar el primer elemento.
    }
}
