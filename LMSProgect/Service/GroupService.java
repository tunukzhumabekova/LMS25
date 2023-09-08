package LMSProgect.Service;

import LMSProgect.Class.DataBase;
import LMSProgect.Class.Group;
import LMSProgect.Interface.GroupInterface;

import java.util.List;
import java.util.Scanner;

public class GroupService implements GroupInterface {
    private final DataBase dataBase;
 public GroupService(DataBase dataBase) {
        this.dataBase = dataBase;
    }





    @Override
    public void addNewGroup(String groupName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of group");
        String GroupName = scanner.nextLine();
        System.out.println("Enter a group description");
        String GroupDes = scanner.nextLine();
        Group group2 = new Group(GroupName, GroupDes, null, null);
        dataBase.getGroups().add(group2);
        System.out.println(getAllGroups());
    }
    @Override
    public Group getGroupByName(String groupName) {
        for (int i = 0; i < dataBase.getGroups().size(); i++) {
           if(dataBase.getGroups().get(i).getGroupName().equals(groupName)){
               return dataBase.getGroups().get(i);
           }
        }
        return null;
    }

    @Override
    public void updateGroupName(String oldGroupName, String newGroupName) {
        for (int i = 0; i < dataBase.getGroups().size(); i++) {

                                    if(dataBase.getGroups().get(i).getGroupName().equals(oldGroupName)){
                                        dataBase.getGroups() .get(i).setGroupName(newGroupName);
                                        dataBase.getGroups().get(i).setId( dataBase.getGroups().get(i).getId());
                                         dataBase.getGroups().get(i).setDescription( dataBase.getGroups().get(i).getDescription());
                                          dataBase.getGroups().get(i).setLessons( dataBase.getGroups().get(i).getLessons());
                                           dataBase.getGroups().get(i).setStudents(dataBase.getGroups().get(i).getStudents());
                                        System.out.println(dataBase.getGroups());
                                    }
        }
    }

    @Override
    public List<Group> getAllGroups() {
        return dataBase.getGroups();
    }

    @Override
    public void deleteGroup(String groupName) {
        for (int i = 0; i < dataBase.getGroups().size(); i++) {
            dataBase.getGroups().remove(groupName);
        }
    }
}
