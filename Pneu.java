/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author helio
 */
public class Pneu {
    private String marca;
    private String modelo;
    private String medida;
    private String identDot;    // Identificação DOT do pneu
    private String identSerie;  // Identificação do número de série
    private Double profSulco;   // Profundidade do sulco do pneu

    // Construtor padrão
    public Pneu() {
    }

    // Construtor com todos os campos
    public Pneu(String marca, String modelo, String medida, String identDot, String identSerie, Double profSulco) {
        this.marca = marca;
        this.modelo = modelo;
        this.medida = medida;
        this.identDot = identDot;
        this.identSerie = identSerie;
        this.profSulco = profSulco;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getIdentDot() {
        return identDot;
    }

    public void setIdentDot(String identDot) {
        this.identDot = identDot;
    }

    public String getIdentSerie() {
        return identSerie;
    }

    public void setIdentSerie(String identSerie) {
        this.identSerie = identSerie;
    }

    public Double getProfSulco() {
        return profSulco;
    }

    public void setProfSulco(Double profSulco) {
        this.profSulco = profSulco;
    }

    // Método toString para exibir informações do pneu

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Pneu{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", medida='" + medida + '\'' +
                ", identDot='" + identDot + '\'' +
                ", identSerie='" + identSerie + '\'' +
                ", profSulco=" + profSulco +
                '}';
    }
}
