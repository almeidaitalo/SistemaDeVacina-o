package pblS;


import java.text.ParseException;

public class ControlarPaciente extends Paciente {
	
	FilaComPrioridade<Paciente> fila = new FilaComPrioridade<Paciente>();
	
	public void InserirPaciente(String nome, int idade) {
		Paciente p = new Paciente();
		//Insere o paciente na Fila
		p.setNome(nome);
		p.setIdade(idade);
		fila.enfileira(new Paciente(nome, idade));//Utilizei o metodo  enfileira da classe Fila para ordenar 
		System.out.println(p);

	}
    //Exibe a lista de pacientes
	public void ExibirPaciente()throws ParseException {		
		
	System.out.println("Paciente: " + fila.toString());
		
		
	}
	//Vai Remover o Paciente da lista
	public void RemoverPaciente() throws ParseException {
    fila.remove(0);
    System.out.println(fila);
    
	}
	public void desenfileira() throws ParseException { //Vai remover o primeiro  elemento da fila
     fila.desenfileira();
     System.out.println(fila);
	}

}
