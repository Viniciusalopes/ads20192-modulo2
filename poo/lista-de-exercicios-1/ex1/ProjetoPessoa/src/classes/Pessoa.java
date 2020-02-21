package classes;

public class Pessoa {

    // ATRIBUTOS
    private String nome = "";
    private float peso = 0;
    private float altura = 0;
    private String sexo = "";

    // GET
    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }

    // SET
    public void setNome(String nome) throws Exception {
        if (nome.trim().length() == 0) {
            throw new Exception("nom001");
        }
        this.nome = nome;
    }

    public void setPeso(float peso) throws Exception {
        if (peso <= 0) {
            throw new Exception("pes001");
        }
        this.peso = peso;
    }

    public void setAltura(float altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("alt001");
        }
        this.altura = altura;
    }

    public void setSexo(String sexo) throws Exception {
        if (sexo.trim().length() == 0 || (sexo != "Feminino" && sexo != "Masculino")) {
            throw new Exception("sex001");
        }
        this.sexo = sexo;
    }

    public float calcularImc() throws Exception {
        if (altura <= 0) {
            throw new Exception("alt002");
        }
        return (peso / altura * altura);
    }
}
