package com.paradise.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorPrincipal {
    @GetMapping("/index")
    
        public String cargarIndex(){
            return "index";
            }
}