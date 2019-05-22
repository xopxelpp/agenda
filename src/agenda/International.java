package agenda;

import java.util.List;

public class International {
	
	private String code;
	private List<String> value;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	public List<String> getValue() {
		return value;
	}
	public void setValue(List<String> value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "International [code=" + code + ", value=" + value + "]\n";
	}
	
	
	

}
