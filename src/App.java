import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Java OO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("NodeJS");
        curso2.setDescricao("Node JS realTime");
        curso2.setCargaHoraria(10);

        /*  polimorfismo 
        Conteudo conteudo = new Curso(); */

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java Mentoria");
        mentoria.setDescricao("mentoria de OO em java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Dev");
        bootcamp.setDescricao("Torne-se o maior javeiro de todos!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devUser = new Dev();
        devUser.setNome("user");
        devUser.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos user " + devUser.getConteudosInscritos());
        
        devUser.progredir();
        System.out.println("-");
        System.out.println("Conteudos incritos user " + devUser.getConteudosInscritos());
        System.out.println("Conteudos concluidos user " + devUser.getConteudosConcluidos());
        System.out.println("XP: " + devUser.calcularTotalXp());

        System.out.println("====================================");

        Dev devSnow = new Dev();
        devSnow.setNome("John Snow");
        devSnow.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos " + devSnow.getNome() + devSnow.getConteudosInscritos());
        
        devUser.progredir();
        devUser.progredir();
        System.out.println("-");
        System.out.println("Conteudos incritos " + devSnow.getNome() + devSnow.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devSnow.getNome() + devSnow.getConteudosConcluidos());
        System.out.println("XP: " + devUser.calcularTotalXp());
    }
}
