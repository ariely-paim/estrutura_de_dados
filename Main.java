import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ListaDE Lista= new ListaDE();
        NoVendedor vendedor= new NoVendedor();
        NoConsumidor consumidor= new NoConsumidor();
        
        while (true) {
            System.out.println("Escolha uma opcao: ");
            System.out.println("1. Cadastrar Consumidor");
            System.out.println("2. Cadastrar Vendedor");
            System.out.println("3. Anunciar Produto");
            System.out.println("4. Realizar Compra");
            System.out.println("5. Avaliar Compra");
            System.out.println("6. Encerrar Programa");

            
            int opcao = scanner.nextInt();
            scanner.nextLine();


            switch (opcao) {
                case 1:
                    Lista.AdicionarConsumidor();
                    System.out.println("\n\n");

                    continue;

                case 2:
                    Lista.AdicionarVendedor();
                    System.out.println("\n\n");
                    continue;
                
                case 3:
                    System.out.println("LISTA DE VENDEDORES:");
                    Lista.ProcurarVendedor();
                    System.out.println("Selecione o vendedor");
                    opcao=scanner.nextInt();
                    scanner.nextLine();

                    
                    vendedor=Lista.SelecionarVendedor(opcao);
                    
                    
                    if (vendedor==null) {
                        continue;
                    }
                    


                    vendedor.AdicionarProduto();
                    System.out.println("\n\n");
                    continue;

                case 4:
                    System.out.println("LISTA DE CONSUMIDORES:");
                    Lista.ProcurarConsumidor();
                    
                    opcao=scanner.nextInt();
                    scanner.nextLine();
                    
                    consumidor = Lista.SelecionarConsumidor(opcao);

                    System.out.println("LISTA DE PRODUTOS DISPONIVEIS:");
                    Lista.ProcurarProdutos();
                    opcao=scanner.nextInt();
                    scanner.nextLine();
                    vendedor= Lista.SelecionarVendedor(opcao);

                    
                    consumidor.FazerCompra(vendedor.SelecionarProduto());
                    System.out.println("Compra realizada com sucesso.");
                    continue;

                case 5:
                Lista.ProcurarConsumidor();
                    
                opcao=scanner.nextInt();
                scanner.nextLine();
                
                consumidor = Lista.SelecionarConsumidor(opcao);
                consumidor.Compras.AvaliarCompras();
                
                    continue;
                case 6:

                    break;
            
                default:
                    System.out.println("Opcao invalida, tente novamente \n");
                    continue;
            }
            
            break;
        }


        scanner.close();
    }
}