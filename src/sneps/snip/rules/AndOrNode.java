package sneps.snip.rules;

import sneps.network.Node;
import sneps.network.RuleNode;
import sneps.network.classes.Semantic;
import sneps.network.classes.setClasses.NodeSet;
import sneps.network.classes.term.Term;
import sneps.snip.Report;
import sneps.snip.classes.RuleUseInfo;

public class AndOrNode extends RuleNode {

	boolean sign = false;
	
	private int min, max, args;
	
	private int positiveCount = 0;
	public int getAndOrMin() {
		return min;
	}

	public int getAndOrMax() {
		return max;
	}

	public int getAndOrArgs() {
		return args;
	}

	public AndOrNode() {
		// TODO Auto-generated constructor stub
	}

	public AndOrNode(Term syn) {
		super(syn);
		// TODO Auto-generated constructor stub
	}

	public AndOrNode(Term syn, Semantic sym) {
		super(syn, sym);
		// TODO Auto-generated constructor stub
	}

	
	public void applyRuleHandler(Report request, Node node) {
	
		if(request.isPositive()==true)
			positiveCount++;
		
	}
	
	@Override
	protected void sendRui(RuleUseInfo tRui, String contextID) {
		
		if(positiveCount>=min && positiveCount<=max)
			sign=true;
		else
			sign=false;
		
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
