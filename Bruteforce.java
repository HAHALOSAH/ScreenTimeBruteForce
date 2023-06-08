import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Bruteforce {
	Robot bot;
	public Bruteforce() {
		try {
			bot = new Robot();
		} catch (AWTException e) {

		}
	}
	public void openPasscodeScreen() {
		bot.mouseMove(660, 100);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
	}

	public void closePasscodeScreen() {
		bot.mouseMove(450, 525);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
	}

	public void tryCombo(String combo) {
		openPasscodeScreen();
		sendKeys(bot, combo);
		closePasscodeScreen();
	}

	void sendKeys(Robot robot, String keys) {
		for (char c : keys.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
			if (KeyEvent.CHAR_UNDEFINED == keyCode) {
				throw new RuntimeException(
						"Key code not found for character '" + c + "'");
			}
			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);
		}
	}
}
