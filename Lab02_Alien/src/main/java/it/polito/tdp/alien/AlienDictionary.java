package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {

	List<WordEnanched> dizionario = new ArrayList<WordEnanched>();
	
	public void addWord(String alienWord, String translation) {
		boolean trovato= false;
		for(WordEnanched w : dizionario) {
			if(w.getAlienWord().equals(alienWord)) {
				w.setTranslation(translation);
				trovato=true;
			}
		}
		if(trovato==false) {
			WordEnanched parola = new WordEnanched(alienWord, translation);
			parola.setTranslation(translation);
			dizionario.add(parola);
		}
		
	}
	
	public String translateWord(String alienWord) {
		WordEnanched parola = new WordEnanched(alienWord);
		if(dizionario.contains(parola)) {
			return dizionario.get(dizionario.indexOf(parola)).getTranslation();
		}
		else
			return null;
	}
	
	public void doReset() {
		dizionario.clear();
	}
}
