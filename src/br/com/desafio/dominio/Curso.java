package br.com.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Conteudo [titulo=" + getTitulo() + ", descricao= " + getDescricao() +" cargaHoraria=" +cargaHoraria+"]";
	}
	
	
}
