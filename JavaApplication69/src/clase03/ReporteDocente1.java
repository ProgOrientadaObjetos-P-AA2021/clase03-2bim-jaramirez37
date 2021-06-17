/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author USUARIO PC
 */
public class ReporteDocente1 extends Reporte {
    double promedioS ;
    ArrayList <Docente> lista;

    public ReporteDocente1(String c, ArrayList<Docente> l) {
        super(c);
        setListaDocen(l);
    }
    
    public void setPromedioSue(double p ){
       double suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma = suma + lista.get(i).getSueldo();
        }
        promedioS = suma/ lista.size();
    }
    public double getPromedioSue(){
        return promedioS;
    }
    public void setListaDocen ( ArrayList <Docente> l){
        lista = l;
    }
    public  ArrayList getListaDocen (){
        return lista;
    }
     public String toString(){
        String cadenaF = "";
        cadenaF = String.format("%s Reporte Docente:\n", super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadenaF = String.format("%s\nNombre:%s\nApellido:%s\nEdad:%s\n"
                    + "Sueldo: %.2f\n",getListaDocen().get(i).getNombre(),
                    getListaDocen().get(i).getApellido(),getListaDocen().get(i).
                            getMatricula());
        }
        cadenaF = String.format("%sPromedio de Sueldos: %.2f", cadenaF, 
                getPromedioSue());
        return cadenaF;
    }
}
