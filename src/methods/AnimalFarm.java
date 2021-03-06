package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	/*
	 * 1. Ask the user which animal they want, then play the sound of that
	 * animal.
	 */
	

	/* 2. Make it so that the user can keep entering new animals. */
while(true) {
	String Animal=JOptionPane.showInputDialog("Pick your favorite out of these animals. Cow, duck, dog, cat, and a llama.");
	if (Animal.equals("Cow")) {
		playMoo();
	}
	if (Animal.equals("Duck")) {
		playQuack();
	}
	if (Animal.equals("Dog")) {
		playWoof();
	}
	if (Animal.equals("Llama")) {
		playllama();
	}
	if (Animal.equals("Cat")) {
		playmeow();
	}

}

}
void playMoo() {
	playNoise(mooFile);
}

void playQuack() {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}

void playllama() {
	playNoise(llamaFile);
}


void playmeow() {
	playNoise(meowFile);
}

String quackFile = "quack.wav";
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}

