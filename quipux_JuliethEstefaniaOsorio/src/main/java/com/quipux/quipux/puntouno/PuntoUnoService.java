package com.quipux.quipux.puntouno;

import org.springframework.stereotype.Service;

@Service
public class PuntoUnoService {

    public String puntoUno(Integer numero) {

        if(numero<1 || numero>100){
            return "Solo se admiten enteros positivos entre 1 y 100";
        }

        return (numero % 2 != 0) || (numero % 2 == 0 && numero >= 6 && numero <= 20)
                ? "Quipux" : "No Quipux";

    }


}
