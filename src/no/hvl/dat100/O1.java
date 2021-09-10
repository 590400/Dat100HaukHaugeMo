package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import java.text.DecimalFormat;

public class O1 {

	public static void main(String[] args) {

		int input;

		input = Integer.parseInt(showInputDialog("Legg inn din bruttoinntekt for å få regnet ut trinnskatt:"));

		DecimalFormat Vformat = new DecimalFormat("#.000");

		if (input > 1021550) {
			showMessageDialog(null, "din trinnskatt er: " + Vformat.format(input * 0.162) + "kr");
		} else if (input > 651250) {
			showMessageDialog(null, "din trinnskatt er: " + Vformat.format(input * 0.132) + "kr");

		} else if (input > 260100) {
			showMessageDialog(null, "din trinnskatt er: " + Vformat.format(input * 0.04) + "kr");

		} else if (input > 184800) {
			showMessageDialog(null, "din trinnskatt er: " + Vformat.format(input * 0.017) + "kr");

		} else if (input > 0) {
			showMessageDialog(null, "din trinnskatt er: " + input * 0 + "kr");

		} else if (input <= 0) {
			showMessageDialog(null, "Rip dude :(");

		}

	}

}
