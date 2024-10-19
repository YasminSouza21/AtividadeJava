public class Gerente extends Funcionario{

    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public Double calcularSalario() {
        return 1000 * 5.0;
    }

    @Override
    public String descreverResponsabilidades() {
        return "Resolver pendencias";
    }

    @Override
    public String toString() {
        return "Gerente: " + getNome() + " \n" + "salário: " + calcularSalario() + "\n" + "Responsabilidades: " + descreverResponsabilidades();
    }
}
