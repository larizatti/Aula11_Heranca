public class Empregado {

    protected String nome;
    protected String endereço;
    protected double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public double getSalario() {
        return salario;
    }
    
    public Empregado(String nome, String endereço, double salario) {
        this.nome = nome;
        this.endereço = endereço;
        this.salario = salario;
    }

    public Empregado() {
    }

    public double CalcularIRPF(){

        double aux = 0;
        if (salario >= 2112.01 && salario <= 2826.66) {
            aux = salario * 0.075;
        }
        else if (salario >= 2826.67 && salario <= 3751.05){
            aux = salario * 0.15;
        }
        else if (salario >= 3751.06 && salario <= 4664.68){
            aux = salario * 0.225;
        }
        else if (salario > 4664.68){
            aux = salario * 0.275;
        }
        return aux;
    }

    public double CalcularINSS(){
        double aux = 0;

        if (salario <= 1412){
            aux = salario * 0.075;
        }
        else if (salario > 1412 && salario < 2667){
            aux = salario * 0.09;
        }
        else if (salario > 2667 && salario < 4000){
            aux = salario * 0.12;
        }
        else if (salario > 4000){
            aux = salario * 0.14;
        }
        return aux;

    }
    
}
