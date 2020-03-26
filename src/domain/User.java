package domain;

public class User {
    private int id;
    private String openid;
    private String name;
    private int year;
    private String major;

    public User() {
    }

    public User(int id, String openid, String name, int year, String major) {
        this.id = id;
        this.openid = openid;
        this.name = name;
        this.year = year;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", openid='" + openid + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", major='" + major + '\'' +
                '}';
    }
}
