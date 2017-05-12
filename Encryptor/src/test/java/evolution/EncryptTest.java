package evolution;

import org.junit.Test;

public class EncryptTest {
	@Test
	public void encrypt() {
		FileUtil.encrypt("/Users/chenli/Desktop/CodeWriter.java", "/Users/chenli/Desktop/CodeWriterEncoded.java");
	}
}
