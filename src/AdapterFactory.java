
// Class used to determined how the System interfaces with a given Course Database

public class AdapterFactory {
	private static IcatalogAdapter catalogAdapter = null;
	private static AdapterFactory instance = null;

	public static synchronized IcatalogAdapter getCatalogAdapter()
			throws Exception {
		return catalogAdapter;
	}

	// returns a catalog adapter based on the Course Database given, as a string
	public static synchronized IcatalogAdapter getCatalogAdapter(String arg)
			throws Exception {
		if (catalogAdapter == null) {
			String className = arg + "Adapter";
			catalogAdapter = (IcatalogAdapter) Class.forName(className)
					.newInstance();
			System.out.println("Starting Fireball with " + className + ".");
		}
		return catalogAdapter;
	}

	// Uses a singleton to make an AdapterFactory
	public static synchronized AdapterFactory getInstance() {
		if (instance == null)
			instance = new AdapterFactory();
		return instance;
	}
}
