import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("Descrição");
        curso2.setCargaHoraria(7);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JS");
        mentoria2.setDescricao("Descrição mentoria JS");
        mentoria2.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRogeres = new Dev();
        devRogeres.setNome("Rogeres");
        devRogeres.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscristos Rogeres: " + devRogeres.getConteudosInscritos());
        devRogeres.progredir();
        devRogeres.progredir();
        System.out.println("Conteúdos Inscristos Rogeres: " + devRogeres.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rogeres: " + devRogeres.getConteudosConcluidos());
        System.out.println("XP: " + devRogeres.calcularXP());
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscristos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscristos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXP());
        
    }
}
