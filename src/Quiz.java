import classes.Cabecalho;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) throws java.lang.Exception {

        Cabecalho head = new Cabecalho();
        head.Universidade = "unifan";
        head.Nomealuno = "Samuel Leite De Moraes";
        head.Prof = "brenno pimenta";
        head.Diciplina = "Algoritmo e programação";
        head.escrevacabecalho();

        int numeroAcertos = 0;
        System.out.println("Primeira Pergunta!!");
        numeroAcertos += grupo1();
        numeroAcertos += grupo2();
        numeroAcertos += grupo3();
        numeroAcertos += grupo4();
        numeroAcertos += grupo5();
        numeroAcertos += grupo6();
        numeroAcertos += grupo7();
        numeroAcertos += grupo8();
        numeroAcertos += grupo9();
        numeroAcertos += grupo10();
        System.out.println("Fim da primeira pergunta");
        System.out.println("Fim do Quiz! Parabéns... De 10 perguntas você acertou: " + numeroAcertos);
    }

    public static int grupo1() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao1 = new Questao();
        questao1.setPergunta("Qual é o objetivo principal da palavra-chave return em um método Java?");
        questao1.setOpcaoA("A - Iniciar um loop.");
        questao1.setOpcaoB("B - Declarar uma variável.");
        questao1.setOpcaoC("C - Sair imediatamente do método e retornar um valor.");
        questao1.setOpcaoD("D - Exibir uma mensagem de erro.");
        questao1.setOpcaoE("E - Iniciar um novo método.");
        questao1.setCorreta("C");
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");


        return cont;

    }

    public static int grupo2() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao1 = new Questao();
        questao1.setPergunta("Qual e o metodo main do Java?");
        questao1.setOpcaoA("A - O nome do método main em Java é simplesmente \"main\".");
        questao1.setOpcaoB("B - O método main do Java é chamado de \"ponto de entrada\" do programa Java.");
        questao1.setOpcaoC("C - Em Java, o método main é conhecido como o \"método de inicialização\".");
        questao1.setOpcaoD("D - O método main em Java é frequentemente referido como o \"método de início\".");
        questao1.setOpcaoE("E - No contexto Java, o método main é chamado de \"método de início da execução\"");
        questao1.setCorreta("A");
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");

        return cont;

    }

    public static int grupo3() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao1 = new Questao();
        questao1.setPergunta("Qual é a palavra-chave usada para declarar uma classe em Java?");
        questao1.setOpcaoA("A - class");
        questao1.setOpcaoB("B - public");
        questao1.setOpcaoC("C - void");
        questao1.setOpcaoD("D - new");
        questao1.setOpcaoE("E - package");
        questao1.setCorreta("A");
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");

        return cont;
    }

    public static int grupo4() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao1 = new Questao();
        questao1.setPergunta("Qual é o tipo de dado primitivo em Java que é usado para representar valores de ponto flutuante de precisão dupla?");
        questao1.setOpcaoA("A - int");
        questao1.setOpcaoB("B - double");
        questao1.setOpcaoC("C - float");
        questao1.setOpcaoD("D - char");
        questao1.setOpcaoE("E - boolean");
        questao1.setCorreta("B");
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");

        return cont;
    }

    public static int grupo5() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao1 = new Questao();
        questao1.setPergunta("Em Java, como você declara uma variável inteira (int) chamada \"idade\" e a inicializa com o valor 25?");
        questao1.setOpcaoA("A - int idade = 25");
        questao1.setOpcaoB("B - idade = 25");
        questao1.setOpcaoC("C - idade 25");
        questao1.setOpcaoD("D - int idade");
        questao1.setOpcaoE("E - idade = \"25"\"");
        questao1.setCorreta("A");
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");

        return cont;
    }

    public static int grupo6() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao1 = new Questao();
        questao1.setPergunta("Qual é o operador usado para comparar se dois valores são iguais em Java?");
        questao1.setOpcaoA("A - ==");
        questao1.setOpcaoB("B - =");
        questao1.setOpcaoC("C - !=");
        questao1.setOpcaoD("D - <>");
        questao1.setOpcaoE("E - =");
        questao1.setCorreta("A");
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");

        return cont;
    }

    public static int grupo7() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao1 = new Questao();
        questao1.setPergunta("Qual é o método principal utilizado para iniciar a execução de um programa Java?");
        questao1.setOpcaoA("A -  start()");
        questao1.setOpcaoB("B - run()");
        questao1.setOpcaoC("C - main()");
        questao1.setOpcaoD("D - execute()");
        questao1.setOpcaoE("E - launch()");
        questao1.setCorreta("D");
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");

        return cont;
    }

    public static int grupo8() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao1 = new Questao();
        questao1.setPergunta("O que faz o método System.out.println(\"Hello, World!\"); em Java?");
        questao1.setOpcaoA("A - Declara uma variável.");
        questao1.setOpcaoB("B - Imprime \"Hello, World!\" no console.");
        questao1.setOpcaoC("C - Lê um arquivo.");
        questao1.setOpcaoD("D - Retorna um valor.");
        questao1.setOpcaoE("E - Inicializa um objeto.");
        questao1.setCorreta("B");
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");

        return cont;
    }

    public static int grupo9() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao1 = new Questao();
        questao1.setPergunta("Como você cria um loop infinito em Java?");
        questao1.setOpcaoA("A - while (true) {}");
        questao1.setOpcaoB("B - for (int i = 0; i < 10; i++) {}");
        questao1.setOpcaoC("C - do { } while (false);");
        questao1.setOpcaoD("D - if (true) {}");
        questao1.setOpcaoE("E - loop(infinito) {}");
        questao1.setCorreta("A");
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");

        return cont;
    }

    public static int grupo10() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao1 = new Questao();
        questao1.setPergunta("O que é uma exceção em Java?");
        questao1.setOpcaoA("A - Um erro de compilação.");
        questao1.setOpcaoB("B - Uma mensagem de depuração.");
        questao1.setOpcaoC("C - Um tipo de variável.");
        questao1.setOpcaoD("D - Um evento que representa um problema durante a execução do programa.");
        questao1.setOpcaoE("E - Uma classe abstrata.");
        questao1.setCorreta("D");
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");

        return cont;
    }

    public static String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    public static boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida ... ");
        return false;
    }

    public static class Questao {
        private String pergunta = "";
        private String opcaoA = "";
        private String opcaoB = "";
        private String opcaoC = "";
        private String opcaoD = "";
        private String opcaoE = "";
        private String correta = "";

        public boolean isCorreta(String resposta) {
            if (resposta.equalsIgnoreCase(this.correta)) {
                System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
                return true;
            } else {
                System.out.println("Resposta Errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                return false;
            }
        }

        public void escrevaQuestao() {
            System.out.println(this.pergunta);
            System.out.println();
            System.out.println(this.opcaoA);
            System.out.println(this.opcaoB);
            System.out.println(this.opcaoC);
            System.out.println(this.opcaoD);
            System.out.println(this.opcaoE);
            System.out.println();
        }

        public void setPergunta(String pergunta) {
            this.pergunta = pergunta;
        }
        public void setOpcaoA(String opcaoA) {
            this.opcaoA = opcaoA;
        }
        public void setOpcaoB(String opcaoB) {
            this.opcaoB = opcaoB;
        }
        public void setOpcaoC(String opcaoC) {
            this.opcaoC = opcaoC;
        }
        public void setOpcaoD(String opcaoD) {
            this.opcaoD = opcaoD;
        }
        public void setOpcaoE(String opcaoE) {
            this.opcaoE = opcaoE;
        }
        public void setCorreta(String correta) {
            this.correta = correta;
        }
    }
}