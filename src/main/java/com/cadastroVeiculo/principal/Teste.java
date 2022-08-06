package com.cadastroVeiculo.principal;

import com.cadastroVeiculo.dao.JPAUtil;
import com.cadastroVeiculo.model.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Teste {
    public static void main(String[] args) {

        Persistence.createEntityManagerFactory("veiculo_cadastro_mapa");
       /* EntityManager manager= JPAUtil.getEntityManager();
        EntityTransaction tx= manager.getTransaction();*/

        //quando o JPA faz alguma operação que não é uma simples leitura do BD ele precisa de uma transação
      //  tx.begin();//inicia uma transação com o BD


        //persistir objetos(inserir registros no Bancod e dados)
       // Veiculo veiculo10= new Veiculo("Fiat","Fiorino",2015,2015,50000.00);

        //manager.persist(veiculo10);

        //tx.commit();

        //manager.close();
       // JPAUtil.close();


    }
}
