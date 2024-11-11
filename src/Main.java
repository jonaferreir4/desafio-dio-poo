import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("React JS");
        curso.setDescricao("Curso frontend React JS");
        curso.setCargaHoraria(12);
        System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java");
        curso2.setDescricao("Curso backend Java");
        curso2.setCargaHoraria(14);
        System.out.println(curso2);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de java");
        mentoria1.setData(LocalDate.now());


        System.out.println(mentoria1);


    }
}