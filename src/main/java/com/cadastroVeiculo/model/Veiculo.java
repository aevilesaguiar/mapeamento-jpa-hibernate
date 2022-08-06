package com.cadastroVeiculo.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tab_veiculos")
public class Veiculo {

    @EmbeddedId
    private VeiculoId id;
    @Column(length = 60, nullable = false)
    private String fabricante;
    @Column(length = 60, nullable = false)
    private String modelo;
    @Column(name = "ano_fabricacao", nullable = false)
    private Integer anoFabricacao;
    @Column(name = "ano_modelo", nullable = false)
    private Integer anoModelo;
    @Column(precision = 10, scale = 2, nullable = true)
    private Double valor;

    public Veiculo() {

    }

    public Veiculo(String fabricante, String modelo, Integer anoFabricacao, Integer anoModelo, Double valor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.valor = valor;
    }



    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(id, veiculo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
