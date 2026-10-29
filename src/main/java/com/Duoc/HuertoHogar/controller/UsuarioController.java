package com.Duoc.HuertoHogar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Duoc.HuertoHogar.models.entities.Usuario;
import com.Duoc.HuertoHogar.services.UsuarioService;


@RequestMapping("/usuario")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("")
    public List<Usuario> obtenerTodosLosUsuarios(){
        return usuarioService.obtenerTodo();
    }

    
     @PostMapping
    public ResponseEntity<EntityModel<Usuario>>  guardar(@Valid @RequestBody ClienteRequest
                                            request){
        Clientes clienteGuardado = clienteService.guardarCliente(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(toModel(clienteGuardado));
    }

    
}
