import java.util.List;

/**
 * Created by John's New HP on 3/25/2017.
 */
public class UserEntityTest {

    public enum UserLevel
    {
        ADMIN,
        USER,
        STANDARD;
    }

    private String name;
    private UserLevel userLevel;

    private String[] companies;

    public UserEntityTest(String name, UserLevel userLevel, String[] companies) {
        this.name = name;
        this.userLevel = userLevel;
        this.companies = companies;
    }

    public String getName() {
        return name;
    }

    public UserLevel getUserLevel() {
        return userLevel;
    }

    public String[] getCompanies() {
        return companies;
    }
}
