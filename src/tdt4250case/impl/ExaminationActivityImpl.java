/**
 */
package tdt4250case.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250case.ExaminationActivity;
import tdt4250case.Tdt4250casePackage;

import tdt4250case.util.ExaminationActivityWeight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Examination Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.impl.ExaminationActivityImpl#getEvaluationForm <em>Evaluation Form</em>}</li>
 *   <li>{@link tdt4250case.impl.ExaminationActivityImpl#getWeighting <em>Weighting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExaminationActivityImpl extends MinimalEObjectImpl.Container implements ExaminationActivity {
	/**
	 * The default value of the '{@link #getEvaluationForm() <em>Evaluation Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationForm()
	 * @generated
	 * @ordered
	 */
	protected static final String EVALUATION_FORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvaluationForm() <em>Evaluation Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationForm()
	 * @generated
	 * @ordered
	 */
	protected String evaluationForm = EVALUATION_FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeighting() <em>Weighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeighting()
	 * @generated
	 * @ordered
	 */
	protected static final ExaminationActivityWeight WEIGHTING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeighting() <em>Weighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeighting()
	 * @generated
	 * @ordered
	 */
	protected ExaminationActivityWeight weighting = WEIGHTING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExaminationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tdt4250casePackage.Literals.EXAMINATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvaluationForm() {
		return evaluationForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationForm(String newEvaluationForm) {
		String oldEvaluationForm = evaluationForm;
		evaluationForm = newEvaluationForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Tdt4250casePackage.EXAMINATION_ACTIVITY__EVALUATION_FORM, oldEvaluationForm, evaluationForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExaminationActivityWeight getWeighting() {
		return weighting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeighting(ExaminationActivityWeight newWeighting) {
		ExaminationActivityWeight oldWeighting = weighting;
		weighting = newWeighting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.EXAMINATION_ACTIVITY__WEIGHTING,
					oldWeighting, weighting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tdt4250casePackage.EXAMINATION_ACTIVITY__EVALUATION_FORM:
			return getEvaluationForm();
		case Tdt4250casePackage.EXAMINATION_ACTIVITY__WEIGHTING:
			return getWeighting();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Tdt4250casePackage.EXAMINATION_ACTIVITY__EVALUATION_FORM:
			setEvaluationForm((String) newValue);
			return;
		case Tdt4250casePackage.EXAMINATION_ACTIVITY__WEIGHTING:
			setWeighting((ExaminationActivityWeight) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Tdt4250casePackage.EXAMINATION_ACTIVITY__EVALUATION_FORM:
			setEvaluationForm(EVALUATION_FORM_EDEFAULT);
			return;
		case Tdt4250casePackage.EXAMINATION_ACTIVITY__WEIGHTING:
			setWeighting(WEIGHTING_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Tdt4250casePackage.EXAMINATION_ACTIVITY__EVALUATION_FORM:
			return EVALUATION_FORM_EDEFAULT == null ? evaluationForm != null
					: !EVALUATION_FORM_EDEFAULT.equals(evaluationForm);
		case Tdt4250casePackage.EXAMINATION_ACTIVITY__WEIGHTING:
			return WEIGHTING_EDEFAULT == null ? weighting != null : !WEIGHTING_EDEFAULT.equals(weighting);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (evaluationForm: ");
		result.append(evaluationForm);
		result.append(", weighting: ");
		result.append(weighting);
		result.append(')');
		return result.toString();
	}

} //ExaminationActivityImpl
