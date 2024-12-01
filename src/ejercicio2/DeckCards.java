package ejercicio2;
// libreria de java utilizada
import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {
		// crea las variables para el palo y el numero de cada carta
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		ArrayList<Card> deck = new ArrayList<Card>();
		// genera el mazo de cartas
		for (int i = 0; i < suits.length; i++) {
			//un bucle para generar 4 palos y posteriormente otro para generar 13 valores
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
		// baraja el mazo de cartas
		for (int i = 0; i < deck.size(); i++) {
			//un bucle de cartas=al tamaño del mazo genera un numero aleatorio el cual se transfiere a una carta correspondiente sustituyendola en la posicion indicada
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		// genera 5 cartas
		for (int i = 0; i < 5; i++) {
			//imprime por pantalla 5 cartas.
			System.out.println(deck.get(i));
		}

	}

}

