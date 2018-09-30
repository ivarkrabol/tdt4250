/**
 */
package tdt4250case;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.Course#getStudyprogram <em>Studyprogram</em>}</li>
 *   <li>{@link tdt4250case.Course#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250case.Course#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250case.Course#getContent <em>Content</em>}</li>
 *   <li>{@link tdt4250case.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250case.Course#getRequiredCourse <em>Required Course</em>}</li>
 *   <li>{@link tdt4250case.Course#getRecommendedCourse <em>Recommended Course</em>}</li>
 *   <li>{@link tdt4250case.Course#getCreditReductionCourse <em>Credit Reduction Course</em>}</li>
 *   <li>{@link tdt4250case.Course#getInstance <em>Instance</em>}</li>
 *   <li>{@link tdt4250case.Course#getCourseWork <em>Course Work</em>}</li>
 * </ul>
 *
 * @see tdt4250case.Tdt4250casePackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Studyprogram</b></em>' reference list.
	 * The list contents are of type {@link tdt4250case.Studyprogram}.
	 * It is bidirectional and its opposite is '{@link tdt4250case.Studyprogram#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Studyprogram</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyprogram</em>' reference list.
	 * @see tdt4250case.Tdt4250casePackage#getCourse_Studyprogram()
	 * @see tdt4250case.Studyprogram#getCourse
	 * @model opposite="course"
	 * @generated
	 */
	EList<Studyprogram> getStudyprogram();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tdt4250case.Tdt4250casePackage#getCourse_Code()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250case.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250case.Tdt4250casePackage#getCourse_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250case.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see tdt4250case.Tdt4250casePackage#getCourse_Content()
	 * @model required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link tdt4250case.Course#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * The default value is <code>"7.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see tdt4250case.Tdt4250casePackage#getCourse_Credits()
	 * @model default="7.5" required="true"
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link tdt4250case.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Required Course</b></em>' reference list.
	 * The list contents are of type {@link tdt4250case.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Course</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Course</em>' reference list.
	 * @see tdt4250case.Tdt4250casePackage#getCourse_RequiredCourse()
	 * @model
	 * @generated
	 */
	EList<Course> getRequiredCourse();

	/**
	 * Returns the value of the '<em><b>Recommended Course</b></em>' reference list.
	 * The list contents are of type {@link tdt4250case.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommended Course</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Course</em>' reference list.
	 * @see tdt4250case.Tdt4250casePackage#getCourse_RecommendedCourse()
	 * @model
	 * @generated
	 */
	EList<Course> getRecommendedCourse();

	/**
	 * Returns the value of the '<em><b>Credit Reduction Course</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250case.CreditReductionCourse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Reduction Course</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Reduction Course</em>' containment reference list.
	 * @see tdt4250case.Tdt4250casePackage#getCourse_CreditReductionCourse()
	 * @model containment="true"
	 * @generated
	 */
	EList<CreditReductionCourse> getCreditReductionCourse();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250case.CourseInstance}.
	 * It is bidirectional and its opposite is '{@link tdt4250case.CourseInstance#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see tdt4250case.Tdt4250casePackage#getCourse_Instance()
	 * @see tdt4250case.CourseInstance#getCourse
	 * @model opposite="course" containment="true"
	 * @generated
	 */
	EList<CourseInstance> getInstance();

	/**
	 * Returns the value of the '<em><b>Course Work</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250case.CourseWork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Work</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Work</em>' containment reference list.
	 * @see tdt4250case.Tdt4250casePackage#getCourse_CourseWork()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CourseWork> getCourseWork();

} // Course
