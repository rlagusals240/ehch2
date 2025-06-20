package sec05.exam02;

public class Singleton {
	
	private static Singleton singleton = null;

	
//	private Singleton(){
		
//	}
	
//	Singleton getInstance() {
	static Singleton getInstance = new Singleton();
		private Singleton(){}
			static Singleton getInstance() {
	return Singleton.singleton;
	}
}
