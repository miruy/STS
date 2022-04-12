package a.b.c.model;

public class SearchCmd {
	private String target;
	private String query;
	
	public SearchCmd() {}

	public SearchCmd(String target, String query) {
		this.target = target;
		this.query = query;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	
	
}
