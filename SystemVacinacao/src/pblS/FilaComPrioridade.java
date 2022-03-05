package pblS;

public class FilaComPrioridade<T> extends Fila<T> {
//Estrutura usada para ordenação de elementos
	public void enfileira(T elemento) {

		Comparable<T> chave = (Comparable<T>) elemento;

		int i;
		for (i = 0; i < this.tamanho; i++) { //Adicionar o elemento na posição correta
			if (chave.compareTo(this.elementos[i]) < 0) {
				break;
			}
		}
		this.adiciona(i, elemento);
	}

}
