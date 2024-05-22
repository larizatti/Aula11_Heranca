public class FolhaPGTO {
    public static void main(String[] args) {
    Mensalista men1, men2;
    Horista hora1, hora2;

    //Empregado Mensalista

    men1 = new Mensalista ("Jose", "Rua abc", "Junior");
    men1.CalcularSalario();
    men1.CalcularINSS();
    System.out.println("Nome: " + men1.getNome());
    System.out.println("EndereçoNome: " + men1.getEndereço());
    System.out.println("Salario: " + men1.getSalario());

    men2 = new Mensalista ("Ana", "Rua sem fim", "Senior");
    men2.CalcularSalario();
    men2.CalcularINSS();
    System.out.println("Nome: " + men2.getNome());
    System.out.println("EndereçoNome: " + men2.getEndereço());
    System.out.println("Salario: " + men2.getSalario());

    //Empregado Horista

    hora1 = new Horista("Carlos", "Rua xyz", 20);
    hora1.CalcularSalario();
    System.out.println("Nome " + hora1.getNome());
    System.out.println("EndereçoNome: " + hora1.getEndereço());
    System.out.println("Salario: " + hora1.getSalario());
    
    hora2 = new Horista ("Cristina", "Rua do centro",100);
    hora2.CalcularSalario();
    System.out.println("Nome" + hora2.getNome());
    System.out.println("EndereçoNome: " + hora2.getEndereço());
    System.out.println("Salario: " + hora2.getSalario());


    }
    
    }
