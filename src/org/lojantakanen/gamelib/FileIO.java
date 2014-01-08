package org.lojantakanen.gamelib;
import java.io.*;
import android.content.*;

public interface FileIO
{
	public InputStream readFile(String file) throws IOException;
	public OutputStream writeFile(String file) throws IOException;
	public InputStream readAsset(String file) throws IOException;
	public SharedPreferences getSharedPref();
}
