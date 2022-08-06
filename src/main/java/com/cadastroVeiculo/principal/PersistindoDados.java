package com.cadastroVeiculo.principal;

import com.cadastroVeiculo.dao.JPAUtil;
import com.cadastroVeiculo.model.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersistindoDados {
    public static void main(String[] args) {
        EntityManager manager= JPAUtil.getEntityManager();
        EntityTransaction tx= manager.getTransaction();
        tx.begin();

        Veiculo veiculo= new Veiculo("Fiat","Fiorino",2015,2015,50000.00);

        manager.persist(veiculo);
        tx.commit();
        manager.close();
        JPAUtil.close();


    }
}
