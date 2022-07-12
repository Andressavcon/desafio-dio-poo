import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria do java");
        mentoria.setDescricao("descrição mentoria do java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndressa = new Dev();
        devAndressa.setNome("Andressa");
        devAndressa.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Andressa:" + devAndressa.getConteudosInscritos());
        devAndressa.progredir();
        devAndressa.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Andressa:" + devAndressa.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Andressa:" + devAndressa.getConteudosConcluidos());
        System.out.println("XP " + devAndressa.calcularTotalXp());

        System.out.println("------------");

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Lucas:" + devLucas.getConteudosConcluidos());
        System.out.println("XP " + devLucas.calcularTotalXp());

    }
}
