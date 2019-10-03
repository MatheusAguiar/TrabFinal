package dados.entidade;

import java.util.Date;

public class Emprestimo {
    
    private Integer id;
    private String dataretirada;
    private String dataDevolucao;
    private String observacao;
    private Funcionario funcionario;
    private Exemplar exemplar;
    private Usuario usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
   
    
    public String getDataretirada() {
        return dataretirada;
    }

    public void setDataretirada(String dataretirada) {
        this.dataretirada = dataretirada;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }


    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    public void finalizarEmprestimo(Livro livro, Usuario usuario){}
    
    public void cadastraEmprestimo (Livro livro, Usuario usuario){}
    
  
}

