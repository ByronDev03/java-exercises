import java.util.Scanner;
public class SignoZodiacal {
    public static void main(String[] args) 
    {
       Scanner teclado=new Scanner(System.in);
       int fn=0,mn=0;
       System.out.println("\tBIENVENIDO A SU SIGNO ZODIACAL");
       System.out.println("Ingrese su fecha de nacimiento: ");
       fn=teclado.nextInt();
       System.out.println("Ingrese su mes de nacimiento: ");
       mn=teclado.nextInt();
       if ((fn>=21 && fn<=31 && mn==3) || (fn<=19 && fn<=30 && mn==4))
       {
           System.out.println("\nTU SIGNO ZODIACAL ES ARIES");
           System.out.println("\nSomos dueños de nuestro destino.Somos capitanes de nuestra alma");
       }
       if ((fn>=20 && fn<=30 && mn==4) || (fn<=20 && fn<=31 && mn==5))
       {
           System.out.println("\nTU SIGNO ZODIACAL ES TAURO");
           System.out.println("\nPara triunfar simplemente hay que llegar,levantándose cada vez que se cae en el camino");
       }
       if ((fn>=21 && fn<=30 && mn==5) || (fn<=20 && fn<=30 && mn==6))
       {
           System.out.println("\nTU SIGNO ZODIACAL ES GEMINIS");
           System.out.println("\nSomos dueños de nuestro destino.Somos capitanes de nuestra alma");
       }
       if ((fn>=21 && fn<=30 && mn==6) || (fn<=22 && fn<=31 && mn==7))
       {
           System.out.println("\nTU SIGNO ZODIACAL ES CANCER");
           System.out.println("\nNuestra gloria más grande no consiste en no haberse caido nunca,sino en haberse levantado después de cada caída");
       }
       if ((fn>=23 && fn<=30 && mn==7) || (fn<=22 && fn<=31 && mn==8))
       {
           System.out.println("\nTU SIGNO ZODIACAL ES LEO");
           System.out.println("\nLas oportunidades no son producto de la casualidad,mas bien son resultado del trabajo");
       }
       if ((fn>=23 && fn<=31 && mn==8) || (fn<=22 && fn<=30 && mn==9))
       {
           System.out.println("\nTU SIGNO ZODIACAL ES VIRGO");
           System.out.println("\nNo existe la casualidad solo lo inevitable");
       }
       if ((fn>=23 && fn<=30 && mn==9) || (fn<=22 && fn<=31 && mn==10))
       {
           System.out.println("\nTU SIGNO ZODIACAL ES LIBRA");
           System.out.println("\nLos sueños no tienen fecha de caducidad");
       }
       if ((fn>=23 && fn<=31 && mn==10) || (fn<=21 && fn<=30 && mn==11))
       {
           System.out.println("\nTU SIGNO ZODIACAL ES ESCORPION");
           System.out.println("\nMientras tu dices que es imposible alguien ya lo esta haciendo");
       }
       if ((fn>=22 && fn<=31 && mn==11) || (fn<=21 && fn<=31 && mn==12))
       {
           System.out.println("\nTU SIGNO ZODIACAL ES SAGITARIO");
           System.out.println("\nSonríe hoy, puede que mañana tengas los dientes sucios");
       }
       if ((fn>=22 && fn<=31 && mn==12) || (fn<=19 && fn<=31 && mn==1))
       {
           System.out.println("\nTU SIGNO ZODIACAL ES CAPRICORNIO");
           System.out.println("\nNunca es demasiado tarde para luchar por aquello que es importante en tu vida");
       }
       if ((fn>=20 && fn<=31 && mn==1) || (fn<=18 && fn<=29 && mn==2))
       {
           System.out.println("\nTU SIGNO ZODIACAL ES ACUARIO");
           System.out.println("\nLas mentiras mas grandes son: Nunca y Siempre");
       }
       if ((fn>=19 && fn<=29 && mn==2) || (fn<=20 && fn<=31 && mn==3))
       {
           System.out.println("\nTU SIGNO ZODIACAL ES PISCIS");
           System.out.println("\nEl pasado es experiencia,que el presente aprovecha y el futuro perfecciona");
       }
       System.out.println("****GRACIAS POR SU CONSULTA****");
    }
}
