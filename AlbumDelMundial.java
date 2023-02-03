import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class AlbumDelMundial implements IAlbumDelMundial {
	
	private Map <Integer, Persona> registrarUsuario;
	private Map<Integer,String> albumDuenio;
	private Map<Integer,Album> albumes;
	
	public AlbumDelMundial() {
		registrarUsuario = new HashMap<Integer, Persona>();
		albumDuenio = new HashMap<Integer,String>();
	}
	
	
	@Override
	public int registrarParticipante(int dni, String nombre, String tipoAlbum) {
		// TODO Auto-generated method stub
		
			if (dni < 1) {
				throw new RuntimeException("El usuario no es valido, tiene que ser mayor a 1 el dni");
			}
			if (nombre == null || nombre.equals("")) {
				throw new RuntimeException("Se debe asignar un nombre a la persona");
			}
			if (estaRegistrado(dni)) {
				throw new RuntimeException("El usuario fue registrado previamente");
			}
			if(tipoAlbum!="album" || tipoAlbum !="albumExtendido" || tipoAlbum !="albumWeb") {
				throw new RuntimeException("El album no es valido");
			}
			registrarUsuario.put(dni, new Persona(dni,nombre));
			albumDuenio.put(dni,tipoAlbum);
		
		return 0;
	}

	private boolean estaRegistrado(int dni) {
		// TODO Auto-generated method stub
		if(registrarUsuario.containsKey(dni)) {
			return true;
		}
		return false;
	}

	@Override
	public void comprarFiguritas(int dni) {
		// TODO Auto-generated method stub

	}

	@Override
	public void comprarFiguritasTop10(int dni) {
		// TODO Auto-generated method stub

	}

	@Override
	public void comprarFiguritasConCodigoPromocional(int dni) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> pegarFiguritas(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean llenoAlbum(int dni) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String aplicarSorteoInstantaneo(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int buscarFiguritaRepetida(int dni) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean intercambiar(int dni, int codFigurita) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean intercambiarUnaFiguritaRepetida(int dni) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String darNombre(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String darPremio(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listadoDeGanadores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> participantesQueCompletaronElPais(String nombrePais) {
		// TODO Auto-generated method stub
		return null;
	}

}
