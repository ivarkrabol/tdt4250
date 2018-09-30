/**
 */
package tdt4250case;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.CourseWork#getHours <em>Hours</em>}</li>
 *   <li>{@link tdt4250case.CourseWork#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see tdt4250case.Tdt4250casePackage#getCourseWork()
 * @model
 * @generated
 */
public interface CourseWork extends EObject {
	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see #setHours(int)
	 * @see tdt4250case.Tdt4250casePackage#getCourseWork_Hours()
	 * @model required="true"
	 * @generated
	 */
	int getHours();

	/**
	 * Sets the value of the '{@link tdt4250case.CourseWork#getHours <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours</em>' attribute.
	 * @see #getHours()
	 * @generated
	 */
	void setHours(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see tdt4250case.Tdt4250casePackage#getCourseWork_Type()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link tdt4250case.CourseWork#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // CourseWork
