package com.example.APISURAG8NOTIFICACIONES.repositorios;

import com.example.APISURAG8NOTIFICACIONES.modelos.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioNotificacion extends JpaRepository<Notificacion, Integer> {
}
