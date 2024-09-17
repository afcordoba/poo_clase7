package sistema.registro.universitario.registrarAlumno;

public class Direccion {
	private String calle;
	private String ciudad;
	private String provincia;
	private String pais;
	public Direccion(String calle, String ciudad, String provincia, String pais) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", provincia=" + provincia + ", pais=" + pais + "]";
	}
	
	
}
