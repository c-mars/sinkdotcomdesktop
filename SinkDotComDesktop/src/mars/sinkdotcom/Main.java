package mars.sinkdotcom;

public class Main {
	public static void main(String [] args) {
		DotComBust game = new DotComBust(new GameHelperDesktop());
		game.startPlaying();
	}
}
