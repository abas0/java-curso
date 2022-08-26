package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.AbaixoMedia;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor?");
		int size = sc.nextInt();
		float num[] = new float [size];
		AbaixoMedia abaixoMedia = new AbaixoMedia();
		for(int i = 0; i < size; i++) {
			System.out.println("Digite um numero: ");
			num[i] = sc.nextInt();
			abaixoMedia = new AbaixoMedia(num[i]);
		}
		float media = abaixoMedia.media(num);
		System.out.println("MEDIA DO VETOR = " + media);
		ArrayList<Float> abaixo = abaixoMedia.elementosAbaixo(num, media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: " + abaixo);
		sc.close();
	}

}
