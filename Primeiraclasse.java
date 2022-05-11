package Pacote;

/**
 * @author Rute
 */
public class Primeiraclasse {

    public static void main (String [] args) {
        System.out.println("olá");


      oficina oficina = new oficina();
      oficina.setNomedaoficina("oficina do trovão");
      oficina.setNomedomecanico("Rodrigues");
      oficina.setValordoorcamento(500);

      System.out.println(oficina.getNomedaoficina());
      System.out.println(oficina.getNomedomecanico());
      System.out.println(oficina.getValordoorcamento());

      cliente cliente = new cliente();
      cliente.setNome("Miguel");
      cliente.setTelefone(900110110);

      System.out.println(cliente.getNome());
      System.out.println(cliente.getTelefone());

      carro carro = new carro();
      carro.setMarca("fiat");
      carro.setCor("branco");
      carro.setModelo("utilitário");

      System.out.println(carro.getMarca());
      System.out.println(carro.getCor());
      System.out.println(carro.getModelo());

    }
}
