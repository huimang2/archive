package design_pattern.creational.singleton;

public class StaticHolderSingleton {

    private StaticHolderSingleton(){}
	
	private static class SingleTonHolder{
		private static final StaticHolderSingleton INSTANCE = new StaticHolderSingleton();
	}
	
	public static StaticHolderSingleton getInstance(){
		return SingleTonHolder.INSTANCE;
	}
}
