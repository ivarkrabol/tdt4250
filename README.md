# tdt4250case

## Course
This class represents the static course information. It holds static data, as well as references to other courses that are required or recommended. It contains three types of objects:

- **CourseWork** objects, which represent how many hours of a type of course work activity is done per week;
- **CreditReductionCourse** objects, which represent credit reductions for various courses, as well as wehn the courses have had to be taken; and
- **CourseIntance** objects, which represent the information that varies with each semester of a course being held.

## CourseInstance
This class represents the information that varies with each semester of a course being held, such as which department is responsible for it and who coordinates it. It contains three types of objects:

- **CourseRole** objects, which represent a role relating to a course, and who holds that role;
- an **Examination** object, which manages a list of **ExaminationActivity** objects, representing the ways in which the course is evaluated, eaching having a weighting, the sum of which makes 100; and
- a **Timetable** object, which manages a list of **ScheduledActivity** objects, representing the course work activities scheduled for the course.

## ScheduledActivity
This class represents the course work activities scheduled for the course, with information on when and where it occurs, and for which study programs they are reserved. 

## Studyprogram
This class represents a study program.

## Department
This class represent one of the departments at Ntnu. It contains **Person** objects, representing the employees of that department.

