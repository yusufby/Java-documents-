package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fb06 {
    public static void main(String[] args) {

        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Autumn", "English Night", 93, 144);

//        System.out.println(courseTurkishDay);
        // in functional programming , we use list
        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
//        System.out.println(coursesList);

        System.out.println(checkAverageScoreGreaterThanGivenNumber(coursesList, 99));
        System.out.println(checkIfAnyCourseNameContainGivenWord(coursesList, "Spanish"));
        System.out.println(getCourseNameWhoseAvgIsTheHighest(coursesList));
        System.out.println(getCourseNameGiven(coursesList,3L));
    }

    //1)Create a method to check if all average scores are greater than given number
    public static boolean checkAverageScoreGreaterThanGivenNumber(List<Courses> list, double num) {
        return list.stream().allMatch(t -> t.getAverageScore() > num);
    }

    //2)Create a method to check if at least one of the course names contains “Turkish” word
    public static boolean checkIfAnyCourseNameContainGivenWord(List<Courses> list, String word) {
        return list.stream().anyMatch(t -> t.getCourseName().contains(word));
    }

    //3) create a method to print the course whose average score is the highest

    public static String getCourseNameWhoseAvgIsTheHighest(List<Courses> list) {
        Courses obj = list.stream().
                sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get();

        return obj.getCourseName();

    }
    //Sort the list elements according to the average score in ascending order and skip first given elements
    public static List<Courses> getCourseNameGiven(List<Courses> list, Long num) {
       return list.stream().
               sorted(Comparator.comparing(Courses::getAverageScore)).//it puts the elements in ascending order
               skip(num).
               collect(Collectors.toList());//IT CONVERTS INTO THE LIST
    }
    // Sort the list elements according to the average score in ascending order and print just given one
        public static List<Courses> getTheGivenInAscendingOrder01(List<Courses> list , int num){
        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num-1).
                limit(1).collect(Collectors.toList());
        }

        //2.way
        public static Courses getTheGivenInAscendingOrder02(List<Courses> list , int num){
            return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).findFirst().get();
        }


}


