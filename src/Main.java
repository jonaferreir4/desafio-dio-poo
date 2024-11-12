import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("React JS");
        curso.setDescricao("Curso frontend React JS");
        curso.setCargaHoraria(12);
       // System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java");
        curso2.setDescricao("Curso backend Java");
        curso2.setCargaHoraria(14);
        //System.out.println(curso2);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de java");
        mentoria1.setData(LocalDate.now());
        //System.out.println(mentoria1);

        BootCamp bootcamp1 = new BootCamp();

        bootcamp1.setNome("Spring Experience");
        bootcamp1.setDescricao("Bootcamp de Spring Experience");
        bootcamp1.getConteudos().add(curso);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);


        Dev dev1 = new Dev();
        dev1.setNome("Jona");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("conteúdos escritos: " + dev1.getConteudosEscritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("conteúdos escritos: " + dev1.getConteudosEscritos());
        System.out.println("conteúdos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("--------");

        Dev dev2 = new Dev();
        dev2.setNome("Marisol");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("conteúdos escritos: " + dev2.getConteudosEscritos());
        dev2.progredir();
        System.out.println("-");
        System.out.println("conteúdos escritos: " + dev2.getConteudosEscritos());
        System.out.println("conteúdos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}