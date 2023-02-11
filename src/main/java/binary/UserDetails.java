package binary;

public class UserDetails {
    private String name;
    private int uid;
    private int age_user;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getAge_user() {
        return age_user;
    }

    public void setAge_user(int age_user) {
        this.age_user = age_user;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age_user=" + age_user +
                ", uid'" + uid + '\'' +
                '}';
    }
    public UserDetails(int id, String name, int age_user){
        this.name= name;
        this.uid=id;
    this.age_user=age_user;
        System.out.println("You have entered the name of user  "   +name);
    }
    public UserDetails(int ids){
        this.uid=ids;
        System.out.println("You have successfully deleted the data of  "   +name);
    }



}
