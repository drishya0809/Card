/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        String[] suits ={"Hearts", "Diamonds","Clubs","Spades"};
        Random rand =new Random();
        
        for (int i=0; i<magicHand.length; i++){
            int value =rand.nextInt(13) +1;
            String suit =suits[rand.nextInt(4)];
            magicHand[i] = new Card(value, suit);
            
        }
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pick a suit (Hearts, Diamonds, Clubs, Spades):");
        String userSuit =scanner.next();
        
        System.out.println("Pick a value (1-13):");
        int userValue = scanner.nextInt();
        
        
            Card userCard = new Card(userValue, userSuit);
            
            boolean found =false;
            for (Card card :magicHand) {
                if (card.equals(userCard)) {
                    found =true;
                    break;
                
            }
            }
            if (found) {
                System.out.println("Your card is in the magic hand!");
                
            }
            else{
                System.out.println("Your card is NOT in the magic hand .");
                
            }
            
            Card luckyCard = new Card(2,"clubs");
            
            found =false;
            for (Card card :magicHand){
                if (card.equals(luckyCard)) {
                    found =true;
                    break;
                }
            }
        
  if (found){
      System.out.println("Congratulations! The lucky card is in the magic hand.");
      
  }
  else {
      System.out.println("Sorry, the lucky card is not in the magic hand.");
  }
    }
    
}
