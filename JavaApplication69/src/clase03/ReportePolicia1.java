/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author USUARIO PC
 */
public class ReportePolicia1 extends Reporte{
    double promedioE;
    ArrayList <Policia> lista;

    public ReportePolicia1(String c, ArrayList<Policia> l) {
        super(c);
        setListaPol (l);
    }

public void setPromedioEd(double p ){
        double suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma = suma + lista.get(i).getEdad();
        }
        promedioE = suma/ lista.size();
    }
    public double getPromedioEd(){
        return promedioE;
    }
    public void setListaPol ( ArrayList <Policia> l){
        lista = l;
    }
    public  ArrayList getListaPol (){
        return lista;
    }
    public String toString(){
        String cadenaF = "";
        cadenaF = String.format("%s Reporte Estudiantes:\n", super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadenaF = String.format("%s\nNombre:%s\nApellido:%s\nEdad:%s\n",
                    getListaPol().get(i).getNombre(),
                    getListaPol().get(i).getApellido(),getListaPol().get(i).
                            getMatricula());
        }
         cadenaF = String.format("%sPromedio de Sueldos: %.2f", cadenaF, 
                getPromedioEd());
        return cadenaF;
    }
}