package sistema.registro.universitario.registrarAlumno;

public class Alumno extends Ciudadano {
	private int numeroAlumno;
	private int legajo;
	
	
	
	
	@Override
	public String toString() {
		return "Alumno [numeroAlumno=" + numeroAlumno + ", legajo=" + legajo + "]";
	}
	public int getNumeroAlumno() {
		return numeroAlumno;
	}
	public void setNumeroAlumno(int numeroAlumno) {
		this.numeroAlumno = numeroAlumno;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
}
