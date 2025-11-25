package proxyDesignPattern;

public class RealVideo implements Video{
	private String fileName;
	
	public RealVideo(String fileName) {
		this.fileName=fileName;
		loadFromDisk();
	}
	
	public void loadFromDisk() {
		System.out.println("Video loading from disk: "+fileName);
	}

	@Override
	public void load() {
		System.out.println("Playing the movie: "+fileName);	
	}

}
