import java.util.Scanner;
public class Angulos {
    public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);
        int angulo=0;
        System.out.println("Introduce un angulo: ");
        angulo=teclado.nextInt();
        if(angulo>=0 && angulo<=90)
        {
            System.out.println("ES UN ANGULO AGUDO");
        }
        if(angulo==90)
        {
            System.out.println("ES UN ANGULO RECTO");
        }
        if(angulo>=90 && angulo>=180)
        {
            System.out.println("ES UN ANGULO OBTUSO");
        }
        if(angulo==180)
        {
            System.out.println("ES UN ANGULO LLANO");
        }
        if(angulo>=180 && angulo<=360)
        {
            System.out.println("ES UN ANGULO CONCAVO");
        }
        if(angulo==360)
        {
            System.out.println("ES UN ANGULO PERIGONAL");
        }
        if(angulo>361)
        {
            System.out.println("NO EXISTE ANGULO CON ESA MEDIDA");
        }
    }
}
