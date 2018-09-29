/**
 */
package tdt4250case;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tdt4250case.util.Semester;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.CourseInstance#getSemester <em>Semester</em>}</li>
 *   <li>{@link tdt4250case.CourseInstance#getExamination <em>Examination</em>}</li>
 *   <li>{@link tdt4250case.CourseInstance#getTimetable <em>Timetable</em>}</li>
 *   <li>{@link tdt4250case.CourseInstance#getResponsibleDepartment <em>Responsible Department</em>}</li>
 *   <li>{@link tdt4250case.CourseInstance#getRole <em>Role</em>}</li>
 *   <li>{@link tdt4250case.CourseInstance#getCourseCoordinator <em>Course Coordinator</em>}</li>
 *   <li>{@link tdt4250case.CourseInstance#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see tdt4250case.Tdt4250casePackage#getCourseInstance()
 * @model
 * @generated
 */
public interface CourseInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semester</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see #setSemester(Semester)
	 * @see tdt4250case.Tdt4250casePackage#getCourseInstance_Semester()
	 * @model dataType="tdt4250case.Semester"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link tdt4250case.CourseInstance#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Examination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examination</em>' reference.
	 * @see #setExamination(Examination)
	 * @see tdt4250case.Tdt4250casePackage#getCourseInstance_Examination()
	 * @model required="true"
	 * @generated
	 */
	Examination getExamination();

	/**
	 * Sets the value of the '{@link tdt4250case.CourseInstance#getExamination <em>Examination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examination</em>' reference.
	 * @see #getExamination()
	 * @generated
	 */
	void setExamination(Examination value);

	/**
	 * Returns the value of the '<em><b>Timetable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timetable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timetable</em>' reference.
	 * @see #setTimetable(Timetable)
	 * @see tdt4250case.Tdt4250casePackage#getCourseInstance_Timetable()
	 * @model required="true"
	 * @generated
	 */
	Timetable getTimetable();

	/**
	 * Sets the value of the '{@link tdt4250case.CourseInstance#getTimetable <em>Timetable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timetable</em>' reference.
	 * @see #getTimetable()
	 * @generated
	 */
	void setTimetable(Timetable value);

	/**
	 * Returns the value of the '<em><b>Responsible Department</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Department</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Department</em>' reference.
	 * @see #setResponsibleDepartment(Department)
	 * @see tdt4250case.Tdt4250casePackage#getCourseInstance_ResponsibleDepartment()
	 * @model required="true"
	 * @generated
	 */
	Department getResponsibleDepartment();

	/**
	 * Sets the value of the '{@link tdt4250case.CourseInstance#getResponsibleDepartment <em>Responsible Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Department</em>' reference.
	 * @see #getResponsibleDepartment()
	 * @generated
	 */
	void setResponsibleDepartment(Department value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250case.CourseRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see tdt4250case.Tdt4250casePackage#getCourseInstance_Role()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseRole> getRole();

	/**
	 * Returns the value of the '<em><b>Course Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Coordinator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Coordinator</em>' reference.
	 * @see #setCourseCoordinator(Person)
	 * @see tdt4250case.Tdt4250casePackage#getCourseInstance_CourseCoordinator()
	 * @model derived="true"
	 * @generated
	 */
	Person getCourseCoordinator();

	/**
	 * Sets the value of the '{@link tdt4250case.CourseInstance#getCourseCoordinator <em>Course Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Coordinator</em>' reference.
	 * @see #getCourseCoordinator()
	 * @generated
	 */
	void setCourseCoordinator(Person value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250case.Course#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' container reference.
	 * @see #setCourse(Course)
	 * @see tdt4250case.Tdt4250casePackage#getCourseInstance_Course()
	 * @see tdt4250case.Course#getInstance
	 * @model opposite="instance" required="true" transient="false"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link tdt4250case.CourseInstance#getCourse <em>Course</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' container reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // CourseInstance
