import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
    private int numberOfGroup;
    private Student[] studentsList;

    public Group(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
        studentsList = new Student[10];
    }

    public Group() {
        studentsList = new Student[10];
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public void addStudentToGroup(Student student) throws ArrayIsFullException{
        boolean isGroupFull = true;
        boolean thisStudentIsAlreadyInTheGroup = false; //для того щоб ми не добавляни 2 раза одного студента
        for (Student aStudentsList : studentsList) {
            if (aStudentsList == student) {
                thisStudentIsAlreadyInTheGroup = true;
            }
        }
        if (!thisStudentIsAlreadyInTheGroup) {
            for (int i = 0; i < studentsList.length; i++) {
                if (studentsList[i] == null) {
                    isGroupFull = false;
                    studentsList[i] = student;
                    System.out.println(student.getFirstName()+" "+ student.getLastName()+" has added successfully.");
                    break;
                }
            }
            if (isGroupFull) throw new ArrayIsFullException();
        }
        else
            System.out.println("This student is already in the group.");

    }

    public void deleteStudentFromGroup(Student student) {
        boolean thereAreNoThisStudentInGroup = false;
        for (int i = 0; i < studentsList.length; i++) {
            if (studentsList[i] == student) {
                thereAreNoThisStudentInGroup = true;
                studentsList[i] = null;
                System.out.println(student.getFirstName()+" "+ student.getLastName() +" has deleted from group.");
            }
        }
        if (!thereAreNoThisStudentInGroup) {
            System.out.println("Such a student is not in the group.");
        }
    }

    public Student getStudentByLastName(String lastName) {
        for (Student aStudentsList : studentsList) {
            try {
                if (aStudentsList.getLastName().equals(lastName)) {
                    return aStudentsList;
                }
            } catch (NullPointerException e) {
            }
        }
        System.out.println("Such a student is not in the group.");
        return null;
    }

    @Override
    public String toString() {
        //сам studentsList не сортував тому що по завданню потрібно просто вивести відсортовано
        // а не відсортувати studentsList. тому використав додатковий масив


        int lengthStudents = 0;
        for (int i = 0; i < studentsList.length; i++) {
            if (studentsList[i] != null) {
                lengthStudents++;
            }
        }

        Student[] students = new Student[lengthStudents];
        int index = 0;
        for (int i = 0; i < studentsList.length; i++) {
            if (studentsList[i] != null) {
                students[index] = studentsList[i];
                index++;
            }
        }

        for (int i = 0; i < students.length-1; i++) {
            for (int j = 0; j < students.length-1; j++) {
                if (!students[j].getLastName().equals(students[j+1].getLastName())) {
                    if (students[j].getLastName().compareTo(students[j + 1].getLastName()) > 0) {
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
                else {
                    if (students[j].getFirstName().compareTo(students[j + 1].getFirstName()) > 0) {
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
            }
        }

        return "Group{\n"+ Arrays.toString(students) +"}";
    }
}
