package Builderdesignpatternforhouseexample;

public class builder {
	private int buildwalls;
	private int builddoors;
	private int buildwindows;
	public builder(int buildwalls, int builddoors, int buildwindows) {
		super();
		this.buildwalls = buildwalls;
		this.builddoors = builddoors;
		this.buildwindows = buildwindows;
	}
	@Override
	public String toString() {
		return "The  house will be constructed  With the following features\n [No. of walls Builded=" + buildwalls + ", No. of Doors Builded=" + builddoors + ","
				+ " No. of Windows Builded=" + buildwindows
				+ "]";
	}
	

}
