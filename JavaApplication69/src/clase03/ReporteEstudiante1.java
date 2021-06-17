/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03;

import herencias2.Estudiante;
import java.util.ArrayList;
/**
 *
 * @author USUARIO PC
 */

public class ReporteEstudiante1 extends Reporte {
    double promedioM;
    ArrayList <Estudiante> lista;
    public ReporteEstudiante1 (String c, ArrayList<Estudiante> l){
        super (c);
        setListaEst(l);
    }
    
    public void setPromedioMat(double p ){
       double suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma = suma + lista.get(i).getMatricula();
        }
        promedioM = suma / lista.size();
    }
    public double getPromedioMat(){
        return promedioM;
    }
    public void setListaEst ( ArrayList <Estudiante> l){
        lista = l;
    }
    public  ArrayList getListaEst (){
        return lista;
    }
    public String toString(){
        String cadenaF = "";
        cadenaF = String.format("%s Reporte Estudiantes:\n", super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadenaF = String.format("%s\nNombre:%s\nApellido:%s\nEdad:%s\n"
                    + "Matricula: %.2f\n",cadenaF, getListaEst().get(i).getNombre(),
                    getListaEst().get(i).getApellido(),getListaEst().get(i).
                            getMatricula());
        }
         cadenaF = String.format("%sPromedio de Sueldos: %.2f", cadenaF, 
                getPromedioMat());
        return cadenaF;
    }
}
