package games;

import java.util.Scanner;

import main.Wallet;

public class BlackJack {

public static void blackJackGame() {
	Scanner input = new Scanner(System.in);
	int drawCard = 0;
	int points = 0;
	int numCount = 0;
	int totalPoints = 0;
	int hit = 0;
	int drawComp = 0;
	int compTotal = 0;
	int compPoints = 0;
	int whoWins = 0;
	int bet = 0;
	int winnings = 0;
	int endMoney = 0;
	int exceeding = 0;
	winnings = bet * 2;
	System.out.println("Please enter a bet >> ");
	bet = input.nextInt();
	if (bet > Wallet.moneyAmount(bet, winnings)) {
		System.out.println("Insufficient funds.");
		}
	String cardName = null;
	
	while(whoWins == 0) {
	System.out.println("\nInitial draw:\n");
	for (int count = 0; count < 2; count++) {
	drawCard = (int)(Math.random() * 13 + 1);
	switch (drawCard) {
	case 1:
		cardName = "Ace";
		points = 11;
		numCount = numCount + 11;
		break;
	case 2:
		cardName = "Two";
		points = 2;
		numCount = numCount + 2;
		break;
	case 3:
		cardName = "Three";
		points = 3;
		numCount = numCount + 3;
		break;
	case 4: 
		cardName = "Four";
		points = 4;
		numCount = numCount + 4;
		break;
	case 5:
		cardName = "Five";
		points = 5;
		numCount = numCount + 5;
		break;
	case 6: 
		cardName = "Six";
		points = 6;
		numCount = numCount + 6;
		break;
	case 7:
		cardName = "Seven";
		points = 7;
		numCount = numCount + 7;
		break;
	case 8:
		cardName = "Eight";
		points = 8;
		numCount = numCount + 8;
		break;
	case 9:
		cardName = "Nine";
		points = 9;
		numCount = numCount + 9;
		break;
	case 10:
		cardName = "Ten";
		points = 10;
		numCount = numCount + 10;
		break;
	case 11:
		cardName = "Jack";
		points = 10;
		numCount = numCount + 10;
		break;
	case 12:
		cardName = "Queen";
		points = 10;
		numCount = numCount + 10;
		break;
	case 13:
		cardName = "King";
		points = 10;
		numCount = numCount + 10;
		break;
	default:
		points = 1000;
		break;
	}
	System.out.println(numCount + " " + cardName);
	}
	totalPoints = numCount;
	if(totalPoints == 21) {
		System.out.println("You have a blackjack");
	}
	while(totalPoints != 21 && exceeding < 1) {
	
	System.out.println("Do you want another card (1) Yes (2) No");
	hit = input.nextInt();
	exceeding = (exceeding + 1);
	if(hit == 1) {
	drawCard = (int)(Math.random() * 13 + 1);
	switch (drawCard) {
	case 1:
		cardName = "Ace";
		points = 11;
		numCount = numCount + 11;
		break;
	case 2:
		cardName = "Two";
		points = 2;
		numCount = numCount + 2;
		break;
	case 3:
		cardName = "Three";
		points = 3;
		numCount = numCount + 3;
		break;
	case 4: 
		cardName = "Four";
		points = 4;
		numCount = numCount + 4;
		break;
	case 5:
		cardName = "Five";
		points = 5;
		numCount = numCount + 5;
		break;
	case 6: 
		cardName = "Six";
		points = 6;
		numCount = numCount + 6;
		break;
	case 7:
		cardName = "Seven";
		points = 7;
		numCount = numCount + 7;
		break;
	case 8:
		cardName = "Eight";
		points = 8;
		numCount = numCount + 8;
		break;
	case 9:
		cardName = "Nine";
		points = 9;
		numCount = numCount + 9;
		break;
	case 10:
		cardName = "Ten";
		points = 10;
		numCount = numCount + 10;
		break;
	case 11:
		cardName = "Jack";
		points = 10;
		numCount = numCount + 10;
		break;
	case 12:
		cardName = "Queen";
		points = 10;
		numCount = numCount + 10;
		break;
	case 13:
		cardName = "King";
		points = 10;
		numCount = numCount + 10;
		break;
	default:
		points = 1000;
		break;
		}
	}
	
	totalPoints = numCount;
	if(hit == 1) {
		System.out.println(numCount + " " + cardName);
	}
	if(totalPoints > 21) {
		System.out.println("You Lose!");
		whoWins = 2;
	}
	if (whoWins != 2) {
	System.out.println("\nDealer draw:\n");
	while(compPoints < totalPoints) {
	drawComp = (int)(Math.random() * 13 + 1);
	switch (drawComp) {
	case 1:
		cardName = "Ace";
		compPoints = 11;
		compTotal = compTotal + 11;
		break;
	case 2:
		cardName = "Two";
		compPoints = 2;
		compTotal = compTotal + 2;
		break;
	case 3:
		cardName = "Three";
		compPoints = 3;
		compTotal = compTotal + 3;
		break;
	case 4: 
		cardName = "Four";
		compPoints = 4;
		compTotal = compTotal + 4;
		break;
	case 5:
		cardName = "Five";
		compPoints = 5;
		compTotal = compTotal + 5;
		break;
	case 6: 
		cardName = "Six";
		compPoints = 6;
		compTotal = compTotal + 6;
		break;
	case 7:
		cardName = "Seven";
		compPoints = 7;
		compTotal = compTotal + 7;
		break;
	case 8:
		cardName = "Eight";
		compPoints = 8;
		compTotal = compTotal + 8;
		break;
	case 9:
		cardName = "Nine";
		compPoints = 9;
		compTotal = compTotal + 9;
		break;
	case 10:
		cardName = "Ten";
		compPoints = 10;
		compTotal = compTotal + 10;
		break;
	case 11:
		cardName = "Jack";
		compPoints = 10;
		compTotal = compTotal + 10;
		break;
	case 12:
		cardName = "Queen";
		compPoints = 10;
		compTotal = compTotal + 10;
		break;
	case 13:
		cardName = "King";
		compPoints = 10;
		compTotal = compTotal + 10;
		break;
	default:
		compPoints = 1000;
		break;
		}
	}
	System.out.println(compTotal + " " + cardName);
	
	if(compPoints > 21 && totalPoints <= 21) {
		System.out.println("Player wins!");
		whoWins = 1;
	}
	}
	}
	if(compPoints > totalPoints && compPoints <= 21) {
		System.out.println("Dealer wins!");
		whoWins = 2;
	}
	
	if(whoWins == 1 || compPoints > 21) {
		System.out.println("\nYou won " + winnings + " dollars.");
		}
		else if(whoWins != 1 || compPoints == 21) {
			System.out.println("\nYou lost " + bet + " dollars.");
		}
	Wallet.endMoney(bet, winnings, endMoney);
	}
	}
	}






















