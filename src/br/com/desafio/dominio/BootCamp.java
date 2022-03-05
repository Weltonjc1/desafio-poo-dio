package br.com.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

	private String nome;
	private String Descri��o;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate datafinal = dataInicial.plusDays(45);
	private Set<Dev> devsInscritos = new HashSet<Dev>();
	private Set<Conteudo> conteudos = new LinkedHashSet<Conteudo>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescri��o() {
		return Descri��o;
	}
	public void setDescri��o(String descri��o) {
		Descri��o = descri��o;
	}
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public LocalDate getDatafinal() {
		return datafinal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Descri��o, conteudos, dataInicial, datafinal, devsInscritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BootCamp other = (BootCamp) obj;
		return Objects.equals(Descri��o, other.Descri��o) && Objects.equals(conteudos, other.conteudos)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(datafinal, other.datafinal)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(nome, other.nome);
	}
	
	
}
