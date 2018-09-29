/**
 */
package tdt4250case;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Credit Reduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.CourseCreditReduction#getReduction <em>Reduction</em>}</li>
 *   <li>{@link tdt4250case.CourseCreditReduction#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see tdt4250case.Tdt4250casePackage#getCourseCreditReduction()
 * @model
 * @generated
 */
public interface CourseCreditReduction extends EObject {
	/**
	 * Returns the value of the '<em><b>Reduction</b></em>' attribute.
	 * The default value is <code>"7.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reduction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction</em>' attribute.
	 * @see #setReduction(float)
	 * @see tdt4250case.Tdt4250casePackage#getCourseCreditReduction_Reduction()
	 * @model default="7.5" required="true"
	 * @generated
	 */
	float getReduction();

	/**
	 * Sets the value of the '{@link tdt4250case.CourseCreditReduction#getReduction <em>Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduction</em>' attribute.
	 * @see #getReduction()
	 * @generated
	 */
	void setReduction(float value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see tdt4250case.Tdt4250casePackage#getCourseCreditReduction_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link tdt4250case.CourseCreditReduction#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // CourseCreditReduction
