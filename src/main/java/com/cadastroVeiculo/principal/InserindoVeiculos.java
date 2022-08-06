package com.cadastroVeiculo.principal;

import com.cadastroVeiculo.dao.JPAUtil;
import com.cadastroVeiculo.model.Proprietario;
import com.cadastroVeiculo.model.TipoCombustivel;
import com.cadastroVeiculo.model.Veiculo;
import org.hibernate.hql.internal.classic.ParserHelper;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class InserindoVeiculos {
    public static void main(String[] args) throws IOException {
        EntityManager manager= JPAUtil.getEntityManager();
        EntityTransaction tx= manager.getTransaction();

        //quando o JPA faz alguma operação que não é uma simples leitura do BD ele precisa de uma transação
        tx.begin();//inicia uma transação com o BD

        StringBuilder especificacoes=new StringBuilder();
        especificacoes.append("Carro em excelente estado.\n");
        especificacoes.append("Completo, menos ar.\n");
        especificacoes.append("Primeiro dono, com manual de instrução ");
        especificacoes.append("e todas as revisões feitas.\n");
        especificacoes.append("IPVA pago, aceita financiamento.");

        //lê bytes do arquivo de imagem
      //  Path path = FileSystems.getDefault().getPath("/caminho/da/imagem/ix35.jpg");
        //byte[] foto= Files.readAllBytes(path);

        Proprietario proprietario=new Proprietario("Jose alfredo","11 5656-8989","jose@gmail.com");

        //persistir objetos(inserir registros no Bancod e dados)
        Veiculo veiculo= new Veiculo("Honda","Civic",2012,2013,90000.00, TipoCombustivel.ALCOOL, new Date(),LocalDate.now(),especificacoes.toString(),proprietario);
        Veiculo veiculo1= new Veiculo("Corsa ","Sedan",2022,2022,110000.00,TipoCombustivel.DIESEL, new Date(),LocalDate.now(),especificacoes.toString(),proprietario);
        Veiculo veiculo2= new Veiculo("VW","Gol",2019,2019,70000.00,TipoCombustivel.GASOLINA, new Date(),LocalDate.now(),especificacoes.toString(),proprietario);

       manager.persist(veiculo);
        manager.persist(veiculo1);
        manager.persist(veiculo2);

        tx.commit();


        manager.close();
        JPAUtil.close();

    }
}
