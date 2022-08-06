package com.cadastroVeiculo.principal;

import com.cadastroVeiculo.dao.JPAUtil;
import com.cadastroVeiculo.model.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ImprimindoEspecificacoes {
    public static void main(String[] args) {
        EntityManager manager= JPAUtil.getEntityManager();


        Veiculo veiculo = manager.find(Veiculo.class, 5L);
        System.out.println("Veículo: " + veiculo.getModelo());
        System.out.println("-------");
        System.out.println(veiculo.getEspecificacoes());

        manager.close();


        JPAUtil.close();

    }
}
