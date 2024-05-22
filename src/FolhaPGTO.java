public class FolhaPGTO {
    public static void main(String[] args) {
    Mensalista men1, men2;
    Horista hora1, hora2;

    //Empregado Mensalista

    men1 = new Mensalista ("Jose", "Rua abc", "Junior");
    men1.CalcularSalario();
    men1.CalcularINSS();
    men1.CalcularINSS()
    men1.imprimir();

    men2 = new Mensalista ("Ana", "Rua sem fim", "Senior");
    men2.CalcularSalario();
    men2.CalcularINSS();
    men2.CalcularIRPF();
    men2.imprimir();

    //Empregado Horista

    hora1 = new Horista("Carlos", "Rua xyz", 100,50);
    hora1.CalcularSalario();
    hora1.imprimir();

    hora2 = new Horista ("Cristina", "Rua do centro",100, 50);
    hora2.CalcularSalario();
    hora2.imprimir();



    }

    }
