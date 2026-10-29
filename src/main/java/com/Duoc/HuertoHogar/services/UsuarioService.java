package com.Duoc.HuertoHogar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Duoc.HuertoHogar.models.entities.Usuario;
import com.Duoc.HuertoHogar.repository.UsuarioRepository;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obtenerTodo(){
        return usuarioRepository.findAll();
    }

    /*/ 
    public Usuario guardaruUsuario(ClienteRequest request){
        if(clientesRepository.existsByRutCliente(request.getRutCliente())){
            throw new RutDuplicadoException(("No se puede registrar el rut: " + request.getRutCliente() + " porque esta duplicado"));
        }

        Clientes clientes = crearDesdeRequest(request);
        return clientesRepository.save(clientes);
    }
    /*/ 
        
    
}
