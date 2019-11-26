package uoc.ded.practica;
import uoc.ei.tads.Lista;

public class Level {
private String idLevel;
private String idGame;
private String name;
private int hardness;
private int nLevelScreens;
private Screen[] screens;

public Level(String idLevel,String idGame, String name, int hardness, int nLevelScreens) {
	this.set(idLevel,idGame,name,hardness,nLevelScreens);
	
}
public void set(String idLevel,String idGame, String name, int hardness, int nLevelScreens){
	this.idLevel=idLevel;
	this.idGame=idGame;
	this.name=name;
	this.hardness=hardness;
	this.nLevelScreens=nLevelScreens;
	screens = new Screen[nLevelScreens];
}
}
