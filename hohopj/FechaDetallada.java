/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.misclases;
import Libro.cap02.Fecha;

public class FechaDetallada extends Fecha 
{
public FechaDetallada(String f)
{
super(f);
}
public FechaDetallada()
{
// invocamos al constructor del padre
super("Fecha");
}
public FechaDetallada(int a,int b, int c){
    super();
    
}
    private static String meses[]={"Enero"
,"Febrero"
,"Marzo"
,"Abril"
,"Mayo"
,"Junio"
,"Julio"
,"Agosto"
,"Septiembre"
,"Octubre"
,"Noviembre"
,"Diciembre"};
public String toString()
{
return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
}

}
