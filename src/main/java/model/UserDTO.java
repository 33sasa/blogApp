package model;

//ユーザーモデル
public class UserDTO {

    private String name;
    private String password;

    public UserDTO() {}

    public UserDTO(String name,String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    
	public void setName(String name) {
		this.name = name;
	}
    
    public String getPassword() {
        return this.password;
    }
    
	public void setPassword(String password) {
		this.password = password;
	}

	public UserDTO getAttribute(String string) {
		return null;
	}
}
