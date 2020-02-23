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
