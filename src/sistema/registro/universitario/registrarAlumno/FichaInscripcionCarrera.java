package sistema.registro.universitario.registrarAlumno;

import java.time.LocalDate;

public class FichaInscripcionCarrera {
	private Alumno alumno;
	private Carrera carrera;
	private LocalDate fechaRegistro;
	public FichaInscripcionCarrera(Alumno alumno, Carrera carrera) {
		super();
		this.alumno = alumno;
		this.carrera = carrera;
		this.fechaRegistro = LocalDate.now();
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
	
	
}
