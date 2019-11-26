package uoc.ded.practica;

import uoc.ded.practica.exception.GameAlreadyExistsException;
import uoc.ded.practica.exception.GameNotFoundException;
import uoc.ded.practica.exception.LevelAlreadyExistsException;
import uoc.ded.practica.exception.LevelNotFoundException;
import uoc.ded.practica.exception.NoEnoughPointsException;
import uoc.ded.practica.exception.ScreenNotFoundException;
import uoc.ded.practica.tad.ListaEncadenada;
import uoc.ei.tads.Iterador;

public class Play4FunImpl implements Play4Fun {
	private ListaEncadenada<User> userList;
	private VectorOrdenado<Game> gameVector;

	@Override
	public void addUser(String idUser, String name, String surname) {		
		User user=new User(idUser, name, surname);
		userList.insertarAlFinal(user);
	}

	@Override
	public void addGame(String idGame, String description) throws GameAlreadyExistsException {
		Game game=new Game(idGame, description);
		gameVector = new VectorOrdenado<Game>();
		
	}

	@Override
	public void addLevel(String idLevel, String idGame, String name, int hardness, int nLevelScreens) throws LevelAlreadyExistsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addScreen(String idGame, String idLevel, int idScreen, int points) throws LevelFullException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGame(String idUser, String idGame) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nextScreen(String idUser, String idGame, String idLevel, int levelScreenId, int points)
			throws NoEnoughPointsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterador<Move> topUsersForScreen(String idGame, String idLevel, int levelScreenID)
			throws GameNotFoundException, LevelNotFoundException, ScreenNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterador<Game> topGames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numUsers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numGames() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numLevels(String idGame) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numScreens(String idGame, String idLevel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getUser(String idUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
