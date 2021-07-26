import java.beans.*;

public class BeanClass {
	private final String name = "BeanClass";
	private int size;

	public String getName() {
		return this.name;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public static void main(String[] args) throws IntrospectionException {
		BeanInfo info = Introspector.getBeanInfo(BeanClass.class);

		for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
			System.out.println(pd.getName());
		}

		for (MethodDescriptor pd : info.getMethodDescriptors()) {
			System.out.println(pd.getName());
		}
	}
}