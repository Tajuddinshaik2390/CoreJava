package Default;

public interface Sim {
	public abstract void call();
public abstract void sms();
public default void  videocall() {
	System.out.println("video calling using default");
}
}
