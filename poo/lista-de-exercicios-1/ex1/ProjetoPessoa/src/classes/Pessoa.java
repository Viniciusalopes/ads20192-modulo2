package classes;

/**
 *
 * @author vovo
 */
public class Pessoa {

    // ATRIBUTOS
    private String nome = "";
    private int peso = 0;
    private float altura = 0;
    private String sexo = "";

    // MÉTODOS -------------------------------------------------------------------------->
    // GET ------------------------------------------------------------------------------>
    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }

    // SET ------------------------------------------------------------------------------>
    public void setNome(String nome) throws Exception {
        if (nome.trim().length() <= 1) {
            throw new Exception("nom001");
        }
        this.nome = nome;
    }

    public void setPeso(int peso) throws Exception {
        validarPeso(peso);
        this.peso = peso;
    }

    public void setAltura(float altura) throws Exception {
        validarAltura(altura);
        this.altura = altura;
    }

    public void setSexo(String sexo) throws Exception {
        if (!sexo.equals("Feminino") && !sexo.equals("Masculino")) {
            throw new Exception("sex001");
        }
        this.sexo = sexo;
    }

    // CÁLCULOS ------------------------------------------------------------------------->
    public float calcularImc() throws Exception {
        validarPeso(peso);
        validarAltura(altura);

        return (peso / (altura * altura));
    }

    public String classificarImc() throws Exception {
        
        float imc = calcularImc();

        if (imc < 17) {
            return "Muito abaixo do peso";
        } else if (imc < 18.50) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 35) {
            return "Obesidade I";
        } else if (imc <= 40) {
            return "Obesidade II (Severa)";
        } else {
            return "Obesidade III (Mórbida)";
        }
    }

    // VALIDAÇÕES ----------------------------------------------------------------------->
    private void validarPeso(int peso) throws Exception {
        if (peso <= 0) {
            throw new Exception("pes001");
        }
    }

    private void validarAltura(float altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("alt001");
        }
    }
}
