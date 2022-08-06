# mapeamento-jpa-hibernate

## Chaves compostas

Para exemplificar o uso de chaves compostas, incluiremos os atributos cidade
e placa como identificador de Veiculo. O atributo codigo não será mais o
identificador, por isso precisaremos eliminá-lo.

Criaremos uma classe chamada VeiculoId para representar o identificador (a
chave composta) da entidade.

@Embeddable
public class VeiculoId implements Serializable {
private static final long serialVersionUID = 1L;
private String placa;
private String cidade;

Veja que anotamos a classe VeiculoId com @Embeddable, pois ela será sempre
utilizada de forma “embutida” em outra classe.

Na classe Veiculo, criamos um atributo id do tipo VeiculoId e anotamos seu
atributo apenas com @EmbeddedId.
