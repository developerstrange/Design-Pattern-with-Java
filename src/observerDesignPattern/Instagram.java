package observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Instagram implements Subject{
	
	private String postUpdate;
	private List<Observer> obs;
	public Instagram() {
		obs = new ArrayList<>();
	}

	@Override
	public void addFollower(Observer ob) {
		obs.add(ob);
		
	}

	@Override
	public void removeFollower(Observer ob) {
		obs.remove(ob);
		
	}

	@Override
	public void notifyFollower(String postUpdate) {
		for(Observer newob : obs) {
			newob.update(postUpdate);
		}
	}
	
	public void setUpdate(String postUpdate) {
		this.postUpdate = postUpdate;
		notifyFollower(postUpdate);
	}
	
	
	
}
