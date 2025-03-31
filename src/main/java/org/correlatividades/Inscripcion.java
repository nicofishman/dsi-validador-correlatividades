package org.correlatividades;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
    private Set<Materia> materias;
    private Alumno alumno;

    public Inscripcion(Alumno alumno, Materia ...materias) {
        this.alumno = alumno;
        this.materias = new HashSet<>();
        this.setMaterias(materias);
    }

    boolean aprobada() {
       return this.materias.stream()
                .allMatch(alumno::puedeCursar);
    }

    public void setMaterias(Materia ...materias) {
        Collections.addAll(this.materias, materias);
    }
}
