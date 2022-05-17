package practice;

public class Member implements Comparable<Member>{

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Member o) {
        if(this.id > o.id) {
            return -1;
        } else if(this.id == o.id) {
            return 0;
        }
        return 1;
    }
}
