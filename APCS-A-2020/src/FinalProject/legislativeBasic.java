package FinalProject;

public class legislativeBasic implements legislativeInterface{

	//Basic implementation of the LegistlativeInterface
	//will be used as a base by all national legislatures.
	
	//private variables containing party popularity.
	//Total popularity 
	private int CommunistPop, AnarchistLeftPop, SocialistPop, PopulistLeftPop, GreensPop, SocialDemocratsPop, ProgressivesPop, SocialLiberalsPop, CentristPop, MarketLiberalPop, LibertarianPop, SocialConservativePop, TheoConservativePop, PopulistRightPop, CorporatismPop, ReactionaryPop, FundementalistPop, MonarchistPop, FacistPop;
	
	//number of seats in the Legislature
	private int seatNum;
	
	//name of the Legislature
	private String name;
	
	//SET FUNCTIONS -- POPULARITY CANNOT BE LOWER THAN 0
	@Override
	public void setCommunist(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		CommunistPop = n;
	}

	@Override
	public void setAnarchistLeft(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		AnarchistLeftPop = n;
	}

	@Override
	public void setSocialist(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		SocialistPop = n;
	}

	@Override
	public void setPopulistLeft(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		PopulistLeftPop = n;
	}

	@Override
	public void setGreens(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		GreensPop = n;
	}

	@Override
	public void setSocialDemocrats(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		SocialDemocratsPop = n;
	}

	@Override
	public void setProgressives(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		ProgressivesPop = n;
	}

	@Override
	public void setSocialLiberals(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		SocialLiberalsPop = n;
	}

	@Override
	public void setCentrist(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		CentristPop = n;
	}

	@Override
	public void setMarketLiberal(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		MarketLiberalPop = n;
	}

	@Override
	public void setLibertarian(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		LibertarianPop = n;
	}

	@Override
	public void setSocialConservatives(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		SocialConservativePop = n;
	}

	@Override
	public void setTheoConservatism(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		TheoConservativePop = n;
	}

	@Override
	public void setPopulistRight(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		PopulistRightPop = n;
	}

	@Override
	public void setCorporatism(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		CorporatismPop = n;
	}

	@Override
	public void setReactionairy(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		ReactionaryPop = n;
	}

	@Override
	public void setFundementalist(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		FundementalistPop = n;
	}

	@Override
	public void setMonarchist(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		MonarchistPop = n;
	}

	@Override
	public void setFacist(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			n = 0;
		}
		FacistPop = n;
	}

	
	//GET FUNCTIONS
	
	
	@Override
	public int getCommunist() {
		// TODO Auto-generated method stub
		return CommunistPop;
	}

	@Override
	public int getAnarchistLeft() {
		// TODO Auto-generated method stub
		return AnarchistLeftPop;
	}

	@Override
	public int getSocialist() {
		// TODO Auto-generated method stub
		return SocialistPop;
	}

	@Override
	public int getPopulistLeft() {
		// TODO Auto-generated method stub
		return PopulistLeftPop;
	}

	@Override
	public int getGreens() {
		// TODO Auto-generated method stub
		return GreensPop;
	}

	@Override
	public int getSocialDemocrats() {
		// TODO Auto-generated method stub
		return SocialDemocratsPop;
	}

	@Override
	public int getProgressives() {
		// TODO Auto-generated method stub
		return ProgressivesPop;
	}

	@Override
	public int getSocialLiberals() {
		// TODO Auto-generated method stub
		return SocialLiberalsPop;
	}

	@Override
	public int getCentrist() {
		// TODO Auto-generated method stub
		return CentristPop;
	}

	@Override
	public int getMarketLiberal() {
		// TODO Auto-generated method stub
		return MarketLiberalPop;
	}

	@Override
	public int getLibertarian() {
		// TODO Auto-generated method stub
		return LibertarianPop;
	}

	@Override
	public int getSocialConservatives() {
		// TODO Auto-generated method stub
		return SocialConservativePop;
	}

	@Override
	public int getTheoConservatism() {
		// TODO Auto-generated method stub
		return TheoConservativePop;
	}

	@Override
	public int getPopulistRight() {
		// TODO Auto-generated method stub
		return PopulistRightPop;
	}

	@Override
	public int getCorporatism() {
		// TODO Auto-generated method stub
		return CorporatismPop;
	}

	@Override
	public int getReactionairy() {
		// TODO Auto-generated method stub
		return ReactionaryPop;
	}

	@Override
	public int getFundementalist() {
		// TODO Auto-generated method stub
		return FundementalistPop;
	}

	@Override
	public int getMonarchist() {
		// TODO Auto-generated method stub
		return MonarchistPop;
	}

	@Override
	public int getFacists() {
		// TODO Auto-generated method stub
		return FacistPop;
	}

	@Override
	public int getSeats() {
		// TODO Auto-generated method stub
		return seatNum;
	}

	@Override
	public void setSeats(int seats) {
		// TODO Auto-generated method stub
		seatNum = seats;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	
	//used to add up all the popularities together into one function, can be called for great use later.
	@Override
	public int popularitySum() {
		int returnsum = 0;
		returnsum = CommunistPop + AnarchistLeftPop + SocialistPop + PopulistLeftPop + GreensPop + SocialDemocratsPop + ProgressivesPop + SocialLiberalsPop + CentristPop + MarketLiberalPop + LibertarianPop + SocialConservativePop + TheoConservativePop + PopulistRightPop + CorporatismPop + ReactionaryPop + FundementalistPop + MonarchistPop + FacistPop;
		return returnsum;
	}

}
