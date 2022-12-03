package Day16_11_20.homework.MEDIUM;

import java.util.ArrayList;

public class GroupService {

    public void moveGroup(School mokyklaIsKuriosPerkeltiGrupe, School mokyklaIKuriaPerkelsim, Group perkeliamaGrupe) {


        ArrayList<Group> mokyklosGrupes = mokyklaIsKuriosPerkeltiGrupe.getGroups();
        ArrayList<Group> grupesNaujojeMokykloje = mokyklaIKuriaPerkelsim.getGroups();
        int groupNumber = 0;
        boolean isGroupMoved = false;
        while (groupNumber < mokyklosGrupes.size() && !isGroupMoved) {
            if (mokyklosGrupes.get(groupNumber).equals(perkeliamaGrupe)) {
                grupesNaujojeMokykloje.add(mokyklosGrupes.get(groupNumber));
                mokyklaIKuriaPerkelsim.setGroups(grupesNaujojeMokykloje);
                mokyklosGrupes.remove(mokyklosGrupes.get(groupNumber));
                mokyklaIsKuriosPerkeltiGrupe.setGroups(mokyklosGrupes);
                isGroupMoved = true;
            }
            groupNumber++;
        }
    }

    public ArrayList<Group> getGroupWithMostStudents(ArrayList<School> schools) {
        Group biggestGroup = schools.get(0).getGroups().get(0);
        for (School school : schools) {
            ArrayList<Group> groupsAtSchool = school.getGroups();
            for (Group group : groupsAtSchool) {
                if (group.getStudents().size() > biggestGroup.getStudents().size()) {
                    biggestGroup = group;
                }

            }

        }
        ArrayList<Group> groupWithMostStudent = new ArrayList<>();
        groupWithMostStudent.add(biggestGroup);
        //Tikrinam ar nera grupiu su tiek pat studentu skaiciu, jeigu yra tada pridedam i lista
        for (School school : schools) {
            ArrayList<Group> groupsAtSchool = school.getGroups();
            for (Group group : groupsAtSchool) {
                if (severalGroupsHasSameStudents(biggestGroup, group)) {
                    groupWithMostStudent.add(group);
                }
            }
        }
        return groupWithMostStudent;
    }


    private static boolean severalGroupsHasSameStudents(Group biggestGroup, Group group) {
        return group != biggestGroup && group.getStudents().size() == biggestGroup.getStudents().size();
    }
}
