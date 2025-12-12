package observerDesignPattern;

public class ObserverPatternMainClass {

	public static void main(String[] args) {
		/*
		 * 
		 * Observer Design Patter:--------- 
		 * The Observer Pattern is one of the most important
		 * behavioral design patterns. It is used when one object must notify multiple
		 * other objects automatically whenever something changes.
		 * 
		 * Think of it as a one-to-many notification system.
		 * 
		 * 
		 * Real Life analogy:------------
		 * 
		 * Let’s take a Facebook user who creates a post.
		 * Post Owner → the Subject
		 * 
		 * Friends/Followers → the Observers
		 * 
		 * Whenever the post owner updates the post (edit caption, add image, react
		 * count changes):
		 * 
		 * Followers get notified (“Shifat updated his post”).
		 * 
		 * Followers can:
		 * 
		 * Follow (subscribe)
		 * 
		 * Unfollow (unsubscribe)
		 * 
		 * This is EXACT Observer behavior.
		 * 
		 * Components:-------------------
		 * 1.Subject (Publisher)
		 * ->This is the object being observed. It contains a list of observers.
		 * 2.Observer (Subscriber)
		 * ->This is any object that wants to be notified. It gives the update() method that the Subject calls.
		 * 3.Concrete Subject
		 * ->Data/state that changes (news, video, weather, stock price), Collection of observers, Actual logic to notify observers
		 * 4.Concrete Observer
		 * ->User receives YouTube notification, App displays a weather update, Trading software gets stock update
		 * 5.Client
		 * ->Creates subjects and observers and connects them together.
		 * 
		 * Steps to achieve observer design patter:----------
		 * 
		 * Step:01
		 * -> Identify the situation where Observer is needed
		 * Step:02
		 * ->Create the Observer Interface
		 * Step:03
		 * ->Create the Subject (Publisher) Interface
		 * Step:04
		 * ->Create the Concrete Subject
		 * Step:05
		 * ->Create the Concrete Observer classes
		 * Step:06
		 * ->Client connects everything
		 * 
		 */
		
		
		Instagram follower = new Instagram();
		
		Observer ahan = new Ahan_Rob("Ahan Rob");
		Observer nafis = new Ahan_Rob("Nafis Wadud Ansari");
		Observer tanvir = new Tanvir_Ahmed("Tanvir Ahmed");
		
		follower.addFollower(ahan);
		follower.addFollower(tanvir);
		follower.addFollower(nafis);
		
		
		follower.removeFollower(nafis);
		
		
		follower.setUpdate("Instagram launcing like emoji on post.");
		
		
		

	}

}
