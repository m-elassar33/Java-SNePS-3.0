package sneps.snip.rules;

import java.util.Set;

import sneps.network.Node;
import sneps.network.RuleNode;
import sneps.network.classes.Semantic;
import sneps.network.classes.setClasses.NodeSet;
import sneps.network.classes.term.Term;
import sneps.snebr.Support;
import sneps.snip.Report;
import sneps.snip.channels.Channel;
import sneps.snip.classes.RuleUseInfo;

public class OrNode extends RuleNode {

	private int ant,cq;
	
	public OrNode() {}

	public OrNode(Term syn) {
		super(syn);
	}

	public OrNode(Term syn, Semantic sym) {
		super(syn, sym);
	}
	
	public void applyRuleHandler(Report request, Node node) {
		
		if(request.isPositive()) {
			
			//get originSupport
			//Report report = new Report(request.getSubstitutions(), Support.combine(originSupport,request.getSupports()), true, request.getContextName());
			
			//for (Channel outChannel : outgoingChannels)
				//outChannel.addReport(report);
			
		}
		
		if(request.isNegative()) {
			
			//get originSupport
			//Report report = new Report(request.getSubstitutions(), Support.combine(originSupport,request.getSupports()), false, request.getContextName());
			
			//for (Channel outChannel : outgoingChannels)
				//outChannel.addReport(report);return;
		}
		
	}

	@Override
	protected void sendRui(RuleUseInfo tRui, String contextID) {
	
		
		
	}

	public int getOrAnt() {
		return ant;
	}

	public int getOrCq() {
		return cq;
	}

	@Override
	public NodeSet getDownAntNodeSet() {
		// TODO Auto-generated method stub
		return null;
	}

}
