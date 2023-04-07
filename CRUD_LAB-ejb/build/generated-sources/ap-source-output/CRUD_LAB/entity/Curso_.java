package CRUD_LAB.entity;

import CRUD_LAB.entity.Matricula;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-05T21:09:40")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Integer> numEstudiantesAdmitidosCurso;
    public static volatile SingularAttribute<Curso, String> codCurso;
    public static volatile SingularAttribute<Curso, Integer> semestreCurso;
    public static volatile SingularAttribute<Curso, String> nombreCurso;
    public static volatile CollectionAttribute<Curso, Matricula> matriculaCollection;
    public static volatile SingularAttribute<Curso, Integer> numCreditosCurso;

}