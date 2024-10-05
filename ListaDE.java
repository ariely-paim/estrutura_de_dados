import java.util.Scanner;

public class ListaDE {
    Scanner scanner = new Scanner(System.in);
    NoConsumidor inicioC;
    NoConsumidor fimC;
    int contadorC;


    public ListaDE(){
        this.inicioC = null;
        this.fimC = null;
        this.contadorC = 1;
    }

    public void AdicionarConsumidor(){
        
        String cpf;
        String nome;

        System.out.println("Digite seu nome:");
        nome=scanner.nextLine();
        System.out.println("Digite seu CPF: ");
        cpf=scanner.nextLine();


        NoConsumidor novoConsumidor = new NoConsumidor();
        if (inicioC==null) {
            inicioC= fimC = novoConsumidor;
            inicioC.No(nome, cpf, contadorC);        
        } else {
            fimC.prox=novoConsumidor;
            novoConsumidor.ant=fimC;
            fimC=novoConsumidor;
            novoConsumidor.No(nome, cpf, contadorC);
        }

        System.out.println("\nCADASTRO REALIZADO!!!");
        System.out.println("    Nome: " + nome + "    CPF: "+ cpf + "   Num. de Registro: " +contadorC);

        contadorC++;

    }

    void ProcurarConsumidor(){
        NoConsumidor consumidor = new NoConsumidor();
        consumidor=inicioC;

        while (consumidor!=null) {
            System.out.println(consumidor.numRegistro + ". "+consumidor.nome);
            consumidor=consumidor.prox;
        }
        System.out.println("Selecione o Consumidor:");
    }

    NoConsumidor SelecionarConsumidor(int opcao){
        boolean verificacao=false;
        NoConsumidor consumidor = new NoConsumidor();
        consumidor=inicioC;

        while (consumidor!=null) {
            if (opcao==consumidor.numRegistro) {
                verificacao=true;
                break;
            }
            consumidor=consumidor.prox;        
        }

        if (!verificacao) {
            System.out.println("Vendedor Nao encontrado, tente novamente");
            return null;
        }
        
        return consumidor;


    }
//----------------------------------------------------------------- AREA DO VENDEDOR -----------------------------------------------------------------------
    NoVendedor inicioV;
    NoVendedor fimV;
    int contadorV=1;

    public void AdicionarVendedor(){
        
        String cpf;
        String nome;

        System.out.println("Digite seu nome:");
        nome=scanner.nextLine();
        System.out.println("Digite seu CPF: ");
        cpf=scanner.nextLine();


        NoVendedor novoVendedor = new NoVendedor();
        if (inicioV==null) {
            inicioV= fimV = novoVendedor;
            inicioV.No(nome, cpf, contadorV);        
        } else {
            fimV.prox=novoVendedor;
            novoVendedor.ant=fimV;
            fimV=novoVendedor;
            novoVendedor.No(nome, cpf, contadorV);
        }

        System.out.println("\nCADASTRO REALIZADO!!!");
        System.out.println("    Nome: " + nome + "    CPF: "+ cpf + "   Num. de Registro: " +contadorV);

        contadorV++;

    }
    
    
    void ProcurarVendedor(){
        NoVendedor vendedor = new NoVendedor();
        vendedor=inicioV;

        while (vendedor!=null) {
            System.out.println(vendedor.numRegistro + ". "+vendedor.nome);
            vendedor=vendedor.prox;
        }
        
    }


    
    NoVendedor SelecionarVendedor(int opcao){
        boolean verificacao=false;
        NoVendedor vendedor = new NoVendedor();
        vendedor=inicioV;

        while (vendedor!=null) {
            if (opcao==vendedor.numRegistro) {
                verificacao=true;
                break;
            }
            vendedor=vendedor.prox;        
        }

        if (!verificacao) {
            System.out.println("Vendedor Nao encontrado, tente novamente");
            return null;
        }
        
        return vendedor;
    }

    void ProcurarProdutos(){
        NoVendedor vendedor = new NoVendedor();
        vendedor=inicioV;

        while (vendedor!=null) {
            vendedor.Produtos.MostrarProduto();
            vendedor=vendedor.prox;
        }
        
        
    }
}    
