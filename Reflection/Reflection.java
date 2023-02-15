
import java.lang.reflect.*;

public class Reflection {
	public static void details(String clsName) {
		try {
			Class cls = Class.forName(clsName); // forName() converts string to Class type.
			Field[] field = cls.getDeclaredFields(); // getDeclaredFields() gives you all fields on that Class,
														// including private ones.
			Method[] method = cls.getMethods(); // getFields() gives you all public fields on that Class AND it's
												// superclasses.
			for (Field f : field) {
				System.out.println("name: " + f.getName());
				System.out.println("type: " + f.getType());
				int mod = f.getModifiers(); // getModifiers return code, so we convert to string.
				System.out.println("modifiers: " + Modifier.toString(mod));
				System.out.println(" ");
			}
			System.out.println("\n-------------------------------------------------------------\n");
			for (Method m : method) {
				System.out.println(m);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

