package test;

public class TokenList {

    private Token[] tokens;
    private int size;
    private int count;

    public TokenList() {
        this.size = 5;
        this.count = 0;
        tokens = new Token[this.size];
    }

    public int getCount() { return count; }

    public Token At(int pos) {
        Token result = null;

        if (pos < count)
            result = tokens[pos];

        return result;
    }

    public void add(Token token) {
        if (size == count + 1)
            resize();

        tokens[count++] = token;
    }

    private void resize() {
        Token[] newTokens = new Token[size * 2];

        for (int i = 0; i < size; i++)
            newTokens[i] = tokens[i];
        size *= 2;

        tokens = newTokens;
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < count; i++) {
            result += tokens[i].getData() + ' ';
        }

        return result;
    }
}

