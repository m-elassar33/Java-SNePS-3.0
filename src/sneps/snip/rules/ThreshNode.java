package sneps.snip.rules;

import sneps.network.Node;
import sneps.network.RuleNode;
import sneps.network.classes.Semantic;
import sneps.network.classes.setClasses.NodeSet;
import sneps.network.classes.term.Term;
import sneps.snip.Report;
import sneps.snip.classes.RuleUseInfo;

public class ThreshNode extends RuleNode {

	boolean sign = false;
	
	private int min, max, args;
	private int positiveCount = 0;
	
	public int getThreshMin() {
		return min;
	}

	public int getThreshMax() {
		return max;
	}

	public int getThreshArgs() {
		return args;
	}

	public ThreshNode() {
		// TODO Auto-generated constructor stub
	}

	public ThreshNode(Term syn) {
		super(syn);
		// TODO Auto-generated constructor stub
	}

	public ThreshNode(Term syn, Semantic sym) {
		super(syn, sym);
		// TODO Auto-generated constructor stub
	}

	
	public void applyRuleHandler(Report request, Node node) {
		
		if(request.isPositive()==true)
			positiveCount++;
		
	}
	
	@Override
	protected void sendRui(RuleUseInfo tRui, String contextID) {
		if(min!=max) {
			if(positiveCount<=min || positiveCount>=max)
				sign=true;
			else
				sign=false;
		} else {
			sign=true;
		}
		//getting originSupport
		//Report report = new Report(request.getSubstitutions(), Support.combine(originSupport,request.getSupports()), sign, request.getContextName());
		
		//for (Channel outChannel : outgoingChannels)
			//outChannel.addReport(report);
		
		

	}

	@Override
	public NodeSet getDownAntNodeSet() {
		// TODO Auto-generated method stub
		return null;
	}

}
