package com.example.APISURAG8NOTIFICACIONES.modelos;

import jakarta.persistence.*;

@Entity
@Table
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idRemitente;
    private Integer idDestinatario;
    private String nombreUsuario;
    private Boolean mensajeLeido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(Integer idRemitente) {
        this.idRemitente = idRemitente;
    }

    public Integer getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(Integer idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Boolean getMensajeLeido() {
        return mensajeLeido;
    }

    public void setMensajeLeido(Boolean mensajeLeido) {
        this.mensajeLeido = mensajeLeido;
    }
}
