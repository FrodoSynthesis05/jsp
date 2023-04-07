package CRUD_LAB.entity;

import CRUD_LAB.entity.Matricula;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-05T21:09:40")
@StaticMetamodel(Estudiantes.class)
public class Estudiantes_ { 

    public static volatile SingularAttribute<Estudiantes, String> codEstudiantes;
    public static volatile SingularAttribute<Estudiantes, Integer> semestreEstudiante;
    public static volatile SingularAttribute<Estudiantes, String> apellidoEstudiante;
    public static volatile SingularAttribute<Estudiantes, String> nombreEstudiante;
    public static volatile CollectionAttribute<Estudiantes, Matricula> matriculaCollection;

}