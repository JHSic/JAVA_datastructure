package test;

public class Token {

    public static final int OPND = 0;
    public static final int OPER = 1;

    private String data;
    private int type;

    public Token(String data, int type){
        this.data = data;
        this.type = type;
    }

    public String getData(){
        return data;
    }

    public int getType(){
        return type;
    }
}

