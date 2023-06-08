public class Main {
	public static void main(String args[]) {
		Bruteforce bruteforce = new Bruteforce();
		for (int i = 5000; i < 10000; i++) {
			String combo = String.format("%04d", i);
			bruteforce.tryCombo(combo);
			System.out.println(combo);
			try {
				ProcessBuilder pb = new ProcessBuilder("./date");
				Process p = pb.start();
				p.waitFor();
			} catch (Exception e) {}
		}
	}
}
