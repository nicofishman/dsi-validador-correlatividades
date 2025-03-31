package org.correlatividades;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Materia {
    private Set<Materia> correlativas;
    private String nombre;

    public Materia(String nombre, Materia ...materias) {
        this.nombre = nombre;
        this.correlativas = new HashSet<>();
        this.setCorrelativas(materias);
    }

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(Materia ...correlativas) {
        Collections.addAll(this.correlativas, correlativas);
    }

    public boolean cumpleCorrelativas(Set<Materia> mats) {
        // Devolver verdadero si el alumno cumple con las correlativas
        return mats.containsAll(this.correlativas);
    }
}
