public class Mensalista extends Empregado{
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    } 
    
    public Mensalista(String nome, String endereço, double salario, String cargo){
            super (nome,endereço,salario); //Coloco nesse super o que eu herdei da classe pai
            this.cargo = cargo;
            
    public void CalcularSalario(){
//equals função utilizada para comparar texto
        if(cargo.equals("Junior")){
            salario = 2500;
        }
        else if (cargo.equals("Pleno")){
        salario = 3500;
        }
        }
    } 
    
