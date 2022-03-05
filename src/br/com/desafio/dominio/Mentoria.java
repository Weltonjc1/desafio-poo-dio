package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public double calcularXP() {
		double x = XP_PADRAO + 20d;
		return x;
	}


	@Override
	public String toString() {
		return "Conteudo [titulo=" + getTitulo() + ", descricao=" + getDescricao() + " data="+data+"]";
	}
	
	
	
}
