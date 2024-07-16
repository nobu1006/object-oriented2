package human;

import java.util.List;

public class Clazz {

    private List<Human> members;

    public int getMensNum() {
        int num = 0;
        for (Human human : members) {
            if ("男性".equals(human.getGender())) {
                num++;
            }
        }
        return num;
    }

    public int getWomensNum() {
        int num = 0;
        for (Human human : members) {
            if ("女性".equals(human.getGender())) {
                num++;
            }
        }
        return num;
    }


    public List<Human> getMembers() {
        return members;
    }

    public void setMembers(List<Human> members) {
        this.members = members;
    }

    

}
