import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript ");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descriação mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao(" Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Tuane");
        dev1.increverBootcamp(bootcamp1);

        System.out.println("Conteúdos Inscritos Tuane: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos Tuane: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Tuane: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("--------------------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Luis");
        dev2.increverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos Luis: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos Luis: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Luis: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }
}