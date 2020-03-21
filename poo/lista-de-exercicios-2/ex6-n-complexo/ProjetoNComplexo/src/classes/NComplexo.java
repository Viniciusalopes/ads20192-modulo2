package classes;

/**
 *
 * @author vovo
 */
public class NComplexo {

    // ATRIBUTOS
    //i.um número complexo possui a seguinte forma: parte real + parte imaginária * i (a+bi) onde i é a raiz quadrada de -1;
    private int parteReal = 0;
    private int parteImaginaria = 0;

    //MÉTODOS CONSTRUTORES
    public NComplexo() {
        parteReal = 0;
        parteImaginaria = 0;
    }

    //ii. inicializar o número, recebe dois valores como argumentos para inicializar os campos da classe (parte real e imaginária);
    public NComplexo(int parteReal, int parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public NComplexo(NComplexo objeto) {
        this.parteReal = objeto.parteReal;
        this.parteImaginaria = objeto.parteImaginaria;
    }

    // GET
    // iii. obter o número, devolve o número complexo encapsulado usando a notação a + bi;
    public String get() {
        return String.format("%d + %di", parteReal, parteImaginaria);
    }

    // SET
    public void set(int parteReal, int parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public void set(NComplexo objeto) {
        this.parteReal = objeto.parteReal;
        this.parteImaginaria = objeto.parteImaginaria;
    }

    // Cálculos
    // v. adicionar, recebe uma outra instância da classe Número Complexo e adiciona este
    // número complexo com o encapsulado usando a fórmula (a+bi)+(c+di) = (a+c)+(b+d)i e
    // devolve um novo Número Complexo como resposta;
    public NComplexo adicionar(NComplexo objeto) {
        int real = this.parteReal + objeto.parteReal;
        int imaginaria = this.parteImaginaria + objeto.parteImaginaria;
        NComplexo aux = new NComplexo(real, imaginaria);
        return aux;
    }

    // vi. subtrair, recebe uma outra instância da classe Número Complexo e subtrai este número
    // complexo com o encapsulado usando a fórmula (a+bi)−(c+di) = (a−c)+(b−d)i e devolve
    // um novo Número Complexo como resposta;
    public NComplexo subtrair(NComplexo objeto) {
        int real = this.parteReal + objeto.parteReal;
        int imaginaria = this.parteImaginaria - objeto.parteImaginaria;
        NComplexo aux = new NComplexo(real, imaginaria);
        return aux;
    }

    // vii. multiplicar, recebe uma outra instância da classe Número Complexo e multiplica este
    // número complexo com o encapsulado usando a fórmula (a+bi)∗(c+di) = (ac−bd)+(ad+bc)i
    // e devolve um novo Número Complexo como resposta;
    public NComplexo multiplicar(NComplexo objeto) {
        NComplexo aux = new NComplexo();
        return aux;
    }

    // viii. dividir, recebe uma outra instância da classe Número Complexo e divide este número
    // complexo com o encapsulado usando a fórmula (a+bi)/(c+di) = (ac+bd)/(c 2 +d 2 ) + ((bc-
    // ad)/(c 2 +d 2 ))i e devolve um novo Número Complexo como resposta.
    public NComplexo dividir(NComplexo objeto) {
        NComplexo aux = new NComplexo();
        return aux;
    }

    // iv. verificar a igualdade, recebe uma outra instância da classe Número Complexo e retorna
    // true se os valores dos campos encapsulados forem iguais aos da instância passada
    // como argumento;
    public boolean igual(NComplexo objeto) {
        NComplexo aux = new NComplexo();
        return (aux == objeto);
    }
}
