package com.cadastroVeiculo.principal;

import com.cadastroVeiculo.dao.JPAUtil;
import com.cadastroVeiculo.model.Proprietario;
import com.cadastroVeiculo.model.TipoCombustivel;
import com.cadastroVeiculo.model.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Date;

public class PersistindoDados {
    public static void main(String[] args) throws IOException {
        EntityManager manager= JPAUtil.getEntityManager();
        EntityTransaction tx= manager.getTransaction();
        tx.begin();

        //lê bytes do arquivo de imagem
      // Path path = FileSystems.getDefault().getPath("/caminho/da/imagem/ix35.jpg");
       // byte[] foto= Files.readAllBytes(path);


        Proprietario proprietario=new Proprietario("Jose alfredo","11 5656-8989","jose@gmail.com");



        Veiculo veiculo10= new Veiculo("Fiat","Fiorino",2015,2015,50000.00, TipoCombustivel.GASOLINA, new Date(), LocalDate.now(), "Lorem Ipsum é simplesmente um texto fictício da indústria tipográfica e de impressão. Lorem Ipsum tem sido o texto fictício padrão da indústria desde os anos 1500, quando um impressor desconhecido pegou uma cozinha de tipos e embaralhou-a para fazer um livro de espécimes de tipos. Ele sobreviveu não apenas cinco séculos, mas também o salto para a composição eletrônica, permanecendo essencialmente inalterado. Foi popularizado na década de 1960 com o lançamento de folhas Letraset contendo passagens de Lorem Ipsum e, mais recentemente, com software de editoração eletrônica como Aldus PageMaker, incluindo versões de Lorem Ipsum. ",proprietario);

        manager.persist(veiculo10);

        tx.commit();
        manager.close();
        JPAUtil.close();


    }
}
