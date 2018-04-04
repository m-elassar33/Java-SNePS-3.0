package sneps.snip.classes;

import sneps.network.classes.setClasses.FlagNodeSet;
import sneps.snip.matching.Substitutions;

public class RuleUseInfo {

	private Substitutions sub;
	private int pos;
	private int neg;
	private FlagNodeSet fns;

	/**
	 * Create new rule use info
	 * 
	 * @param s
	 *            substitutions list
	 * @param p
	 *            number of positive substitutions
	 * @param n
	 *            number of negative substitutions
	 */
	public RuleUseInfo(Substitutions s, int p, int n, FlagNodeSet f) {
		sub = s;
		pos = p;
		neg = n;
		fns = f;
	}
	
	/**
	 * Return the number of positive substitutions
	 * 
	 * @return int
	 */
	public int getPosCount() {
		return pos;
	}

	/**
	 * Return the number of negative substitutions
	 * 
	 * @return int
	 */
	public int getNegCount() {
		return neg;
	}
	
	public RuleUseInfo combine(RuleUseInfo tRui) {
		// TODO Auto-generated method stub
		return null;
	}

}
