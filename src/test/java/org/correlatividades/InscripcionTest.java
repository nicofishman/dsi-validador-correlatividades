package org.correlatividades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class InscripcionTest {
    @Test
    public void testInscripcionAprobada() {
        Materia analisis = new Materia("Analisis");
        Materia algebra = new Materia("Algebra");
        Materia analisis2 = new Materia("Análisis 2", analisis, algebra);
        Alumno alumno = new Alumno("12345", analisis, algebra);
        Inscripcion inscripcion = new Inscripcion(alumno, analisis2);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testInscripcionNoAprobada() {
        Materia analisis = new Materia("Analisis");
        Materia algebra = new Materia("Algebra");
        Materia analisis2 = new Materia("Análisis 2", analisis, algebra);
        Alumno alumno = new Alumno("12345", analisis);
        Inscripcion inscripcion = new Inscripcion(alumno, analisis2);

        Assertions.assertFalse(inscripcion.aprobada());
    }

    @Test
    public void testInscripcionVacia() {
        Materia analisis = new Materia("Analisis");
        Materia algebra = new Materia("Algebra");
        Alumno alumno = new Alumno("12345", analisis, algebra);
        Inscripcion inscripcion = new Inscripcion(alumno);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testInscripcionVariasMaterias() {
        Materia analisis = new Materia("Analisis");
        Materia algebra = new Materia("Algebra");
        Materia analisis2 = new Materia("Análisis 2", analisis, algebra);

        Materia fisica = new Materia("Fisica");
        Materia fisica2 = new Materia("Fisica 2", fisica);

        Alumno alumno = new Alumno("12345", analisis, algebra, fisica);
        Inscripcion inscripcion = new Inscripcion(alumno, analisis2, fisica2);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testInscripcionRechazadaVariasMaterias() {
        Materia analisis = new Materia("Analisis");
        Materia algebra = new Materia("Algebra");
        Materia analisis2 = new Materia("Análisis 2", analisis, algebra);

        Materia fisica = new Materia("Fisica");
        Materia fisica2 = new Materia("Fisica 2", fisica);

        Alumno alumno = new Alumno("12345", analisis, algebra);
        Inscripcion inscripcion = new Inscripcion(alumno, analisis2, fisica2);

        Assertions.assertFalse(inscripcion.aprobada());
    }
}