package pblS;


public class Fila<T> extends EstruturaEstatica<T> {
    //Classe flha
	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}

	public void enfileira(T elemento) { // Insere os elementos ordenados

		this.adiciona(elemento);
	}

	public T espiar() { //Retornar o proximo elemento a ser atendindo

		if (this.estaVazia()) {
			return null;
		}

		return this.elementos[0];
	}

	public T desenfileira() { //Remover o elemento que estiver na primeira posicão na fila

		final int POS = 0;

		if (this.estaVazia()) {
			return null;
		}

		T elementoASerRemovido = this.elementos[POS];

		this.remove(POS);

		return elementoASerRemovido;

	}
}
