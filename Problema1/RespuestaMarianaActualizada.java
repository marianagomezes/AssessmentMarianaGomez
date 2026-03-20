package s;

import java.util.Scanner;

public class Problema1 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingresa tu contraseña: ");
		String text = input.nextLine();
	
		System.out.print("Ingresa el shift: ");
		int shift = input.nextInt();
		String result = "";
		
		System.out.print("Contraseña original: ");
		System.out.println(text + "\n");
		
		//paso 1 y 2
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
		
		
			
			//letras mayusculas
			if(letter >= 'A' && letter <= 'Z') {
				int newLetter = letter + shift;
				
				while(newLetter > 'Z'){
					newLetter = newLetter - 26;	
				}
				result = result + (char)newLetter;
				//numeros
			} else if(letter >= '0' && letter <= '9') {
				int num = letter - '0';
				int comp = 9 - num;
				result = result + comp;
				//otros
			} else {
				result = result + letter;
			}
		} System.out.println("Después de paso 1 y 2: " + result + "\n");

		//paso 4
		String temp = "";
		for(int i = 0; i < result.length(); i++){
			char letter = result.charAt(i);
			
			if(i % 2 == 0) {
				temp = temp + Character.toUpperCase(letter);
			} else {
				temp = temp + Character.toLowerCase(letter);
			}
		} System.out.println("Después de paso 4: " + temp + "\n");
		
		//paso 5
		String finalResult = "";
		
		for(int i = temp.length() - 1; i >= 0; i--) {
			finalResult = finalResult + temp.charAt(i);
		}
		
		System.out.print("Contraseña final: ");
		System.out.println(finalResult);
		
		input.close();
		
		}
	}


