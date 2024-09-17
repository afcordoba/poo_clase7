package sistema.registro.universitario.registrarAlumno;

import java.time.LocalDate;

public class PlanDeCarrera {
	public PlanDeCarrera(String descripcion, boolean esVigente, LocalDate anio) {
		super();
		this.descripcion = descripcion;
		this.esVigente = esVigente;
		this.anio = anio;
	}
	private String descripcion;
	private boolean esVigente;
	private LocalDate anio;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEsVigente() {
		return esVigente;
	}
	public void setEsVigente(boolean esVigente) {
		this.esVigente = esVigente;
	}
	public LocalDate getAnio() {
		return anio;
	}
	public void setAnio(LocalDate anio) {
		this.anio = anio;
	}

	
}
