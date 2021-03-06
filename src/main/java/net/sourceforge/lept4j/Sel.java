package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * Selection<br>
 * <i>native declaration : morph.h:8</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class Sel extends Structure {
	/**
	 * sel height<br>
	 * C type : l_int32
	 */
	public int sy;
	/**
	 * sel width<br>
	 * C type : l_int32
	 */
	public int sx;
	/**
	 * y location of sel origin<br>
	 * C type : l_int32
	 */
	public int cy;
	/**
	 * x location of sel origin<br>
	 * C type : l_int32
	 */
	public int cx;
	/**
	 * {0,1,2}; data[i][j] in [row][col] order<br>
	 * C type : l_int32**
	 */
	public PointerByReference data;
	/**
	 * used to find sel by name<br>
	 * C type : char*
	 */
	public Pointer name;
	public Sel() {
		super();
	}
	/**
	 * Gets this Structure's field names in their proper order.
	 * @return list of ordered field names
	 */
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("sy", "sx", "cy", "cx", "data", "name");
	}
	/**
	 * @param sy sel height<br>
	 * C type : l_int32<br>
	 * @param sx sel width<br>
	 * C type : l_int32<br>
	 * @param cy y location of sel origin<br>
	 * C type : l_int32<br>
	 * @param cx x location of sel origin<br>
	 * C type : l_int32<br>
	 * @param data {0,1,2}; data[i][j] in [row][col] order<br>
	 * C type : l_int32**<br>
	 * @param name used to find sel by name<br>
	 * C type : char*
	 */
	public Sel(int sy, int sx, int cy, int cx, PointerByReference data, Pointer name) {
		super();
		this.sy = sy;
		this.sx = sx;
		this.cy = cy;
		this.cx = cx;
		this.data = data;
		this.name = name;
	}
	public Sel(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends Sel implements Structure.ByReference {
		
	};
	public static class ByValue extends Sel implements Structure.ByValue {
		
	};
}
