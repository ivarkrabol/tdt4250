/**
 */
package tdt4250case;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit Reduction Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.CreditReductionCourse#getReduction <em>Reduction</em>}</li>
 *   <li>{@link tdt4250case.CreditReductionCourse#getCourse <em>Course</em>}</li>
 *   <li>{@link tdt4250case.CreditReductionCourse#getFrom <em>From</em>}</li>
 *   <li>{@link tdt4250case.CreditReductionCourse#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see tdt4250case.Tdt4250casePackage#getCreditReductionCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='toAfterFrom'"
 * @generated
 */
public interface CreditReductionCourse extends EObject {
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
	 * @see tdt4250case.Tdt4250casePackage#getCreditReductionCourse_Reduction()
	 * @model default="7.5" required="true"
	 * @generated
	 */
	float getReduction();

	/**
	 * Sets the value of the '{@link tdt4250case.CreditReductionCourse#getReduction <em>Reduction</em>}' attribute.
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
	 * @see tdt4250case.Tdt4250casePackage#getCreditReductionCourse_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link tdt4250case.CreditReductionCourse#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(Date)
	 * @see tdt4250case.Tdt4250casePackage#getCreditReductionCourse_From()
	 * @model required="true"
	 * @generated
	 */
	Date getFrom();

	/**
	 * Sets the value of the '{@link tdt4250case.CreditReductionCourse#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Date value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(Date)
	 * @see tdt4250case.Tdt4250casePackage#getCreditReductionCourse_To()
	 * @model required="true"
	 * @generated
	 */
	Date getTo();

	/**
	 * Sets the value of the '{@link tdt4250case.CreditReductionCourse#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Date value);

} // CreditReductionCourse
