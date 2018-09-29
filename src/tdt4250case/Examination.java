/**
 */
package tdt4250case;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.Examination#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see tdt4250case.Tdt4250casePackage#getExamination()
 * @model
 * @generated
 */
public interface Examination extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250case.ExaminationActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see tdt4250case.Tdt4250casePackage#getExamination_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExaminationActivity> getActivity();

} // Examination
