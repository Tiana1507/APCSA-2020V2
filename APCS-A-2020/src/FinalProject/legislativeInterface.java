package FinalProject;

public interface legislativeInterface {
	//should contain proportions for each of the party popularity types as well as their accessor methods.
	//this is the basic interface to be implemented by all types of legislation.

	//SET METHODS
	//Far-Left
	public void setCommunist (int n);
	public void setAnarchistLeft (int n);
	public void setSocialist(int n);
	//Left
	public void setPopulistLeft (int n);
	public void setGreens (int n);
	public void setSocialDemocrats (int n);
	//Moderate Left
	public void setProgressives (int n);
	public void setSocialLiberals (int n);
	//Centrist
	public void setCentrist (int n);
	//Moderate Right
	public void setMarketLiberal (int n);
	public void setLibertarian (int n);
	public void setSocialConservatives (int n);
	//Right
	public void setTheoConservatism (int n);
	public void setPopulistRight (int n);
	public void setCorporatism (int n);
	//Far-Right
	public void setReactionairy (int n);
	public void setFundementalist (int n);
	public void setMonarchist (int n);
	public void setFacist (int n);
	
	//GET METHODS
	//Far Left
	public int getCommunist();
	public int getAnarchistLeft();
	public int getSocialist();
	//Left
	public int getPopulistLeft();
	public int getGreens();
	public int getSocialDemocrats();
	//Moderate Left
	public int getProgressives();
	public int getSocialLiberals ();
	//Centrist
	public int getCentrist();
	//Moderate Right
	public int getMarketLiberal();
	public int getLibertarian();
	public int getSocialConservatives();
	//Right
	public int getTheoConservatism();
	public int getPopulistRight();
	public int getCorporatism();
	//Far-Right
	public int getReactionairy();
	public int getFundementalist();
	public int getMonarchist();
	public int getFacists();
	
	//number of seats in legislature
	public int getSeats();
	public void setSeats(int seats);
	
	//related to names
	public String getName();
	public void setName(String name);
	
	//adds up the popularities all together.
	public int popularitySum();
}
