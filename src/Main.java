import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao de Curso em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Progress");
        curso2.setDescricao("Descricao de Curso em Progress");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso(); //Polimorfismo. Instancia de Curso atraves da Classe Conteudo.
        Conteudo conteudo2 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Descricao de mentoria em Java");
        mentoria.setData(LocalDate.now());  //Neste caso o LocalDate esta apresentando na execução a data atual.

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developper");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAdriana = new Dev();
        devAdriana.setNome("Adriana");
        devAdriana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devAdriana.getConteudosInscritos());
        devAdriana.progredir();
        System.out.println("Conteudos Inscritos" + devAdriana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devAdriana.getConteudosConcluidos());
        System.out.println("XP" + devAdriana.calcularTotalXp());

        Dev devFabio = new Dev();
        devFabio.setNome("Fabio");
        devFabio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devAdriana.getConteudosInscritos());
        devFabio.progredir();
        System.out.println("Conteudos Inscritos" + devAdriana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devAdriana.getConteudosConcluidos());
        System.out.println("XP " + devFabio.calcularTotalXp());


    }
}
