/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03;

/**
 *
 * @author USUARIO PC
 */
public class Reporte1  {
    protected String codigo;
    public Reporte1 (String c){
        codigo = c;
    }

    public void setCodigo(String c){
     codigo = c;
    }
    public String getCodigo(){
        return codigo;
    }
    public String toString(){
     return String.format("Nombre: %s", getCodigo() );   
    }
}

