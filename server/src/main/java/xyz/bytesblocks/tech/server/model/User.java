package xyz.bytesblocks.tech.server.model;

public class User {

    private long id;

    private String username;

    public User(final long id, final String username) {
        this.id = id;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }
}
