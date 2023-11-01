package botesPkg;

import java.util.Date;

public class Usuario { //Es el alquiler
    private String nombreCliente;
    private String dniCliente;
    private Date fechaInicial;
    private Date fechaFinal;
    private int posicionAmarre;
    private Barco barco;

    public Usuario(String nombreCliente, String dniCliente, Date fechaInicial, Date fechaFinal, int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double calcularCostoAlquiler() {
        long diferencia = fechaFinal.getTime() - fechaInicial.getTime();
        int numeroDias = (int) (diferencia / (24 * 60 * 60 * 1000));
        return numeroDias * barco.calcularModulo();
    }
}
