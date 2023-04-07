package CRUD_LAB.entity;

import CRUD_LAB.entity.Curso;
import CRUD_LAB.entity.Estudiantes;
import CRUD_LAB.entity.MatriculaPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-05T21:09:40")
@StaticMetamodel(Matricula.class)
public class Matricula_ { 

    public static volatile SingularAttribute<Matricula, MatriculaPK> matriculaPK;
    public static volatile SingularAttribute<Matricula, Date> matFecha;
    public static volatile SingularAttribute<Matricula, Curso> curso;
    public static volatile SingularAttribute<Matricula, Integer> matPrecio;
    public static volatile SingularAttribute<Matricula, Estudiantes> estudiantes;

}