package lesson10_collections_1.task1_college;

import java.util.ArrayList;
import java.util.List;

public class College {

    private List<Group> groupslist;

    public College() {
        this.groupslist = new ArrayList<>();
    }

    public List<Group> getGroupsList() {
        return groupslist;
    }

    public Group getGroupWithMinStudentsQuantity() {
        System.out.println("Group with min students quantity: ");
        Group groupWithMinStudentsQuantity = getGroupsList().get(0);

        for(Group group : groupslist) {
            if (groupWithMinStudentsQuantity.getStudentList().size()
            > group.getStudentList().size()){
                groupWithMinStudentsQuantity = group;
            }
        }
        return groupWithMinStudentsQuantity;
    }

    @Override
    public String toString() {
        return "College{" +
                "groupslist=" + groupslist +
                '}';
    }
}
