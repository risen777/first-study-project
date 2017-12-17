package study_center;

import study_center.persons.Student;
import study_center.reports.LongReport;
import study_center.reports.Report;
import study_center.reports.ShortReport;

public class StudyCenter {
    public static void main(String[] args) {
    Student ivan=new Student("Ivan","Ivanov");
    Course java=new Course("Java",16);
    Course js=new Course("JavaScript",10);
Program program=new Program("12/07/2017 10:00","Programing");
Course courses[]=new Course[]{java,js};
program.addCoursesToProgram(courses);
ivan.setSudentsProgram(program);
program.calculateProgramEndDate();
        System.out.println("------------Short report---------");
        Report shortReport = new ShortReport();
        shortReport.showReportForStudent(ivan);
        System.out.println("------------Long report---------");
        Report longReport = new LongReport();
        longReport.showReportForStudent(ivan);


    }
}
