
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        // PUNTO A
        //PRIMERA FORMA POSIBLE
      /*  
       int [] numeros= new int[15];
       for (int i=0; i<15; i++) {
           numeros [i] = i + 1;
       }
       System.out.println("uno al 15");
       for (int i=0; i<15; i++){
          System.out.println(numeros[i]);
         
        //PUNTO B
        //PRIMERA FORMA POSIBLE
          int [] numeros= new int[15];
       for (int i=0; i<15; i++) {
           numeros [i] = i + 1;
       }
       System.out.println("1 al 15");
       for (int i=0; i<15; i++){
          System.out.println(numeros[i] + 5);
       }
       //PUNTO A
       //SEGUNDA FORMA POSIBLE
        
           int [] numeros = new int []
           {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
           int i;
           for (i=0; i<15; i++)
           {
               System.out.println(numeros[i]);
           }
            
        //PUNTO B
        //SEGUNDA FORMA POSIBLE
        
        int[] numeros = new int []
        {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
           int i;
           
           for (i=0; i<15; i++)
           {
               System.out.println(numeros[i] + 5);
           }
         
           //PUNTO C
           
           int [] numeros= new int[10];
            for (int i=0; i<10; i++) {
           numeros [i] = i + 1;
            }
       System.out.println(numeros[6] / 3);
      
           //PUNTO D
           
        String[] productos = {"Pelota de fútbol", "Botines", "Guantes de arquero", "Short de futbol", "Camiseta de river", "Medias de futbol"};
        double[] precios = {3999.99, 8500.50, 899.99, 3400.95, 2800.75, 1200.00};

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto: " + productos[i] + " | Precio: $" + precios[i]);
        } */
         
         //PUNTO E
         
        String Curso[] = {"Html y css __", "Redes informaticas  __", "Armado y reparacion  __"};
        double Nota []= {  9.50,   9.00,   8.50};

            System.out.println( "    AÑO 2022 ");
            System.out.println( " Curso -- Nota ");
            System.out.println(" -----    ----");
            
        double np= (Nota[0]+ Nota[1]+ Nota[2])/3;
        for (int i = 0; i < Curso.length; i++) {
            
            System.out.println( Curso [i] + Nota[i]);}
            System.out.println("PROMEDIO: " +np);
                
                
    }
}
