package com.oscar.crud.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Modelo do Dado
 */

@Entity
@Table(name = "calcado")
public class Calcado {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

    private int tamanho;
    private String categoria;
    private String cor;
    private double preco;
    private String marca;
    private Date dataCadastro;
    private int quantEstoque;
    private String descricao;


    public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

    public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

    public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

    public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

    public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

    public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

    public int getQuantEstoque() {
		return quantEstoque;
	}
	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}

    public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
