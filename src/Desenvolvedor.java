public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome) {
        super(nome);
    }

    @Override
    public Double calcularSalario() {
        return 10000 * 2.0;
    }

    @Override
    public String descreverResponsabilidades() {
        return "Fazer código";
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + getNome() + "\n" + "salário: " + calcularSalario() + "\n" + "Responsabilidades: " + descreverResponsabilidades();
    }
}
