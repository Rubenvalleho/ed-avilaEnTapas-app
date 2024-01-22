package com.rubenvj.avilaEnTapas.features.tapas.domain;

public class Tapa {
    //Atributos de las tapas
    private String idTapa;
    private String nombreTapa;
    private String establecimiento;
    private String rankingTapa;
    private String numeroParticipantes;
    private String totalPuntosTapa;
    private String mediaVotosTapa;
    private String totalVotos;
    private String descripcionTapa;
    private String ingredientes;
    private String alergenos;
    private String fotoTapa;
    private String direccion;

    //Constructor mínimo de la tapa
    public Tapa (String idTapa, String nombreTapa, String establecimiento, String totalPuntosTapa, String mediaVotosTapa, String numeroParticipantes, String totalVotos, String ingredientes) {
        this.idTapa = idTapa;
        this.nombreTapa = nombreTapa;
        this.establecimiento = establecimiento;
        this.totalPuntosTapa = totalPuntosTapa;
        this.mediaVotosTapa = mediaVotosTapa;
        this.numeroParticipantes = numeroParticipantes;
        this.totalVotos = totalVotos;
        this.ingredientes = ingredientes;
    }

    //Metodos get y set

    public String getIdTapa() {
        return idTapa;
    }

    public void setIdTapa(String idTapa) {
        this.idTapa = idTapa;
    }

    public String getNombreTapa() {
        return nombreTapa;
    }

    public void setNombreTapa(String nombreTapa) {
        this.nombreTapa = nombreTapa;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getRankingTapa() {
        return rankingTapa;
    }

    public void setRankingTapa(String rankingTapa) {
        this.rankingTapa = rankingTapa;
    }

    public String getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(String numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public String getTotalPuntosTapa() {
        return totalPuntosTapa;
    }

    public void setTotalPuntosTapa(String totalPuntosTapa) {
        this.totalPuntosTapa = totalPuntosTapa;
    }

    public String getMediaVotosTapa() {
        return mediaVotosTapa;
    }

    public void setMediaVotosTapa(String mediaVotosTapa) {
        this.mediaVotosTapa = mediaVotosTapa;
    }

    public String getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(String totalVotos) {
        this.totalVotos = totalVotos;
    }

    public String getDescripcionTapa() {
        return descripcionTapa;
    }

    public void setDescripcionTapa(String descripcionTapa) {
        this.descripcionTapa = descripcionTapa;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getAlergenos() {
        return alergenos;
    }

    public void setAlergenos(String alergenos) {
        this.alergenos = alergenos;
    }

    public String getFotoTapa() {
        return fotoTapa;
    }

    public void setFotoTapa(String fotoTapa) {
        this.fotoTapa = fotoTapa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
