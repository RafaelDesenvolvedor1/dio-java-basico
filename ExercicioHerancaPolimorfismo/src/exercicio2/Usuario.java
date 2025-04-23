
package exercicio2;


public abstract class Usuario {

    private String nome;
    private String email;
    private String senha;
    protected boolean adm;
    
       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void realizarLogin(){
        System.out.println("Logado");
    }
    
    public void realizarLogout(){
        System.out.println("Deslogou");
    }
    
    public void alterarDados(){
        System.out.println("Alterando dados");
    }
    
    public void alterarSenha(){
        System.out.println("Senha alterada");
    }

    @Override
    public String toString() {
        return "Dados{" + "nome=" + nome + ", email=" + email + ", senha=" + senha + ", adm=" + adm + '}';
    }
    
    
}
