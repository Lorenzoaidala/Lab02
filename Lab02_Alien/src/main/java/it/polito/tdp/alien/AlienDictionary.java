package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {

	List<Word> dizionario = new ArrayList<Word>();
	
	public void addWord(String alienWord, String translation) {
		boolean trovato= false;
		for(Word w : dizionario) {
			if(w.getAlienWord().equals(alienWord)) {
				w.setTranslation(translation);
				trovato=true;
			}
		}
		if(trovato==false) {
			Word parola = new Word(alienWord, translation);
			dizionario.add(parola);
		}
		
	}
	
	public String translateWord(String alienWord) {
		Word parola = new Word(alienWord);
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
