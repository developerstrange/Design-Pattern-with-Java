package adapterDesignPattern;

public class AudioPlayer implements MediaPlayer{
	
	private MediaAdapter adapter;

	@Override
	public void play(String mediaType, String fileName) {
		if(mediaType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file: "+fileName);
		}else if(mediaType.equalsIgnoreCase("mp4")) {
			adapter = new MediaAdapter(mediaType);
			adapter.play(mediaType, fileName);
		}else if(mediaType.equalsIgnoreCase("vlc")) {
			adapter = new MediaAdapter(mediaType);
			adapter.play(mediaType, fileName);
		}else {
			System.out.println("Invalid media type: "+fileName);
		}
		
	}
	
	

}
