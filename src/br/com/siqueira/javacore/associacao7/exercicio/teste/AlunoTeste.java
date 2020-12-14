package br.com.siqueira.javacore.associacao7.exercicio.teste;

import br.com.siqueira.javacore.associacao7.exercicio.classes.Aluno;
import br.com.siqueira.javacore.associacao7.exercicio.classes.Local;
import br.com.siqueira.javacore.associacao7.exercicio.classes.Professor;
import br.com.siqueira.javacore.associacao7.exercicio.classes.Seminario;

public class AlunoTeste {
    public static void main(String[] args){

        Aluno aluno = new Aluno("Gabriel", 17);
        Aluno aluno2 = new Aluno("Anakin", 22);
        Seminario seminario = new Seminario("Java do Futuro");
        Professor professor = new Professor("Yoda", "Usar a força para programar");
        Local local = new Local("Rua das Araras", "Mato");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setProfessor(professor);
//        seminario.setLocal(local);
//        seminario.setAluno(new Aluno[]{aluno, aluno2});

        Seminario[] profArray = new Seminario[1];
        profArray[0] = seminario;

        professor.setSeminario(profArray);

        aluno.setSeminario(seminario);
        aluno.print();
        seminario.print();
        local.print();
        professor.print();

    }
}
