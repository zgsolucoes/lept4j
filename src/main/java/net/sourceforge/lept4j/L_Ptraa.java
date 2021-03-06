package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : ptra.h:10</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Ptraa extends Structure {
	/**
	 * size of allocated ptr array<br>
	 * C type : l_int32
	 */
	public int nalloc;
	/**
	 * array of ptra<br>
	 * C type : L_Ptra**
	 */
	public PointerByReference ptra;
	public L_Ptraa() {
		super();
	}
	/**
	 * Gets this Structure's field names in their proper order.
	 * @return list of ordered field names
	 */
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("nalloc", "ptra");
	}
	/**
	 * @param nalloc size of allocated ptr array<br>
	 * C type : l_int32<br>
	 * @param ptra array of ptra<br>
	 * C type : L_Ptra**
	 */
	public L_Ptraa(int nalloc, PointerByReference ptra) {
		super();
		this.nalloc = nalloc;
//		if ((ptra.length != this.ptra.length)) 
//			throw new IllegalArgumentException("Wrong array size !");
		this.ptra = ptra;
	}
	public L_Ptraa(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends L_Ptraa implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Ptraa implements Structure.ByValue {
		
	};
}
