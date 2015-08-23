/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author heb
 */
public class FechaADate {

    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
    Date fecha = null;
    public Date safecha(String strFecha) throws ParseException{
        fecha = formatoDelTexto.parse(strFecha);
        return fecha;
    }

}
