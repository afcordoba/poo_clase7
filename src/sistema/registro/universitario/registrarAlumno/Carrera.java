package sistema.registro.universitario.registrarAlumno;

import java.util.List;

public class Carrera {
	private String nombre;
	private PlanDeCarrera plan;
	private List<Materia> materias;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public PlanDeCarrera getPlan() {
		return plan;
	}
	public void setPlan(PlanDeCarrera plan) {
		this.plan = plan;
	}
	public List<Materia> getMaterias() {
		return materias;
	}
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre + ", plan=" + plan + ", materias=" + materias + "]";
	}
	
	
	
	
}
