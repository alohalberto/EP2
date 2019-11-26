package uoc.ded.practica;

import uoc.ded.practica.tad.VectorOrdenado;

public class Screen {
	private String idGame;
	private String idLevel;
	private int idScreen;
	private int points;
	private VectorOrdenado[] topUsersForScreen;

	public Screen(String idGame, String idLevel, int idScreen, int points) {
		set(idGame, idLevel, idScreen, points);
	}

	public void set(String idGame, String idLevel, int idScreen, int points) {
		this.idGame = idGame;
		this.idLevel = idLevel;
		this.idScreen = idScreen;
		this.points = points;
		this.topUsersForScreen = new VectorOrdenado[10];
	}
}
