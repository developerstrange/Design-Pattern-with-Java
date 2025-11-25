package facadeDesignPattern;

public class HomeTheatreFacade {
	private DvdPlayer dvd = new DvdPlayer();
	private Projector projector = new Projector();
	private SoundSystem sound = new SoundSystem();
	
//	private DvdPlayer dvd;
//	private Projector projector;
//	private SoundSystem sound;
//	
//	public HomeTheatreFacade(DvdPlayer dvd, Projector projector, SoundSystem sound) {
//		this.dvd=dvd;
//		this.projector=projector;
//		this.sound=sound;
//	}
	
	
	public void watchMovie(String movie) {
		projector.on();
		sound.on();
		dvd.on();
		dvd.play(movie);
	}
	
	
}
