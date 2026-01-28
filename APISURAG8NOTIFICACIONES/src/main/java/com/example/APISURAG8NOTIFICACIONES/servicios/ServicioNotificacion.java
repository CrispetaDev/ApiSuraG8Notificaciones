package com.example.APISURAG8NOTIFICACIONES.servicios;

import com.example.APISURAG8NOTIFICACIONES.modelos.Notificacion;
import com.example.APISURAG8NOTIFICACIONES.repositorios.IRepositorioNotificacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioNotificacion {

    //El servicio utiliza al repositorio
    //a este uso se le llama inyección de dependencia

    @Autowired
    IRepositorioNotificacion repositorio;

    //se crean funciones publicas par activar cada consulta
    //que se pueda ofrecer
    public Notificacion guardar(Notificacion datos){
        return this.repositorio.save(datos);
    }

    public List<Notificacion> buscarTodos(){
        return this.repositorio.findAll();
    }

    public Notificacion buscarPorId(Integer id)throws Exception{
        //1. Para buscar por id primero debo utilizar
        //la clase 0ptional de java
        Optional<Notificacion> notificacionBuscada=this.repositorio.findById(id);
        if(notificacionBuscada.isPresent()){
            return notificacionBuscada.get();

        }else {
            throw new Exception("No se encontró la notificación buscada");
        }

    }


}
