/**
 */
package tdt4250case;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tdt4250case.Tdt4250casePackage
 * @generated
 */
public interface Tdt4250caseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tdt4250caseFactory eINSTANCE = tdt4250case.impl.Tdt4250caseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Course Credit Reduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Credit Reduction</em>'.
	 * @generated
	 */
	CourseCreditReduction createCourseCreditReduction();

	/**
	 * Returns a new object of class '<em>Studyprogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Studyprogram</em>'.
	 * @generated
	 */
	Studyprogram createStudyprogram();

	/**
	 * Returns a new object of class '<em>Course Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Instance</em>'.
	 * @generated
	 */
	CourseInstance createCourseInstance();

	/**
	 * Returns a new object of class '<em>Examination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Examination</em>'.
	 * @generated
	 */
	Examination createExamination();

	/**
	 * Returns a new object of class '<em>Examination Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Examination Activity</em>'.
	 * @generated
	 */
	ExaminationActivity createExaminationActivity();

	/**
	 * Returns a new object of class '<em>Timetable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timetable</em>'.
	 * @generated
	 */
	Timetable createTimetable();

	/**
	 * Returns a new object of class '<em>Scheduled Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduled Activity</em>'.
	 * @generated
	 */
	ScheduledActivity createScheduledActivity();

	/**
	 * Returns a new object of class '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Department</em>'.
	 * @generated
	 */
	Department createDepartment();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Course Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Role</em>'.
	 * @generated
	 */
	CourseRole createCourseRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Tdt4250casePackage getTdt4250casePackage();

} //Tdt4250caseFactory
