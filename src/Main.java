public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Денис", "Піцул", true, 20, false,
                85, 43);
        Student student2 = new Student("Володимир", "Перон", true, 19, false,
                85, 54);
        Student student3 = new Student("Андрій", "Онищук", true, 20, false,
                80, 32);
        Student student4 = new Student("Роман", "Осадчук", true, 19, false,
                92, 65);
        Student student5 = new Student("Олександр", "Срібний", true, 19, false,
                88, 49);
        Student student6 = new Student("Наташа", "Нігайчук", true, 19, false,
                75, 54);
        Student student7 = new Student("Роман", "Мовченюк", true, 19, false,
                90, 103);
        Student student8 = new Student("Андрій", "Макаренко", true, 19, false,
                67, 12);
        Student student9 = new Student("Станіслав", "Гуменюк", true, 19, false,
                90, 41);
        Student student10 = new Student("Андрій", "Нігайчук", true, 20, false,
                75, 43);
        Student student11 = new Student("Максим", "Гурів", true, 18, false,
                55, 43);
        Student student12 = new Student("Богдан", "Нігайчук", true, 18, false,
                70, 43);

        Group group = new Group(343);
        try {
            group.addStudentToGroup(student1);
            group.addStudentToGroup(student2);
            group.addStudentToGroup(student3);
            group.addStudentToGroup(student4);
            group.addStudentToGroup(student5);
            group.addStudentToGroup(student6);
            group.addStudentToGroup(student7);
            group.addStudentToGroup(student8);
            group.addStudentToGroup(student9);
            group.addStudentToGroup(student10);
            group.addStudentToGroup(student12);


        } catch (ArrayIsFullException e){
            System.out.println("This Array is already full");
        }

        System.out.println();
        group.deleteStudentFromGroup(student2);
        group.deleteStudentFromGroup(student5);
        group.deleteStudentFromGroup(student7);
        group.deleteStudentFromGroup(student11);
        System.out.println();

        try {
            group.addStudentToGroup(student12);
        } catch (ArrayIsFullException e){
            System.out.println("This Array is already full");
        }

        group.deleteStudentFromGroup(student3);

        try {
            group.addStudentToGroup(student2);
        } catch (ArrayIsFullException e){
            System.out.println("This Array is already full");
        }
        System.out.println(group.getStudentByLastName("Піцул"));
        System.out.println(group.toString());

        System.out.println(group.getStudentByLastName("Гуменюк"));



    }
}
