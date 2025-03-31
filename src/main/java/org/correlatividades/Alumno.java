package org.correlatividades;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private String legajo;
    private Set<Materia> materiasAprobadas;

    public Alumno(String legajo, Materia ...materiasAprobadas) {
        this.legajo = legajo;
        this.materiasAprobadas = new HashSet<>();
        this.addMateriasAprobadas(materiasAprobadas);
    }

    boolean puedeCursar(Materia materia) {
        return materia.cumpleCorrelativas(this.materiasAprobadas);
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public void addMateriasAprobadas(Materia ...materiasAprobadas) {
        Collections.addAll(this.materiasAprobadas, materiasAprobadas);
    }
}
