package adapterDesignPattern;

public class Mp4Player implements AdvanceMediaPlayer{

	@Override
	public void playAdvanceMedia(String mediaType, String fileName) {
		System.out.println("Playing "+mediaType+" file: "+fileName);
	}

}
