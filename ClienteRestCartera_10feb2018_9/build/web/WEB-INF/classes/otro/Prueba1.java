/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otro;

import pojo.Cartera;
import wscliente.NewJerseyClient;

/**
 *
 * @author ONivia
 */
public class Prueba1 {
    NewJerseyClient equipo;

    public Prueba1() {
        equipo = new NewJerseyClient();
        Cartera cartera = equipo.find_JSON(Cartera.class, "");
        //cartera.getDeuda()
        equipo.edit_JSON(cartera, "");
    }
}
