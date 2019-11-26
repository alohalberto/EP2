package uoc.ded.practica;

import java.util.Comparator;

import uoc.ei.tads.ListaEncadenada;

public class Game {
	private String idGame;
	private String description;
	private ListaEncadenada<Level> levelList;

	public Game(String idGame, String description) {
		this.set(idGame, description);
	}

	public void set(String idGame, String description) {
		this.idGame = idGame;
		this.description = description;
		this.levelList = new ListaEncadenada<Level>();
	}

}
