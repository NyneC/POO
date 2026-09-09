/**
 * Aluno: Eduardo Seiji Sugawara
 * RA: 2819239
 * 
 * Domínio:
 * Classe Alunos recebe os Professores de suas respectivas materias,
 * podendo ser adicionada ou excluida se o aluno não terminou elas ainda.
 * 
 * 1-Alunos
 * 2-Professores
 * 
 * 
 * 
 */

//Classe1 Alunos
class Alunos{
    private String nomeA;
    private int quant_materias;

    //construtor
    public Alunos(String nomeA, int quant_materias){
        this.nomeA = nomeA;
        this.quant_materias = quant_materias;
    }

    //getters e setters
    public String getNomeA(){return nomeA;}
    public int getQuant_materias(){return quant_materias;} 
}

//Classe2 Professores
class Professores{
    private String nomeP;
    private String materias;

    //construtor
    public Professores(String nomeP, String materias){
        this.nomeP = nomeP;
        this.materias = materias;
    }

    //getters e setters
    public String getNomeP(){return nomeP;}
    public String getMaterias(){return materias;}
}


public class Main{

    public static void main(String[] args){

    //criando a variável "aluno" e atribuindo os valores
        Alunos aluno = new Alunos("Eduardo", 2);
        
        //criando a variável "professor" e atribuindo os valores
        Professores professor1 = new Professores("Luiz", "POO");
        Professores professor2 = new Professores("Fábio", "ED1");
        
        //printa os valores
        System.out.printf("\nO aluno %s tem %d matérias com os professores %s e %s das matérias de %s e %s respectivamente.\n",
        aluno.getNomeA(),
        aluno.getQuant_materias(),
        professor1.getNomeP(),
        professor2.getNomeP(),
        professor1.getMaterias(),
        professor2.getMaterias());
    }
}