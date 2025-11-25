package proxyDesignPattern;

public class VideoProxy implements Video{
	private String fileName;
	private RealVideo realVideo;
	
	public VideoProxy(String fileName) {
		this.fileName=fileName;
	}

	@Override
	public void load() {
		if(realVideo == null) {
			realVideo = new RealVideo(fileName);
		}
		realVideo.load();
	}
	
	

}
