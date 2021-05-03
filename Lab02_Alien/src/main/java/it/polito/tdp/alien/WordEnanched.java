package it.polito.tdp.alien;

import java.util.*;

public class WordEnanched {
	private String alienWord;
	//private String translation;
	private List <String> translation;
	public WordEnanched(String alienWord, String translation) {
		//super();
		this.alienWord = alienWord;
		this.translation = new ArrayList<String>();
		this.translation.add(translation);
	}
	public WordEnanched(String alienWord) {
		//super();
		this.alienWord = alienWord;
		this.translation = new ArrayList<String> ();
	}
	public String getAlienWord() {
		return alienWord;
	}
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	public String getTranslation() {
		String output="";
		
		for(String s : translation) {
			output+=s+"\n";
		}
		return output;
	}
	public void setTranslation(String translation) {
	if(!this.translation.contains(translation))
		this.translation.add(translation);
	}
	/*public List<String> getTraduzioni(){
		return this.traduzioni;
	}
	public void aggiungiTraduzione(String traduzione) {
		this.traduzioni.add(traduzione);
	}*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordEnanched other = (WordEnanched) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "WordEnanched [alienWord=" + alienWord + ", translation=" + translation + "]";
	}
	
	
	
	
}

