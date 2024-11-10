/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author helio
 */
public class Veiculo {
    
    private String marca;
    private String modelo;
    private String percurso;

    // Construtor vazio
    public Veiculo() {}

    // Construtor com todos os atributos
    public Veiculo(String marca, String modelo, String percurso) {
        this.marca = marca;
        this.modelo = modelo;
        this.percurso = percurso;
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

    public String getPercurso() {
        return percurso;
    }

    public void setPercurso(String percurso) {
        this.percurso = percurso;
    }
}
