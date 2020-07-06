package logic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	public static void main (String[] args) {
		IntegerMethods m = new IntegerMethods();
		Logger.getGlobal().log(Level.INFO,m.convertString(5));
		Logger.getGlobal().log(Level.INFO,m.convertString(m.getMax(10,20)));
	}
}
