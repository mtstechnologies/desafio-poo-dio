import java.time.LocalDate;

import br.com.mts.desafio.dominio.Bootcamp;
import br.com.mts.desafio.dominio.Curso;
import br.com.mts.desafio.dominio.Dev;
import br.com.mts.desafio.dominio.Mentoria;

public class Principal {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso JavaScript");
        curso1.setDescricao("Descricao Curso JavaScript");
        curso1.setCargaHoraria(4);

        //Conteudo conteudo1 = new Curso(); podemos acessar as subclasses de uma classe abstrata, nunca diretamente.
        //Conteudo conteudo2 = new Mentoria();
        //List<String> palavras = new ArrayList<>();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMichael = new Dev();
        devMichael.setNome("Michael");
        devMichael.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Michael" + devMichael.getConteudosInscritos());
        System.out.println("-");
        devMichael.progredir();
        devMichael.progredir();
        System.out.println("Conteudos concluidos Michael" + devMichael.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Michael" + devMichael.getConteudosInscritos());
        System.out.println("XP:" + devMichael.calcularTotalXp());


        System.out.println("----------------------------------");

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Davi" + devDavi.getConteudosInscritos());
        System.out.println("-");
        devDavi.progredir();
        System.out.println("Conteudos concluidos Davi" + devMichael.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Davi" + devDavi.getConteudosInscritos());
        System.out.println("XP:" + devDavi.calcularTotalXp());
    }
}
