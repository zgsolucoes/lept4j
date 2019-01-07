package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * list.h<br>
 *       Cell for double-linked lists<br>
 *       This allows composition of a list of cells with <br>
 *           prev, next and data pointers.  Generic data<br>
 *           structures hang on the list cell data pointers.<br>
 *       The list is not circular because that would add much<br>
 *           complexity in traversing the list under general<br>
 *           conditions where list cells can be added and removed.<br>
 *           The only disadvantage of not having the head point to<br>
 *           the last cell is that the list must be traversed to<br>
 *           find its tail.  However, this traversal is fast, and<br>
 *           the listRemoveFromTail() function updates the tail<br>
 *           so there is no searching overhead with repeated use.<br>
 *       The list macros are used to run through a list, and their<br>
 *       use is encouraged.  They are invoked, e.g., as<br>
 *             DLLIST  *head, *elem;<br>
 *             ...<br>
 *             L_BEGIN_LIST_FORWARD(head, elem)<br>
 *                 &lt;do something with elem and/or elem-&gt;data &gt;<br>
 *             L_END_LIST<br>
 * <i>native declaration : list.h:26</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class DoubleLinkedList extends Structure {
	/** C type : DoubleLinkedList* */
	public DoubleLinkedList.ByReference prev;
	/** C type : DoubleLinkedList* */
	public DoubleLinkedList.ByReference next;
	/** C type : void* */
	public Pointer data;
	public DoubleLinkedList() {
		super();
	}
	/**
	 * Gets this Structure's field names in their proper order.
	 * @return list of ordered field names
	 */
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("prev", "next", "data");
	}
	/**
	 * @param prev C type : DoubleLinkedList*<br>
	 * @param next C type : DoubleLinkedList*<br>
	 * @param data C type : void*
	 */
	public DoubleLinkedList(DoubleLinkedList.ByReference prev, DoubleLinkedList.ByReference next, Pointer data) {
		super();
		this.prev = prev;
		this.next = next;
		this.data = data;
	}
	public DoubleLinkedList(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends DoubleLinkedList implements Structure.ByReference {
		
	};
	public static class ByValue extends DoubleLinkedList implements Structure.ByValue {
		
	};
}
