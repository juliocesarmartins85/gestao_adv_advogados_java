package ENTIDADES;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Telefone.class)
public abstract class Telefone_ {

	public static volatile SingularAttribute<Telefone, String> tipo;
	public static volatile SingularAttribute<Telefone, Integer> numero;
	public static volatile SingularAttribute<Telefone, Integer> ddd;
	public static volatile SingularAttribute<Telefone, Pessoa> telefonepessoa;
	public static volatile SingularAttribute<Telefone, Integer> id;

}

