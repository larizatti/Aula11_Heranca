public class Horista extends Empregado{
    private double horas;
    private double valor_hora;

    //Construtor
    public Horista (String nome, String endereço, double horas, double valor_hora) {
        super (nome,endereço);
        this.horas = horas;
    }

    public Horista (double horas){
        this.horas = horas;
    }

    //Metodos de acesso

    public void set_horas (double horas){
       this.horas = horas;
    }
    
    public double get_horas(){
        return horas;
    }

    public void CalcularSalario(){
        salario = horas * valor_hora;
    }
}

