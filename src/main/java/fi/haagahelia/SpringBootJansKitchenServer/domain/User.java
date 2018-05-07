package fi.haagahelia.SpringBootJansKitchenServer.domain;

public class User {
	private long id;
    private String username, email;
	
    public User() {
    	
    }
    
	public User(long id, String username, String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
    public String toString() {
        return String.format(
                "Person[id=%d, firstName='%s', lastName='%s']",
                id, username, email);
    }
}
