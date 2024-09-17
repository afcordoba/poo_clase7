package sistema.registro.universitario.registrarAlumno;

import java.time.LocalDate;

public class Pasaporte {
	private int numero;
	private boolean perteneceAMercosur;
	private LocalDate fechaVencimiento;
	
	public Pasaporte(int numero, boolean perteneceAMercosur, LocalDate fechaVencimiento) {
		super();
		this.numero = numero;
		this.perteneceAMercosur = perteneceAMercosur;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isPerteneceAMercosur() {
		return perteneceAMercosur;
	}
	public void setPerteneceAMercosur(boolean perteneceAMercosur) {
		this.perteneceAMercosur = perteneceAMercosur;
	}
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
	
	
}
