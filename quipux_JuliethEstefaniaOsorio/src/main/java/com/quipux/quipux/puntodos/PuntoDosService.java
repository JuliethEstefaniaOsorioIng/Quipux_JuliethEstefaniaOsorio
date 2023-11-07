package com.quipux.quipux.puntodos;


import com.ibm.icu.text.RuleBasedNumberFormat;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class PuntoDosService {

    public String puntoDos(Integer horas, Integer minutos) {

        if (horas < 1 || horas >= 12 || minutos < 0 || minutos >= 60) {
            return "Solo se admiten enteros positivos entre 1 y 11 para las horas," +
                    " 0 y 59 para los minutos";
        }

        RuleBasedNumberFormat rule = new RuleBasedNumberFormat(new Locale("es-ES"),
                RuleBasedNumberFormat.SPELLOUT);

        return minutos == 0 ? rule.format(horas)+" en punto" : rule.format(horas)+" y "
                +rule.format(minutos)+" minutos";

    }
}
