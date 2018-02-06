package cards;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import se.lth.cs.pt.window.SimpleWindow;

public class CardWindow extends SimpleWindow {
	private static int imgHeight = 100;
	private static int imgWidth = 75;
	Card[][] cards;  // innehåller ritade kort så att de kan retuneras vid klick
	private int rows;
	private int cols;


	/** Skapar ett fönster med rows rader och cols koloner
	    som kan visa spelkort. Fönstret har titeln title.*/
	public CardWindow(int rows, int cols, String title) {
		super(cols * imgWidth, rows * imgHeight, title);
		this.rows = rows;
		this.cols = cols;
		cards = new Card[rows][cols];
	}
	
	/** Skapar ett fönster med 4 rader och 13 kolonner 
	     som kan visa spelkort. */
	public CardWindow(String title) {
		this(4, 13, title);
	}

	/** Visar korten i cardList i fönstret. */
	public void drawCards(ArrayList<Card> cardList) {
		clear();
		int r = 0; int c = 0;
		for (Card aCard : cardList) {
				drawCard(aCard, r, c);
				cards[r][c] = aCard;
				c++;
				if (c == cols) {
					c = 0;
					r++;
					if (r == rows) {
						break;  // Inga fler kort får plats i fönstret
					}
				}
		}
	}
	
	/* Hämtar den bild som motsvarar kortet. */
	private Image getImg(Card aCard) {
		String suits = "shdc";
		char c = suits.charAt(aCard.getSuit());
		String fileName = String.format("%s/%02d%c.gif", "cardset-oxymoron", aCard.getRank(), c);
		Image img = null;
		try {
			File pathToFile = new File(fileName);
			img = ImageIO.read(pathToFile);
		} catch (IOException ex) {
			System.err.println("Failed to create image of " + fileName + " for card " + aCard);
			ex.printStackTrace();
		}
		return img;
	}


	/** Ritar kortet aCard på rad r, kolonn c. Rader och 
	    kolonner numreras från 0 och uppåt. */
	public void drawCard(Card aCard, int r, int c) {	
		drawImage(getImg(aCard), r, c);
	}
	
	/* ritar bilden img på rad r, kolonn c. */
	private void drawImage(Image img, int r, int c) {
		int x = c * imgWidth + 1;
		int y = r * imgHeight + 1;
		moveTo(x, y);
		drawImage(img);
	}
	
	/** Returnerar det kort som senast klickats på. */
	public Card getClicked() {
		return cards[getMouseRow()][getMouseCol()];
	}

	/** Tar reda på raden för senaste musklick. */
	public int getMouseRow() {
		return getMouseY() / imgHeight;
	}

	/** Tar reda på kolonnen för senaste musklick. */
	public int getMouseCol() {
		return getMouseX() / imgWidth;
	}
	
	/** Raderar bilden av kortet på rad r, kolonn c. */
	public void erase(int r, int c) {
		cards[r][c] = null;
		Image img = null;
		try {
			File pathToFile = new File("cardset-oxymoron/shade.gif");
			img = ImageIO.read(pathToFile);
		} catch (IOException ex) {
			System.err.println("Failed to create image of " + "cardset-oxymoron/shade.gif");
			ex.printStackTrace();
		}
		drawImage(img, r, c);
	}
	
	/** Raderar bilden av det senast klickade kortet. */
	public Card eraseClicked() {
		Card c = cards[getMouseRow()][getMouseCol()];
		if (c != null) {
			erase(getMouseRow(), getMouseCol());
		}
		return c;
	}
	
	/** Väntar ms millisekunder. */
	public static void delay(int ms) {
		SimpleWindow.delay(ms);
	}

}
