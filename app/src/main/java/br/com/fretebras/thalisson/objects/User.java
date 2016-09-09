package br.com.fretebras.thalisson.objects;

/**
 * Created by Team Fretebras Android on 08/09/16.
 */
public class User {
    private String name;
    private String mail;
    private String likeCoffe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLikeCoffe() {
        return likeCoffe;
    }

    public void setLikeCoffe(String likeCoffe) {
        this.likeCoffe = likeCoffe;
    }

    @Override
    public String toString() {
        return name;
    }
}
