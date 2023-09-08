package LMSProgect.Interface;

import LMSProgect.Class.Group;

import java.util.List;

public interface GroupInterface {
     void addNewGroup(String groupName) ;
     Group getGroupByName(String groupName);
     void updateGroupName(String oldGroupName, String newGroupName) ;
    public List<Group> getAllGroups() ;
    public void deleteGroup(String groupName) ;

    }
