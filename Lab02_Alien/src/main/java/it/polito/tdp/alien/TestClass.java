package it.polito.tdp.alien;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlienDictionary ad = new AlienDictionary();
		ad.addWord("prolpl", "protocollo");
		System.out.print("la parola prolp in lingua aliena significa "+ad.translateWord("prolpl"));
	}

}
