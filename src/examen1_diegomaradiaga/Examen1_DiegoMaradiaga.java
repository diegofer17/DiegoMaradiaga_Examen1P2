package examen1_diegomaradiaga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Examen1_DiegoMaradiaga {
    static ArrayList <Object> conjunto = new ArrayList();
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) throws ExcepcionNumeral {
      int opcion=0;
      int contConjunto=0;
      
      ArrayList <Conjunto> numeroscomplejos = new ArrayList();
      do{
          System.out.print(">>>>>        MENU        <<<<<\n"
                  + "1-	Probar el método Recursivo\n" +
                    "2-	Agregar al arrayList un nuevo conjunto de complejos y n elementos a dicho conjunto\n" +
                    "3-	Simplificar el racional de un imaginario de algún complejo de uno de los conjuntos \n" +
                    "4-	Unir dos conjuntos del arraylist y guardar dicho conjunto en el mismo arrayList\n" +
                    "5-	Sumar dos números complejos de cualquier conjunto del arraylist\n" +
                    "6-	Imprimir todos los conjuntos del arrayList\n" +
                    "7-	Salir\n"
                  + "Ingrese una opcion: ");
          
          opcion = leer.nextInt();
          
          switch (opcion) {
              case 1:
                  int matriz [][]  = {{7,1,2,1,9,},
                          {8,5,5,9,5,},
                          {3,5,8,8,4,},
                          {4,5,4,6,2,}};
                  int [] salida = Minimo(matriz, 0, 0);
                  for (int i = 0; i < salida.length; i++) {
                      System.out.println(salida[i]+"");
                  }
              break;
              case 2:
                  System.out.println(">>Creacion del conjunto<<");
                  System.out.println("Un numero complejo es la combinacion de un real acompanado de un imaginario");
                  System.out.print("Cuantos numeros complejos agregara? ");
                  int X = leer.nextInt();

                  for (int i = 0; i < X; i++) {
                      System.out.print("\n"
                              + "1. Racional\n"
                              + "2. Exponencial\n"
                              + "Que tipo de real agregara? ");
                      int tipoReal = leer.nextInt();
                      switch (tipoReal) {
                          case 1: {
                              Real RealRacional = newRacional();
                              
                              System.out.println("Ahora ingrese un real que forme el imaginario");
                                System.out.print("Numero: ");
                              int Real = leer.nextInt();
                      
                              Imaginario im = new Imaginario(Real);
                              
                              NumComplejos complejo = new NumComplejos(RealRacional, im);
                              
                              ((Conjunto)numeroscomplejos.get(contConjunto)).getconjunto().add(complejo);
                          }
                          break;
                          case 2: {
                              Real RealExponecial = newExponencial();
                              
                              System.out.println("Ahora ingrese un real que forme el imaginario");
                                System.out.print("Numero: ");
                              int Real = leer.nextInt();
                      
                              Imaginario im = new Imaginario(Real);
                              
                              NumComplejos complejo = new NumComplejos(RealExponecial, im);
                              
                              ((Conjunto)numeroscomplejos.get(contConjunto)).getconjunto().add(complejo);
                          }
                          break;
                          default:
                              System.out.println("Opcion no valida");
                              break;
                      }//Fin switch
                      conjunto.add(numeroscomplejos);
                      System.out.println("Conjunto agregado exitosamente");
                      contConjunto++;
                  }//Fin for

              break;
              case 3:
                  System.out.println(">>Simplificar racional<<");
              break;
              case 4:{
                  System.out.println(">>Unir conjuntos<<");
                  String lista = "";
                  for (Object t : conjunto) {
                      if(t instanceof Conjunto){
                          lista+=""+conjunto.indexOf(t)+") "+t;
                      }
                  }
                  System.out.println(lista);
                  System.out.println("");
                  System.out.print("Ingrese el primer conjunto: ");
                  int index1 = leer.nextInt();
                  System.out.print("Ingrese el segundo conjunto: ");
                  int index2 = leer.nextInt();
                  
                  System.out.println("Union: ");
                  
              }break;
              case 5:
                  System.out.println(">>Sumar dos complejos<<");
              break;
              case 6:
                  System.out.println(">>Lista de conjuntos<<");
                  String lista = "";
                  for (Object t : conjunto) {
                      if(t instanceof Conjunto){
                          lista+=""+conjunto.indexOf(t)+") "+t;
                      }
                  }
                  System.out.println(lista);
              break;
              default:
                  System.out.println("Opcion no valida");
                  break;
          }//Fin switch
      }while(opcion!=7);  
    }//Fin main
    
    static Racional newRacional() throws ExcepcionNumeral{
        Racional retorno = new Racional();
        System.out.println("RACIONAL");
        boolean flag = true;
        while(flag){
        try {
            System.out.print("Ingrese el numerador: ");
            int numer = leer.nextInt();
            System.out.print("Ingrese el denominador: ");
            int denom = leer.nextInt();
            retorno = new Racional(numer, denom);
            
            flag = false;
        } catch (ExcepcionNumeral e) {
            System.out.println(e.getMessage());
        }
        }//Fin while
        return retorno;
        
    }
    
    static Exponencial newExponencial() throws ExcepcionNumeral{
        Exponencial retorno = new Exponencial();
        System.out.println("EXPONENCIAL");
        boolean validacion = true;
        while(validacion){
        try {
            System.out.print("Ingrese la base: ");
            int base = leer.nextInt();
            System.out.print("Ingrese el exponente: ");
            int exp = leer.nextInt();
            retorno = new Exponencial(base, exp);
            
            validacion = false;
        } catch (ExcepcionNumeral e) {
            System.out.println(e.getMessage());
        }
        }//Fin while
        return retorno;
    }
    
    static ArrayList <Object> Union (int indice1, int indice2){
        conjunto.get(indice1);
        conjunto.get(indice2);
        
        
        return conjunto;
    }
    
    public static int [] Minimo (int [][] matriz, int filas, int columnas){
        ArrayList <Integer> col;
        
        if (columnas == matriz[0].length-1){
            col= new ArrayList();
            for (int i = 0; i < matriz[0].length; i++) {
                col.add(matriz[i][columnas]);
            }
            matriz[0][columnas]= Collections.min(col);
            return matriz[0];
        }else{
            col= new ArrayList();
            for (int i = 0; i < matriz[0].length; i++) {
                col.add(matriz[i][columnas]);
            }
            matriz[0][columnas]= Collections.min(col);
            return Minimo(matriz, filas, columnas+1);
        }
    }
    
    public static int minimosMatriz(int matriz[][], int filas, int columnas) {
        int minimo;
        int [] arreglo = new int [filas];
        
        if (filas == matriz.length - 1 && columnas == matriz[0].length - 1) {
            return matriz[filas][columnas];
                        
        } else {
            if (filas == matriz.length-1) {
                int pos = matriz[filas][columnas];
                
                return matriz[filas][columnas] +minimosMatriz(matriz, 0, columnas+1);
            } else {
                int pos = matriz[filas][columnas];
                
                return matriz[filas][columnas] + minimosMatriz(matriz, filas+1, columnas);
                
            }
        } 
        
    }//Fin metodo de minimo
   
    public static int Min(int[] arreglo, int posicion) {
        int minimo;
        if (posicion == arreglo.length - 1) {
            return arreglo[posicion];
        } else {
            minimo = Min(arreglo, posicion + 1);
            if (arreglo[posicion] < minimo) {
                return arreglo[posicion];
            } else {
                return minimo;
            }
        }
    }//FIn metodo

}//Fin clase





















