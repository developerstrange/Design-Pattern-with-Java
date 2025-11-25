package adapterDesignPattern;

public class MediaAdapter implements MediaPlayer{
	private AdvanceMediaPlayer advancePlayer;
	
	public MediaAdapter(String mediaType) {
		if(mediaType.equalsIgnoreCase("mp4")) {
			advancePlayer = new Mp4Player();
		}else if(mediaType.equalsIgnoreCase("vlc")) {
			advancePlayer = new VlcPlayer();
		}
	}

	@Override
	public void play(String mediaType, String fileName) {
		advancePlayer.playAdvanceMedia(mediaType, fileName);
		
	}
	
}
