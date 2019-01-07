package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * stringcode.h<br>
 *     Data structure to hold accumulating generated code for storing<br>
 *     and extracting serializable leptonica objects (e.g., pixa, recog).<br>
 *     Also a flag for selecting a string from the L_GenAssoc struct<br>
 *     in stringcode.<br>
 * <i>native declaration : stringcode.h:12</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_StrCode extends Structure {
	/**
	 * index for function and output file names<br>
	 * C type : l_int32
	 */
	public int fileno;
	/**
	 * index into struct currently being stored<br>
	 * C type : l_int32
	 */
	public int ifunc;
	/**
	 * store case code for extraction<br>
	 * C type : SARRAY*
	 */
	public net.sourceforge.lept4j.Sarray.ByReference function;
	/**
	 * store base64 encoded data as strings<br>
	 * C type : SARRAY*
	 */
	public net.sourceforge.lept4j.Sarray.ByReference data;
	/**
	 * store line in description table<br>
	 * C type : SARRAY*
	 */
	public net.sourceforge.lept4j.Sarray.ByReference descr;
	/**
	 * number of data strings<br>
	 * C type : l_int32
	 */
	public int n;
	public L_StrCode() {
		super();
	}
	/**
	 * Gets this Structure's field names in their proper order.
	 * @return list of ordered field names
	 */
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("fileno", "ifunc", "function", "data", "descr", "n");
	}
	/**
	 * @param fileno index for function and output file names<br>
	 * C type : l_int32<br>
	 * @param ifunc index into struct currently being stored<br>
	 * C type : l_int32<br>
	 * @param function store case code for extraction<br>
	 * C type : SARRAY*<br>
	 * @param data store base64 encoded data as strings<br>
	 * C type : SARRAY*<br>
	 * @param descr store line in description table<br>
	 * C type : SARRAY*<br>
	 * @param n number of data strings<br>
	 * C type : l_int32
	 */
	public L_StrCode(int fileno, int ifunc, net.sourceforge.lept4j.Sarray.ByReference function, net.sourceforge.lept4j.Sarray.ByReference data, net.sourceforge.lept4j.Sarray.ByReference descr, int n) {
		super();
		this.fileno = fileno;
		this.ifunc = ifunc;
		this.function = function;
		this.data = data;
		this.descr = descr;
		this.n = n;
	}
	public L_StrCode(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends L_StrCode implements Structure.ByReference {
		
	};
	public static class ByValue extends L_StrCode implements Structure.ByValue {
		
	};
}
