/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author helio
 */
import java.util.Date;

public class NotaFiscal {
    
    private String numero;
    private Date dataEmissao;

    // Construtor vazio
    public NotaFiscal() {}

    // Construtor com todos os atributos
    public NotaFiscal(String numero, Date dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
    }

    // Getters e Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
}
