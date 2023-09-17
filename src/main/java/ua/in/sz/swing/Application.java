package ua.in.sz.swing;

//import org.eclipse.aether.connector.basic.PartialFile;

import org.eclipse.aether.connector.basic.PartialFile;

import java.io.File;

public class Application implements PartialFile.RemoteAccessChecker {

	public static void main(String[] args) throws Exception {
		System.out.println("------- >>>>");

		new Application().run();;
	}

	public void run() throws Exception {
		File file = new File("D:/projects-java/_maven/maven/data.txt");
		PartialFile.Factory partialFileFactory = new PartialFile.Factory(true, 3L, 10);
		PartialFile partFile = partialFileFactory.newInstance(file, this);

		System.out.println("file: " + partFile.getFile().getName());

		partFile.close();
	}

	@Override
	public void checkRemoteAccess() throws Exception {

	}
}
