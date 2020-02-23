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
        if (nome.trim().length() < 2) {
            throw new Exception("Nome inválido!");
        }
        this.nome = nome;
    }

    public void setPeso(float peso) throws Exception {
        if (peso <= 0) {
            throw new Exception("Peso não pode ser <= 0.");
        }
        this.peso = peso;
    }

    public void setAltura(float altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("Altura não pode ser <= 0.");
        }
        this.altura = altura;
    }

    public void setSexo(String sexo) throws Exception {
        if (!sexo.toLowerCase().equals("feminino") && !sexo.toLowerCase().equals("masculino")) {
            throw new Exception("Sexo deve ser Feminino ou Masculino");
        }
        this.sexo = sexo;
    }

    public float calcularImc() throws Exception {
        if (altura <= 0) {
            throw new Exception("Não é possível calcular o IMC com a altura <= 0");
        }
        return (peso / (altura * altura));
    }
}
