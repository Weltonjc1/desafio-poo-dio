import java.time.LocalDate;

import br.com.desafio.dominio.Conteudo;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Descrição curso Java Script");
		curso2.setCargaHoraria(8);
		
		Conteudo curso3 = new Curso();
		curso3.setTitulo(null);
		curso3.setDescricao(null);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Java");
		mentoria1.setDescricao("Descrição Mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		

		
		
	}

}
