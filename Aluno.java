import java.util.Date;

public class Aluno extends Pessoa {

	public Aluno(String nome, String cpf, Date data_nascimento) {
		super(nome, cpf, data_nascimento);
		// TODO Auto-generated constructor stub
	}
	
	public String matricula;

public class Professor extends Pessoa {

	public Professor(String nome, String cpf, Date data_nascimento) {
		super(nome, cpf, data_nascimento);
		// TODO Auto-generated constructor stub
	}
	
	public double salario;
	public String Salario;
	
}

public class Funcionario extends Pessoa{

	public Funcionario(String nome, String cpf, Date data_nascimento) {
		super(nome, cpf, data_nascimento);
		// TODO Auto-generated constructor stub
	}
	
	public double salario;
	public Date data_de_admissao;
	public String cargo;
	
	
}


}