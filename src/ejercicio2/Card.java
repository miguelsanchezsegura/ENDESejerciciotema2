package ejercicio2;

public class Card {
	//declaracion de variables
	public String suit;
	public String value;
	//metodo Card, constructor que define una clase carta con dos atributos, tipo o palo y valor	
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	//metodo toString para combinar los datos del constructor y devolver un String
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
