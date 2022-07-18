import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
