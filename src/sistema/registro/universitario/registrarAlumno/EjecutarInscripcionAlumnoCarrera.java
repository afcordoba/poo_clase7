package sistema.registro.universitario.registrarAlumno;

import java.time.LocalDate;

public class EjecutarInscripcionAlumnoCarrera {
	private static Alumno alumno1;
	private static Alumno alumno2;
	private static GestorInscripcionCarrera gestorInscripcionCarrera;

	public static void main(String[] args) {
		crearAlumnosDePrueba();
		Carrera carrera = crearCarrera();
		gestorInscripcionCarrera = new GestorInscripcionCarrera();
		if(gestorInscripcionCarrera.registrarAlumnoCarrera(alumno1, carrera)) {
			gestorInscripcionCarrera.imprimirFichaCreada();
		}
		
		if(gestorInscripcionCarrera.registrarAlumnoCarrera(alumno2, carrera)) {
			gestorInscripcionCarrera.imprimirFichaCreada();
		}

	}

	private static Carrera crearCarrera() {
		Carrera carrera = new Carrera(); 
		carrera.setNombre("Ing. Sistemas");
		carrera.setPlan(crearPlanDeCarrera());
		return carrera;
	}

	private static PlanDeCarrera crearPlanDeCarrera() {
	 return new PlanDeCarrera("descripcion",true,LocalDate.now());
	}

	private static void crearAlumnosDePrueba() {
		alumno1 = new Alumno();
		alumno1.setNombre("Alejandro");
		alumno1.setApellido("Cordoba");
		alumno1.setDni(27352756);
		alumno1.setPaisOrigen("Brasil");
		alumno1.setPasaporte(new Pasaporte(1234,true,LocalDate.now().plusYears(10)));
		alumno1.setDireccion(new Direccion("Antunes Novo", "Campinas", "San Pablo", "Brasil"));
		
		alumno2 = new Alumno();
		alumno2.setNombre("Ignacio");
		alumno2.setApellido("Baldi");
		alumno2.setDni(27352756);
		alumno2.setPaisOrigen("Italia");
		alumno2.setPasaporte(new Pasaporte(1234,false,LocalDate.now().plusYears(10)));
		alumno2.setDireccion(new Direccion("Callari", "Modena", "Emiglia Romana", "Italia"));
		
	}

}
