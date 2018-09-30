/**
 */
package tdt4250case;

import org.eclipse.emf.ecore.EObject;

import tdt4250case.util.ExaminationActivityWeight;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examination Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.ExaminationActivity#getEvaluationForm <em>Evaluation Form</em>}</li>
 *   <li>{@link tdt4250case.ExaminationActivity#getWeighting <em>Weighting</em>}</li>
 * </ul>
 *
 * @see tdt4250case.Tdt4250casePackage#getExaminationActivity()
 * @model
 * @generated
 */
public interface ExaminationActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluation Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Form</em>' attribute.
	 * @see #setEvaluationForm(String)
	 * @see tdt4250case.Tdt4250casePackage#getExaminationActivity_EvaluationForm()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getEvaluationForm();

	/**
	 * Sets the value of the '{@link tdt4250case.ExaminationActivity#getEvaluationForm <em>Evaluation Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Form</em>' attribute.
	 * @see #getEvaluationForm()
	 * @generated
	 */
	void setEvaluationForm(String value);

	/**
	 * Returns the value of the '<em><b>Weighting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weighting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weighting</em>' attribute.
	 * @see #setWeighting(ExaminationActivityWeight)
	 * @see tdt4250case.Tdt4250casePackage#getExaminationActivity_Weighting()
	 * @model dataType="tdt4250case.ExaminationActivityWeight" required="true"
	 * @generated
	 */
	ExaminationActivityWeight getWeighting();

	/**
	 * Sets the value of the '{@link tdt4250case.ExaminationActivity#getWeighting <em>Weighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weighting</em>' attribute.
	 * @see #getWeighting()
	 * @generated
	 */
	void setWeighting(ExaminationActivityWeight value);

} // ExaminationActivity
