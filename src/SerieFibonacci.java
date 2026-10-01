import java.util.Scanner;
public class SerieFibonacci 
{
     public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);
        int numero=0,fibo1=1,fibo2=1,i=0;
        do
        {
            System.out.println("Introduce un numero mayor que 1: ");
            numero=teclado.nextInt();
        }while(numero<=1);
        System.out.println("Los "+numero+"primeros terminos de la serie Fibonacci son: ");
        System.out.println(fibo1 + " ");
        for(i=2;i<=numero;i++)
        {
            System.out.println(fibo2 + " ");
            fibo2=fibo1+fibo2;
            fibo1=fibo2-fibo1;
        }
        System.out.println();
    }
}
