/**
 */
package tdt4250case;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Studyprogram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.Studyprogram#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250case.Studyprogram#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see tdt4250case.Tdt4250casePackage#getStudyprogram()
 * @model
 * @generated
 */
public interface Studyprogram extends EObject {
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
	 * @see tdt4250case.Tdt4250casePackage#getStudyprogram_Code()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250case.Studyprogram#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference list.
	 * The list contents are of type {@link tdt4250case.Course}.
	 * It is bidirectional and its opposite is '{@link tdt4250case.Course#getStudyprogram <em>Studyprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference list.
	 * @see tdt4250case.Tdt4250casePackage#getStudyprogram_Course()
	 * @see tdt4250case.Course#getStudyprogram
	 * @model opposite="studyprogram"
	 * @generated
	 */
	EList<Course> getCourse();

} // Studyprogram
