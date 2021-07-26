import java.awt.Desktop;
import java.net.URI;


class mainclass {
	public static void main(String[] args) throws Exception {
		Desktop d1 = Desktop.getDesktop();
		d1.browse(new URI("http://bing.com"));
	}
}