package Bisiesto;
import java.io.*;
import java.util.*;
public class Bisiesto {

        public String imprimir(int numero) {
                String resultado = "";
                resultado = resultado + numero;
                return resultado;
        }

        public boolean esBisiesto(int anio){
        if(anio%4 == 0){
            if(anio%100 == 0){
                if(anio%400 == 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

}