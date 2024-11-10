/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author helio
 */
import java.util.Date;

public class Relatorio {
    
    private Date dataSolicitacao;
    private String reclamacao;
    private byte[] foto1;
    private byte[] foto2;
    private byte[] foto3;
    private byte[] foto4;
    private byte[] foto5;
    private byte[] foto6;
    private byte[] foto7;
    private byte[] foto8;
    private String laudo;
    private Double valorReembolso;

    // Construtor vazio
    public Relatorio() {}

    // Construtor com todos os atributos
    public Relatorio(Date dataSolicitacao, String reclamacao, byte[] foto1, byte[] foto2, byte[] foto3, byte[] foto4,
                     byte[] foto5, byte[] foto6, byte[] foto7, byte[] foto8, String laudo, Double valorReembolso) {
        this.dataSolicitacao = dataSolicitacao;
        this.reclamacao = reclamacao;
        this.foto1 = foto1;
        this.foto2 = foto2;
        this.foto3 = foto3;
        this.foto4 = foto4;
        this.foto5 = foto5;
        this.foto6 = foto6;
        this.foto7 = foto7;
        this.foto8 = foto8;
        this.laudo = laudo;
        this.valorReembolso = valorReembolso;
    }

    // Getters e Setters
    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(String reclamacao) {
        this.reclamacao = reclamacao;
    }

    public byte[] getFoto1() {
        return foto1;
    }

    public void setFoto1(byte[] foto1) {
        this.foto1 = foto1;
    }

    public byte[] getFoto2() {
        return foto2;
    }

    public void setFoto2(byte[] foto2) {
        this.foto2 = foto2;
    }

    public byte[] getFoto3() {
        return foto3;
    }

    public void setFoto3(byte[] foto3) {
        this.foto3 = foto3;
    }

    public byte[] getFoto4() {
        return foto4;
    }

    public void setFoto4(byte[] foto4) {
        this.foto4 = foto4;
    }

    public byte[] getFoto5() {
        return foto5;
    }

    public void setFoto5(byte[] foto5) {
        this.foto5 = foto5;
    }

    public byte[] getFoto6() {
        return foto6;
    }

    public void setFoto6(byte[] foto6) {
        this.foto6 = foto6;
    }

    public byte[] getFoto7() {
        return foto7;
    }

    public void setFoto7(byte[] foto7) {
        this.foto7 = foto7;
    }

    public byte[] getFoto8() {
        return foto8;
    }

    public void setFoto8(byte[] foto8) {
        this.foto8 = foto8;
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public Double getValorReembolso() {
        return valorReembolso;
    }

    public void setValorReembolso(Double valorReembolso) {
        this.valorReembolso = valorReembolso;
    }
}
