package pt.isel.leic.lae;


public class Prog {

	public static void inspect(Object obj) throws Exception {
		System.out.println("--------");

		// Get a KClass object from an instance
		final var cls = obj.getClass();;
		System.out.println("full  name: " + cls.getCanonicalName());
		System.out.println("short name: " + cls.getSimpleName());

		System.out.println("--------");
		System.out.println("methods: [");
		for (var m : cls.getDeclaredMethods()) {
			System.out.println("   " + m); // show all members of obj's type
			//System.out.println(m);
			if (m.getName() == "mcwp") {
			 	System.out.print("      >>>   ");
			 	Object ret = m.invoke(obj, "Benfica"); // invokes method mcwp for the instance referred by obj
				System.out.println("return object:"+  ret);
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) throws Exception {

		System.out.println("--------");

		// Get a KClass object from the class
		final Class cls = ClassWithProperties.class;

		System.out.println("full  name: " + cls.getCanonicalName());
		System.out.println("short name: " + cls.getSimpleName());

		final var obj = new ClassWithProperties(10, "LAE", 1.2345);
		obj.mcwp("SLB");
		inspect(obj);
	}
}
