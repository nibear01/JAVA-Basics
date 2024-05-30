public class LogicalOperator {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isTeacher = false;

        System.out.println(isStudent && isTeacher);  //AND operator
        System.out.println(isStudent || isTeacher);  //Or operator
        System.out.println(!isTeacher);  //Not operator
    }
}
