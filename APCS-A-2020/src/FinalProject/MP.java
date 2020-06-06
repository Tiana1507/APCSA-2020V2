package FinalProject;
//Andrew Tian

public class MP {
	//MP or member of parliament
	//will represent a basic seat.
	
	//gives the ideology of the holder of the seat and determines Party Allegiance.
	public String ideology;
	
	public MP (String party) {
		ideology = party;
		setIdeo(party);
	}
	
	//kind of a misnomer, should have been parties.
	public String getIdeology() {
		return ideology;
	}
	
	public void setIdeo(String ideo) {
		//list of codes for different IDEOLOGIES
		//COM
		//ANL
		//SOC
		//PPL
		//GRE
		//SCD
		//PRG
		//SCL
		//CEN
		//MKL
		//LIB
		//SCC
		//THC
		//PPR
		//COR
		//REA
		//FUN
		//MON
		//FAS
		ideology = ideo;
	}
}
