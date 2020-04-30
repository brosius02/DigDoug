package com.gamelibGDX.DigDoug.desktop;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gamelibGDX.DigDoug.DigDoug;

import javax.swing.*;

public class DesktopLauncher {
	public static void main (String[] arg) {

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 600;
		config.height = 750;
		int selection;
		boolean isYes;
		selection = JOptionPane.showConfirmDialog(null, "Would you like to play DigDug?");
		isYes = (selection == JOptionPane.YES_OPTION);
		if(isYes == true){
			new LwjglApplication((ApplicationListener) new DigDoug(), config);
		}
		else if(!isYes){
			JOptionPane.showConfirmDialog(null, "Coward");
		}
	}
}
