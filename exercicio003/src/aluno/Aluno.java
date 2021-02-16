package aluno;

public class Aluno {

	public String nome;
	public double nota1, nota2, nota3;

	public double somaNota() {
		return nota1 + nota2 + nota3;
	}

	public double finalGrade() {
		if (somaNota() < 60.0) {
			return 60.0 - somaNota();
		} else {
              return 0.0;
		}
	}
}
