/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

public class clasif {
    public clasif(){
        //constructor
    }
    Integer n1=0,n2=0;
    //este es igualdad
 public void setIgual(int x,int y){
     this.n1=x;
     this.n2=y;
     
   if(n1 == n2){
       System.out.println("Los numeros son iguales");
   }else{
       System.out.println("Los numeros son diferentes");
   }
   
 }
 //validar mayores
 public void setmayor(int x, int y){
     this.n1=x;
     this.n2=y;
     
     
   if (n1>n2){
       System.out.println("El numero 1 es mayor");
   }else{
       System.out.println("El numero 1 es menor");
   }
 }
 public void setMenor(int x, int y){
     this.n1=x;
     this.n2=y;
     
   if(n1<n2){
       System.out.println("El numero 1 es menor");
   }else{
       System.out.println("El numero 1 es mayor");
   }
 }
 
public void setmaximini(int s[]){
    int aux;
 for (int i = 0;i<s.length;i++){ //ordenando de mayor a menor
     for (int j=i+1;j<s.length;j++){
         if(s[i]<s[j]){
             aux= s[i];
             s[i]=s[j];
             s[j]=aux;
         }
     }
 }
    System.out.println("El maximo es "+s[0]+"el minimo es "+s[s.length]); 
    /*
    s[0] es la primera posicion del arreglo el cual contendra el numero mayor
    s[s.length] es la ultima posicion el cual contiene el menor numero
    */
}

public void setRaCua(int m){
    this.n1=m;
    double calcular=0;
    calcular = Math.sqrt(n1);
        System.out.println("La raiz cuadrada de: "+n1+" es: "+calcular);
}

public void setfunCua(int x,int y){
    this.n1=x;
    this.n2=y;
    
}
public void setresta(int x,int y){
    this.n1=x;
    this.n2=y;
    int resta;
    
  resta = n1-n2;
       System.out.println("La resta es: "+resta);
}
public void setmulti(int x,int y){
    this.n1=x;
    this.n2=y;
    int multipli;
    
  multipli = n1*n2;
       System.out.println("La multiplicacion es: "+multipli);
}
public void setdivi(int x,int y){
    this.n1=x;
    this.n2=y;
    int div;
    
  div = n1/n2;
       System.out.println("La division es: "+div);
}
public void setAND(int x, int y){
    this.n1=x;
    this.n2=y;
}
public void setOR(int x, int y){
    this.n1=x;
    this.n2=y;
}
public void setNOT(int x, int y){
    this.n1=x;
    this.n2=y;
}
}
