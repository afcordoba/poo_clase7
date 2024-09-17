package sistema.registro.universitario.registrarAlumno;

import java.util.ArrayList;
import java.util.List;

public class GestorInscripcionCarrera {
	
	private static List<FichaInscripcionCarrera> inscripciones;
	
	private boolean registroExitoso;
	
	
	public static void inicializar() {
		inscripciones = new ArrayList<FichaInscripcionCarrera>();
		
	}
	
	public boolean isRegistroExitoso() {
		return registroExitoso;
	}

	public void setRegistroExitoso(boolean registroExitoso) {
		this.registroExitoso = registroExitoso;
	}

	public GestorInscripcionCarrera() {
		this.inicializar();
	}
	
	public boolean registrarAlumnoCarrera(Alumno alumno, Carrera carrera) {
		this.setRegistroExitoso(false);
		if(validarPasaporteMercosur(alumno)) {
			inscripciones.add(crearFicha(alumno,carrera));
			registroExitoso = true;
			System.out.println("Registro exitoso del Alumno:" + alumno.getNombre()+ "," + alumno.getApellido() + "del pais:" + alumno.getPaisOrigen() + ", cumple condicion" );
			
		}else 
			System.out.println("Registro DENEGADO del Alumno:" + alumno.getNombre()+ "," + alumno.getApellido() + "del pais:" + alumno.getPaisOrigen() + ", NO cumple condicion" );
		
		return registroExitoso;
	}
	
	
	public void imprimirFichaCreada() {
		if(!inscripciones.isEmpty()) {
			System.out.println("¡Ficha de Registro creada!");
			inscripciones.forEach(f-> System.out.println(f.getAlumno() +","+ f.getCarrera()+ "fecha:" + f.getFechaRegistro()));
		}
	}

	private FichaInscripcionCarrera crearFicha(Alumno alumno, Carrera carrera) {
		FichaInscripcionCarrera ficha = new FichaInscripcionCarrera(alumno, carrera);
		return ficha;
	}

	private boolean validarPasaporteMercosur(Alumno alumno) {
		return alumno.getPasaporte().isPerteneceAMercosur();
		
	}
}
