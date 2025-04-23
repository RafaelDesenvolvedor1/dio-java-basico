
package exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        
        g1.setEmail("thago@gmail.com");
        g1.setNome("Thiago Alves");
        g1.setSenha("vaicorintia");
        
        System.out.println(g1.toString());
        g1.gerarRelatorioFinanceiro();
        
        Vendedor v1 = new Vendedor();
        
        v1.setNome("Rafael");
        v1.setEmail("rafa@gmail.com");
        v1.setSenha("pastel43");
        
        System.out.println(v1.toString());
        v1.realizarVenda();
        System.out.println(v1.getQtdVendas());
        
        Atendente a1 = new Atendente();
        
        a1.setNome("Geraldo");
        a1.setEmail("gered@gmail.com");
        a1.setSenha("most345");
        
        System.out.println(a1.toString());
        
        a1.receberPagamento(23.50);
        a1.receberPagamento(6);
        System.out.println(a1.getValorCaixa());
        a1.fecharCaixa();
    }
}
