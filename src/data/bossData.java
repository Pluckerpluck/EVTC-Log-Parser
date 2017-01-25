package data;

public class bossData {

	// Fields
	private long agent = 0;
	private int CID = 0;
	private String name = "";
	private int HP = 0;
	private long fight_duration = 0;
	private String version = "";

	// Constructor
	public bossData(long agent, int CID, String name, int HP, long fight_duration, String version) {
		this.agent = agent;
		this.CID = CID;
		this.name = name;
		this.HP = HP;
		this.fight_duration = fight_duration;
		this.version = version;
	}

	// Getters
	public long getAgent() {
		return agent;
	}

	public int getCID() {
		return CID;
	}

	public String getName() {
		return name;
	}

	public int getHP() {
		return HP;
	}

	public int getFightDuration() {
		return (int) fight_duration;
	}

	public String getVersion() {
		return version;
	}

	// Setters
	public void setAgent(long agent) {
		this.agent = agent;
	}

	public void setFightDuration(long fight_duration) {
		this.fight_duration = fight_duration;
	}

}
