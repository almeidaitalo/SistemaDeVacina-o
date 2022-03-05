package pblS;

import java.util.LinkedList;
import java.util.Queue;
//A classe paciente vai servir para comparar a prioridade se for maior ou menor,
//por meio da interface Comparable, essa classe pede para implementar o metodo campareTo
public class Paciente implements Comparable<Paciente> {
	private String nome;
	private int idade; // prioridade da fila
    private Queue<Fase> fase;
    
	

	public Paciente(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		fase = new LinkedList<>();

	}

	public Paciente() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Queue<Fase> getFase() {
		return fase;
	}

	public void setFase(Queue<Fase> fase) {
		this.fase = fase;
	}
	@Override
	public int compareTo(Paciente o) { //Comparar objetos

		if (this.idade > o.getIdade()) {
			return -1;
		} else if (this.idade < o.getIdade()) {
			return 1;
		}

		return 0;
	}

	@Override
	public String toString() {
		return getNome() + " " + getIdade();
	}
}