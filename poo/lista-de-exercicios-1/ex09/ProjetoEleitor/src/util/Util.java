// ---------------------------------------------------------------------------------------------------------
// Copyright 2020 Viniciusalopes Tecnologia <suporte@viniciusalopes.com.br>
// Licença      : MIT <https://opensource.org/licenses/MIT> 
// Data         : 22/02/2020
// Projeto      : POO - Lista de Exercícios 1 
// Repositório  : <https://github.com/Viniciusalopes/ads20192-modulo2/tree/master/poo/lista-de-exercicios-1>
// ---------------------------------------------------------------------------------------------------------

package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    // ÚTIL
    public static int getAnoAtual() {
        // FONTE: https://www.devmedia.com.br/como-pegar-a-data-do-sistema/1609
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        return Integer.parseInt(dateFormat.format(new Date()));
    }
}
