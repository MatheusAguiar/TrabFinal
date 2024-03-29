package DAO;

import dados.entidade.Exemplar;
import javax.persistence.EntityManager;
import UTIL.JPAUtil;
import dados.entidade.Livro;
import java.util.List;
import javax.persistence.TypedQuery;

public class ExemplarDAO {

    /**
     * Salvar o exemplar no BD
     */
    public void salvar(Exemplar exemplar) {

        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();

        //Iniciar a transação
        gerenciador.getTransaction().begin();

        //Mandar persistir o exemplar
        gerenciador.persist(exemplar);

        //Commit
        gerenciador.getTransaction().commit();

    }

    public List<Exemplar> listar() {

        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();

        //Criando a consulta ao BD
        TypedQuery consulta = gerenciador.createQuery(
                "Select exemplar from Exemplar exemplar", Exemplar.class);

        //Retornar a lista de exemplares
        return consulta.getResultList();

    }
    
    
     public List<Exemplar> buscarPorTitulo(String n) {

        EntityManager gerenciador = JPAUtil.getGerenciador();

        TypedQuery<Exemplar> consulta = gerenciador.createQuery(
                "select ex from Exemplar ex inner join Livro livro on livro.id = ex.livro AND titulo like :titulo", Exemplar.class);

        consulta.setParameter("titulo", "%" + n + "%");

        return consulta.getResultList();

    }

}
