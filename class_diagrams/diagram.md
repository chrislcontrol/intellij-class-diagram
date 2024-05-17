classDiagram
direction BT
class ConsultClassUseCase {
  + execute(Course) List~Enrollment~
}
class ConsultEnrollmentsUseCase {
  + execute(Student) List~Enrollment~
}
class Contact {
  - Long id
  - String value
  - Person person
   Person person
   Long id
   String value
}
class ContactRepository
class Course {
  - Long id
  - String name
  - String schedule
  - Date endsAt
  - Date beginAt
  - Teacher teacher
   String name
   Teacher teacher
   Date endsAt
   String schedule
   Date beginAt
   Long id
}
class CourseRepository
class CreateUserUseCase {
  + execute(String, String) User
}
class EnrollUserInCourseUseCase {
  + execute(Student, Course) Enrollment
}
class Enrollment {
  - Date startedAt
  - Long id
  - Course course
  - Student student
   Student student
   Course course
   Date startedAt
   Long id
}
class EnrollmentRepository {
  + listByCourse(Course) List~Enrollment~
  + findByStudent(Student) List~Enrollment~
}
class Entity {
<<Interface>>

}
class LoginUseCase {
  + execute(String, String) User
}
class Main {
  + main(String[]) void
}
class Person {
  - Date birthdate
  - Long id
  - User user
  - String name
   String name
   Long id
   Date birthdate
   User user
}
class PersonRepository
class RegisterCourseUseCase {
  + execute(String, String, Date, Date, Teacher) Course
}
class RegisterPersonUseCase {
  + execute(Date, User, String, List~Contact~) Person
}
class RegisterStudentUseCase {
  + execute(Person, String) Student
}
class RegisterTeacherUseCase {
  + execute(Person) Teacher
}
class Repository~EntityImplementation~ {
  + create(EntityImplementation) EntityImplementation
  + getOrCreate(EntityImplementation, String[]) boolean
  + delete(EntityImplementation) EntityImplementation
  + update(EntityImplementation) EntityImplementation
  + listAll() List~EntityImplementation~
  + findById() EntityImplementation
}
class Student {
  - Person person
  - Long id
  - String guardianName
   Person person
   Long id
   String guardianName
}
class StudentRepository
class Teacher {
  - Person person
  - Long id
   Person person
   Long id
}
class TeacherRepository
class User {
  - String password
  - Long id
  - String username
   String password
   Teacher teacher
   String username
   Long id
}
class UserRepository {
  + findByUsernameAndPassword(String, String) User
}

ConsultClassUseCase "1" *--> "enrollmentRepository 1" EnrollmentRepository 
ConsultClassUseCase  ..>  EnrollmentRepository : «create»
ConsultEnrollmentsUseCase "1" *--> "enrollmentRepository 1" EnrollmentRepository 
Contact  ..>  Entity 
Contact "1" *--> "person 1" Person 
ContactRepository  -->  Repository~EntityImplementation~ 
Course  ..>  Entity 
Course "1" *--> "teacher 1" Teacher 
CourseRepository  -->  Repository~EntityImplementation~ 
CreateUserUseCase  ..>  User : «create»
CreateUserUseCase "1" *--> "userRepository 1" UserRepository 
CreateUserUseCase  ..>  UserRepository : «create»
EnrollUserInCourseUseCase  ..>  Enrollment : «create»
EnrollUserInCourseUseCase "1" *--> "enrollmentRepository 1" EnrollmentRepository 
EnrollUserInCourseUseCase  ..>  EnrollmentRepository : «create»
Enrollment "1" *--> "course 1" Course 
Enrollment  ..>  Entity 
Enrollment "1" *--> "student 1" Student 
EnrollmentRepository  -->  Repository~EntityImplementation~ 
LoginUseCase "1" *--> "userRepository 1" UserRepository 
LoginUseCase  ..>  UserRepository : «create»
Main  ..>  ConsultClassUseCase : «create»
Main  ..>  ConsultEnrollmentsUseCase : «create»
Main  ..>  CreateUserUseCase : «create»
Main  ..>  EnrollUserInCourseUseCase : «create»
Main  ..>  LoginUseCase : «create»
Main  ..>  RegisterCourseUseCase : «create»
Main  ..>  RegisterPersonUseCase : «create»
Main  ..>  RegisterStudentUseCase : «create»
Main  ..>  RegisterTeacherUseCase : «create»
Person  ..>  Entity 
Person "1" *--> "user 1" User 
PersonRepository  -->  Repository~EntityImplementation~ 
RegisterCourseUseCase  ..>  Course : «create»
RegisterCourseUseCase "1" *--> "courseRepository 1" CourseRepository 
RegisterCourseUseCase  ..>  CourseRepository : «create»
RegisterPersonUseCase  ..>  ContactRepository : «create»
RegisterPersonUseCase "1" *--> "contactRepository 1" ContactRepository 
RegisterPersonUseCase  ..>  Person : «create»
RegisterPersonUseCase "1" *--> "personRepository 1" PersonRepository 
RegisterPersonUseCase  ..>  PersonRepository : «create»
RegisterStudentUseCase  ..>  Student : «create»
RegisterStudentUseCase  ..>  StudentRepository : «create»
RegisterStudentUseCase "1" *--> "studentRepository 1" StudentRepository 
RegisterTeacherUseCase  ..>  Teacher : «create»
RegisterTeacherUseCase  ..>  TeacherRepository : «create»
RegisterTeacherUseCase "1" *--> "teacherRepository 1" TeacherRepository 
Repository~EntityImplementation~  ..>  Entity 
Student  ..>  Entity 
Student "1" *--> "person 1" Person 
StudentRepository  -->  Repository~EntityImplementation~ 
Teacher  ..>  Entity 
Teacher "1" *--> "person 1" Person 
TeacherRepository  -->  Repository~EntityImplementation~ 
User  ..>  Entity 
UserRepository  -->  Repository~EntityImplementation~ 
