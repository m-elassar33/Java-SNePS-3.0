package sneps.network.classes.setClasses;

import java.util.HashSet;
import java.util.Iterator;

import sneps.snip.classes.FlagNode;

/**
 * @className FlagNodeSet.java
 * 
 * @author Amgad Ashraf
 * 
 * @version 3.00 31/5/2018
 */
public class FlagNodeSet implements Iterable<FlagNode> {
	private HashSet<FlagNode> flagNodes;

	public FlagNodeSet(){
		flagNodes = new HashSet<FlagNode>();
	}

	@Override
	public Iterator<FlagNode> iterator() {
		return flagNodes.iterator();
	}

	/**
	 * Check if the flag node set is new (empty)
	 * 
	 * @return true or false
	 */
	public boolean isNew() {
		return flagNodes.isEmpty();
	}

	/**
	 * Insert fn in the flag node set if it is not in
	 * 
	 * @param fn
	 *            FlagNode
	 */
	public void insert(FlagNode fn) {
		if (!this.contains(fn))
			flagNodes.add(fn);
	}

	/**
	 * Return the number of flagged nodes in this set
	 * 
	 * @return int
	 */
	public int cardinality() {
		return flagNodes.size();
	}

	/**
	 * Create a new FlagNodeSet and merge this and f in it
	 * 
	 * @param f
	 *            FlagNodeSet
	 * @return FlagNodeSet
	 */
	public FlagNodeSet union(FlagNodeSet f) {
		FlagNodeSet res = new FlagNodeSet();

		for (FlagNode fn : flagNodes) {
			res.insert(fn);
		}
		for (FlagNode fn : f) {
			res.insert(fn);
		}
		return res;
	}

	public int size() {
		return flagNodes.size();
	}
	/**
	 * Check if fn is in this
	 * 
	 * @param fn
	 *            FlagNode
	 * @return true or false
	 */
	public boolean contains(FlagNode fn){
		if(flagNodes.isEmpty())
			return false;
		return flagNodes.contains(fn);
	}

	public void addAll(FlagNodeSet fns) {
		for(FlagNode fn : fns)
			flagNodes.add(fn);
	}
}
