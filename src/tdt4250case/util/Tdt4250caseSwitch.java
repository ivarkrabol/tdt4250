/**
 */
package tdt4250case.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tdt4250case.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tdt4250case.Tdt4250casePackage
 * @generated
 */
public class Tdt4250caseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Tdt4250casePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tdt4250caseSwitch() {
		if (modelPackage == null) {
			modelPackage = Tdt4250casePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Tdt4250casePackage.COURSE: {
			Course course = (Course) theEObject;
			T result = caseCourse(course);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tdt4250casePackage.COURSE_CREDIT_REDUCTION: {
			CourseCreditReduction courseCreditReduction = (CourseCreditReduction) theEObject;
			T result = caseCourseCreditReduction(courseCreditReduction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tdt4250casePackage.STUDYPROGRAM: {
			Studyprogram studyprogram = (Studyprogram) theEObject;
			T result = caseStudyprogram(studyprogram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tdt4250casePackage.COURSE_INSTANCE: {
			CourseInstance courseInstance = (CourseInstance) theEObject;
			T result = caseCourseInstance(courseInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tdt4250casePackage.EXAMINATION: {
			Examination examination = (Examination) theEObject;
			T result = caseExamination(examination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tdt4250casePackage.EXAMINATION_ACTIVITY: {
			ExaminationActivity examinationActivity = (ExaminationActivity) theEObject;
			T result = caseExaminationActivity(examinationActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tdt4250casePackage.TIMETABLE: {
			Timetable timetable = (Timetable) theEObject;
			T result = caseTimetable(timetable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tdt4250casePackage.SCHEDULED_ACTIVITY: {
			ScheduledActivity scheduledActivity = (ScheduledActivity) theEObject;
			T result = caseScheduledActivity(scheduledActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tdt4250casePackage.DEPARTMENT: {
			Department department = (Department) theEObject;
			T result = caseDepartment(department);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tdt4250casePackage.PERSON: {
			Person person = (Person) theEObject;
			T result = casePerson(person);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tdt4250casePackage.COURSE_ROLE: {
			CourseRole courseRole = (CourseRole) theEObject;
			T result = caseCourseRole(courseRole);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourse(Course object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Credit Reduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Credit Reduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseCreditReduction(CourseCreditReduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Studyprogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Studyprogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyprogram(Studyprogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseInstance(CourseInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExamination(Examination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examination Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examination Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExaminationActivity(ExaminationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timetable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timetable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimetable(Timetable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduled Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduled Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduledActivity(ScheduledActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Department</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepartment(Department object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseRole(CourseRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Tdt4250caseSwitch
