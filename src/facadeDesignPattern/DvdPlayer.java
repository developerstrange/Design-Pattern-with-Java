package facadeDesignPattern;

public class DvdPlayer {
	void on() {
		System.out.println("DVD player is on and ready to play movies!");
	}
	void play(String movie) {
		System.out.println("Playing movie: "+movie);
	}
}
