package observerDesignPattern;

public interface Subject {
	void addFollower(Observer ob);
	void removeFollower(Observer ob);
	void notifyFollower(String postUpdate);
}
