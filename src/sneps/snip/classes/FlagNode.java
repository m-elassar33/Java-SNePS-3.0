package sneps.snip.classes;

import sneps.network.Node;
import sneps.network.classes.setClasses.PropositionSet;

public class FlagNode {
	private Node node;
	private PropositionSet supports;
	private int flag;

	/**
	 * Create a new flag node
	 * 
	 * @param n
	 *            node
	 * @param set
	 *            support
	 * @param f
	 *            true or false
	 */
	public FlagNode(Node n, PropositionSet set, int f) {
		node = n;
		supports = set;
		flag = f;
	}

	/**
	 * Return the node of the flag node
	 * 
	 * @return Node
	 */
	public Node getNode() {
		return node;
	}

	/**
	 * Return the support of the flag node
	 * 
	 * @return support
	 */
	public PropositionSet getSupports() {
		return supports;
	}

	/**
	 * Return the flag of the flag node (1 is true, 2 is false, 3 is unknown and
	 * 4 is requested)
	 * 
	 * @return Node
	 */
	public int getFlag() {
		return flag;
	}

	/**
	 * Check if this and fn are equal
	 * 
	 * @param fn
	 *            flag node
	 * @return true or false
	 */
	public boolean isEqual(FlagNode fn) {
		return fn.node == node && fn.supports == supports && fn.flag == flag;
	}

}
