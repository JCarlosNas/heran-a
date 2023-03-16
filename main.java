import java.util.Date;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno i = new Aluno ("Joao","123.123.123-12", new Date(12/12/2001));
		i.matricula = "Ativa";
		
		System.out.println("Veja como os atributos foram preenchidos \n\nNome " + i.nome);
		System.out.println("Cpf " + i.cpf);
		System.out.println("Data de nascimento " +i.data_nascimento.toString() );
		System.out.println("Status da matricula: " + i.matricula);
	}

}


