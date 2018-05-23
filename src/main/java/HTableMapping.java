import javax.persistence.*;


@Entity
@Table(name="test")

public class HTableMapping {

@Id
@GeneratedValue
private Long id;

@Column(name = "username")
    private String username;


@Column(name = "userpasword")
    private String userpassword;

public HTableMapping(){}

public Long getId() {
    return id;
    }

public String getUserName(){
    return username;
}

public String getUserPassword(){

    return userpassword;
}

public void setUserName(String username){
    this.username = username;

}

public void setUserPassword(String userpassword){
        this.userpassword = userpassword;

    }


    @Override
    public java.lang.String toString() {
        return String.format("User id%d, name: %s, password: %s", getId(),getUserName(),getUserPassword() );
    }
}

