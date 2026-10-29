package com.Duoc.HuertoHogar.models.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class agregarUsuario {

    @NotBlank
    private String nombreUsuario;


    
}
