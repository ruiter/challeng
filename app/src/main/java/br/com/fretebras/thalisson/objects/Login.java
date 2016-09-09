package br.com.fretebras.thalisson.objects;

/**
 * Created by Team Fretebras Android on 09/09/16.
 */
public class Login {
    private String id;
    private String result;
    private String msg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "id: " + id + " result: " + result + " msg: " + msg;
    }
}
