package evolution;

import org.junit.Test;

public class EncryptTest {
	@Test
	public void encrypt() {
		FileUtil.encrypt("/Users/chenli/Desktop/Code_Writer.zip", "/Users/chenli/Desktop/Code_Writer_Encoded.zip");
	}
}
