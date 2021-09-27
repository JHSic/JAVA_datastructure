public class Token {
	private String operator;
	private int operand;
	private int isp;
	private int icp;
	
	public Token(String data) throws Exception {
		if(isOperator(data)) {
			operator = data;
			isp = isp(data);
			icp = icp(data);
		}
		else {
			operand = Integer.parseInt(data);
		}
	}
	public Token(int newToken) {
		operand = newToken;
	}
	public Token() {
	}
	
	public int getIsp() {
		return isp;
	}
	public int getIcp() {
		return icp;
	}
	
	public boolean isOperator(String data) throws Exception {
		try {
			int num = Integer.parseInt(data);
			return false;
		}
		catch(NumberFormatException numError){
			return true;
		}
	 }
	
	public boolean isOperator() {
		if(operator == null) {
			return false;
		}
		return true;
	}
	
	public String getToken() throws Exception {
		if(operator == null) {
			return Integer.toString(operand);
		}
		else {
			return operator;
		}
	}
	
	public int isp(String operator) {
		switch(operator) {
		case "m":
		case "~":
			return 1;
		case "*":
		case "/":
		case "%":
			return 2;
		case "+":
		case "-":
			return 3;
		case ">>":
		case "<<":
			return 4;
		case "&":
			return 5;
		case "^":
			return 6;
		case "|":
			return 7;
		case "(":
		case ")":
			return 8;
		case "#":
			return 9;
		}
		return -1;
	}
	
	public int icp(String operator) {
		switch(operator) {
		case "(":
		case ")":
			return 0;
		case "m":
		case "~":
			return 1;
		case "*":
		case "/":
		case "%":
			return 2;
		case "+":
		case "-":
			return 3;
		case ">>":
		case "<<":
			return 4;
		case "&":
			return 5;
		case "^":
			return 6;
		case "|":
			return 7;
		case "#":
			return 8;
		}
		return -1;
	}
}